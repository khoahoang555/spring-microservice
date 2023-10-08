package com.java.ecommerce.sharedlibrary.helpers;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class RestTemplateHelper {

    private RestTemplateHelper() {}

    public static <T> RestTemplateResponse<T> postWithBody(String url, Map<String, String> body, Class<T> objectReturned) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<T> responseEntity = restTemplate.postForEntity(url, new HttpEntity<>(body), objectReturned);
        return new RestTemplateResponse<>(responseEntity.getStatusCode(), responseEntity.getBody());
    }
}
