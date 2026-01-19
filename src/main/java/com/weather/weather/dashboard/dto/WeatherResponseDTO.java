package com.weather.weather.dashboard.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class WeatherResponseDTO {
    private String name;
    @JsonProperty("main") // Maps the "main" JSON object to this field
    private MainDetailsDTO mainDetails;
    private List<WeatherDescriptionDTO> weather;

}
