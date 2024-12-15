package com.in28minutes.rest.webservices.restful_web_services.exception;

import java.time.LocalDate;
import java.util.List;

public class ErrorDetails {
    private LocalDate timestamp;
    private String message;
    private List<String> details;

    public ErrorDetails(LocalDate timestamp, String message, List<String> details) {
        this.message = message;
        this.timestamp = timestamp;
        this.details = details;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getDetails() {
        return details;
    }
}
