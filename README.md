# Spring Boot Weather Dashboard API

This is the backend service for the Full-Stack Weather Dashboard application. It acts as a secure proxy to the OpenWeatherMap API.

## Features

*   Exposes a single, simple endpoint (`/api/weather`) to fetch weather data for a given city.
*   Securely manages a secret OpenWeatherMap API key by storing it in server-side properties, preventing it from being exposed in a frontend client.
*   Uses Data Transfer Objects (DTOs) to map the complex external API response to a clean, simple data structure for the client.

## Technologies Used

*   Java 17
*   Spring Boot 3.x
*   Spring Web
*   Maven & Lombok

## Getting Started

To run this project locally, you will need to have its companion React frontend.

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/JunadeG/weather-dashboard-api.git
    ```
2.  **Get an API Key:**
    *   Sign up for a free account at [https://openweathermap.org/](https://openweathermap.org/) to get an API key.

3.  **Configure the Application:**
    *   Navigate to `src/main/resources/`.
    *   Create a new file named `application.properties`.
    *   Add the following content, pasting in your own API key from OpenWeatherMap.
    ```properties
    server.port=8093
    weather.api.key=YOUR_API_KEY_HERE
    ```
4.  **Run the Application:**
    *   Run the `WeatherDashboardApplication.java` file from your IDE. The server will start on port `8093`.