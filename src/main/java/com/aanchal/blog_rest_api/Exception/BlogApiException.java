package com.aanchal.blog_rest_api.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogApiException extends RuntimeException{
    private HttpStatus status;
    private String message;

    public BlogApiException(String customMessage, HttpStatus status, String message){
        super(customMessage);
        this.status=status;
        this.message=message;
    }
}
