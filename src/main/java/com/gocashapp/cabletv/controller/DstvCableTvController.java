package com.gocashapp.cabletv.controller;

import com.gocashapp.cabletv.dtos.TransactionStatusRequest;
import com.gocashapp.cabletv.dtos.TransactionStatusResponse;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")

public class DstvCableTvController {
    private final RestTemplate restTemplate;

    @PostConstruct
    public void init() {
        // Add the MappingJackson2HttpMessageConverter to the RestTemplate's message converters
        List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
        converters.add(new MappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(converters);
    }

    @PostMapping("/dstvrequery")
    public ResponseEntity<TransactionStatusResponse> queryStatus(@RequestBody TransactionStatusRequest transactionStatusRequest) {

        String username = "gocashsq15@gmail.com";
        String password = "Projectpassword!";
        String authToken = getAuthToken(username, password);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.add("User-Agent", "Spring's Template");
        httpHeaders.add("Authorization", "Basic " + authToken);

        HttpEntity<TransactionStatusRequest> transactionStatusRequestHttpEntity = new HttpEntity<>
                (transactionStatusRequest, httpHeaders);

        return restTemplate.postForEntity(
                "https://api-service.vtpass.com/api/requery",
                transactionStatusRequestHttpEntity,
                TransactionStatusResponse.class
        );
    }

    private String getAuthToken(String username, String password) {
        String credentials = username + ":" + password;
        byte[] credentialsBytes = credentials.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(credentialsBytes);
    }


}
