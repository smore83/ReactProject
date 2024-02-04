package com.reactpairdemo.demo.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    public String message;
    public String title;

}
