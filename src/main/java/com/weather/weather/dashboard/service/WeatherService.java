package com.weather.weather.dashboard.service;

import com.weather.weather.dashboard.dto.WeatherResponseDTO;
import org.springframework.beans.factory.annotation.Autowired; // Add this import
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate; // Add this import

@Service
public class WeatherService {
    @Value("${weather.api.key}")
    private String apiKey;

    // We will inject the RestTemplate bean directly.
    @Autowired
    private RestTemplate restTemplate;

    // We no longer need the constructor.

    public WeatherResponseDTO getWeatherForCity(String city) {
        String url = String.format(
                "https://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=%s",
                city,
                apiKey
        );
        // Notice I added "&units=metric" to the URL. This will give us Celsius instead of Kelvin.

        return this.restTemplate.getForObject(url, WeatherResponseDTO.class);
    }
}