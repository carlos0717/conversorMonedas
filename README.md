# Conversor de Moneda

Este proyecto es un conversor de monedas desarrollado en Java que permite realizar conversiones entre diferentes divisas utilizando tasas de cambio en tiempo real obtenidas a través de una API externa.

## Descripción del Proyecto

El Conversor de Moneda es una aplicación de consola que permite a los usuarios convertir entre las siguientes monedas:
- Dólar estadounidense (USD)
- Peso Argentino (ARS)
- Real Brasileño (BRL)
- Peso Colombiano (COP)

La aplicación utiliza la API de ExchangeRate para obtener las tasas de cambio actualizadas, lo que garantiza que las conversiones sean precisas y reflejen los valores del mercado en tiempo real.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal
- **GSON**: Biblioteca para el manejo de JSON
- **HttpClient**: Para realizar peticiones HTTP a la API externa
- **Scanner**: Para la interacción con el usuario a través de la consola
- **ExchangeRate API**: API externa para obtener las tasas de cambio actualizadas

## Estructura del Proyecto

El proyecto está organizado en el siguiente paquete:
- `lad.com.alura.conversormoneda`: Contiene las clases principales del proyecto

Las clases principales son:
- `ConversorApp.java`: Clase principal que contiene el método `main` y la lógica para obtener las tasas de cambio de la API
- `Conversor.java`: Contiene la lógica del menú de usuario y los métodos de conversión para cada par de monedas

## Cómo Ejecutar la Aplicación

1. Asegúrate de tener instalado Java en tu sistema
2. Clona o descarga este repositorio
3. Abre el proyecto en tu IDE favorito (IntelliJ IDEA, Eclipse, etc.)
4. Ejecuta la clase `ConversorApp.java`
5. Sigue las instrucciones en la consola para realizar las conversiones deseadas

## Funcionalidades

La aplicación ofrece las siguientes opciones de conversión:
1. Dólar a Peso Argentino
2. Peso Argentino a Dólar
3. Dólar a Real Brasileño
4. Real Brasileño a Dólar
5. Dólar a Peso Colombiano
6. Peso Colombiano a Dólar
7. Salir de la aplicación

## Cómo se Desarrolló el Proyecto

El desarrollo del proyecto siguió estos pasos:

1. **Planificación**: Se definieron los requisitos y las funcionalidades necesarias para el conversor de moneda.

2. **Diseño de la Estructura**: Se diseñó la estructura del proyecto, definiendo las clases necesarias y sus responsabilidades.

3. **Implementación de la Interfaz de Usuario**: Se desarrolló el menú de consola que permite al usuario interactuar con la aplicación.

4. **Integración con API Externa**: Se implementó la conexión con la API de ExchangeRate para obtener las tasas de cambio en tiempo real.

5. **Implementación de la Lógica de Conversión**: Se desarrollaron los métodos para realizar las conversiones entre las diferentes monedas.

6. **Manejo de Errores**: Se implementó un sistema de manejo de excepciones para garantizar que la aplicación sea robusta y pueda manejar situaciones inesperadas.

7. **Pruebas**: Se realizaron pruebas para verificar que todas las funcionalidades trabajen correctamente.

## Consideraciones Técnicas

- La aplicación utiliza un API key para acceder a la API de ExchangeRate. En un entorno de producción, esta clave debería estar protegida y no incluida directamente en el código fuente.
- La aplicación maneja excepciones para proporcionar mensajes de error claros al usuario en caso de problemas con la API o entradas inválidas.
- El proyecto está estructurado de manera que sea fácil agregar nuevas monedas o funcionalidades en el futuro.

## Autor

Este proyecto fue desarrollado como parte del curso de Java de Alura Latam.