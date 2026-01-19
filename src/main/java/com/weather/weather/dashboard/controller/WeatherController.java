package com.weather.weather.dashboard.controller;

import com.weather.weather.dashboard.dto.WeatherResponseDTO;
import com.weather.weather.dashboard.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherResponseDTO getWeather(@RequestParam String city){
        return weatherService.getWeatherForCity(city);
    }
}
