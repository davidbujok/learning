package com.practice_app_314.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CountriesController {

    @GetMapping(value = "/countries")
    public List<Object> getCountries() {
        String url = "https://restcountries.com/v3.1/all";

        Object[] countries = restTemplate.getForObject(url, Object[].class);

        return Arrays.asList(countries);
        public Mono<String> fetchDataFromApi() {
            return webClient
                    .get()
                    .uri("/endpoint") // The API endpoint you want to call
                    .retrieve()
                    .bodyToMono(String.class);
        }
    }
}
