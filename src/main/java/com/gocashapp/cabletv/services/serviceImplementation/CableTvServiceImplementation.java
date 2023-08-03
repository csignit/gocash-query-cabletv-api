package com.gocashapp.cabletv.services.serviceImplementation;

import com.gocashapp.cabletv.dtos.ShowmaxTransactionStatusResponse;
import com.gocashapp.cabletv.dtos.TransactionStatusRequest;
import com.gocashapp.cabletv.dtos.ApiResponse;
import com.gocashapp.cabletv.services.CableTvService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CableTvServiceImplementation implements CableTvService {
    private final RestTemplate restTemplate;

    @PostConstruct
    public void init() {

        // Add the MappingJackson2HttpMessageConverter to the RestTemplate's message converters
        List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
        converters.add(new MappingJackson2HttpMessageConverter());
        restTemplate.setMessageConverters(converters);
    }

    @Override
    public ApiResponse queryStatus(TransactionStatusRequest transactionStatusRequest) {

        String username = "gocashsq15@gmail.com";
        String password = "Projectpassword!";
        String authToken = getAuthToken(username, password);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.add("User-Agent", "Spring's Template");
        httpHeaders.add("Authorization", "Basic " + authToken);

        HttpEntity<TransactionStatusRequest> transactionStatusRequestHttpEntity = new HttpEntity<>
                (transactionStatusRequest, httpHeaders);
        ResponseEntity<ApiResponse> responseEntity = restTemplate.postForEntity(
                "https://api-service.vtpass.com/api/requery",
                transactionStatusRequestHttpEntity,
                ApiResponse.class
        );
        return responseEntity.getBody();
    }

    @Override
    public ShowmaxTransactionStatusResponse getQueryStatus(TransactionStatusRequest transactionStatusRequest) {
        String username = "gocashsq15@gmail.com";
        String password = "Projectpassword!";
        String authToken = getAuthToken(username, password);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        httpHeaders.add("User-Agent", "Spring's Template");
        httpHeaders.add("Authorization", "Basic " + authToken);

        HttpEntity<TransactionStatusRequest> transactionStatusRequestHttpEntity = new HttpEntity<>
                (transactionStatusRequest, httpHeaders);
        ResponseEntity<ShowmaxTransactionStatusResponse> responseEntity = restTemplate.postForEntity(
                "https://api-service.vtpass.com/api/requery",
                transactionStatusRequestHttpEntity,
                ShowmaxTransactionStatusResponse.class
        );
        return responseEntity.getBody();
    }

    private String getAuthToken(String username, String password) {
        String credentials = username + ":" + password;
        byte[] credentialsBytes = credentials.getBytes(StandardCharsets.UTF_8);
        return Base64.getEncoder().encodeToString(credentialsBytes);
    }
}
