package com.java.ecommerce.sharedlibrary.helpers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestTemplateResponse<T> {
    private HttpStatusCode statusCode;
    private T body;
}
