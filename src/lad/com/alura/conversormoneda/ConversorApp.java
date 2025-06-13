package lad.com.alura.conversormoneda;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorApp {
    public static void main(String[] args) {
        Conversor.eleccionUserMenu();
    }
    public static double obtenerTasa(String urlFinal, String monedaDestino) throws IOException, InterruptedException {
        try {
            // Crear cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Crear solicitud HTTP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlFinal))
                    .GET()
                    .build();

            // Enviar solicitud y obtener respuesta
            HttpResponse<String> respuesta = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (respuesta.statusCode() != 200) {
                throw new IOException("Error en la API: Código de estado " + respuesta.statusCode());
            }

            JsonElement elemento = JsonParser.parseString(respuesta.body());
            JsonObject objectRoot = elemento.getAsJsonObject();

            if (objectRoot.has("result") && !objectRoot.get("result").getAsString().equals("success")) {
                throw new IOException("Error en la API: " + objectRoot.toString());
            }
            JsonObject conversionRates = objectRoot.getAsJsonObject("conversion_rates");

            // Verificar si la moneda destino existe
            if (!conversionRates.has(monedaDestino)) {
                throw new IOException("La moneda " + monedaDestino + " no está disponible en la API");
            }

            double tasa = conversionRates.get(monedaDestino).getAsDouble();
            return tasa;
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de conversión: " + e.getMessage());
            throw e;
        }
    }
}
