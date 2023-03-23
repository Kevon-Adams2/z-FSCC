package com.example.loginDemo.Exception;

// import java.time.LocalDateTime;
// import java.util.List;

import org.springframework.http.HttpStatusCode;

// import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse {

    private String message;
    private boolean ok;
    private HttpStatusCode response;

    public ErrorResponse(HttpStatusCode response, String message, boolean ok) {
        this.message = message;
        this.response = response;
        this.ok = ok;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public HttpStatusCode getResponse() {
        return response;
    }

    public void setResponse(HttpStatusCode response) {
        this.response = response;
    }



    // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    // private LocalDateTime timestamp;
    // private List<String> message;

    // public ErrorResponse(List<String> message) {
    //     this.timestamp = LocalDateTime.now();
    //     this.message = message;
    // }

    // public LocalDateTime getTimestamp() {
    //     return this.timestamp;
    // }

    // public void setTimestamp(LocalDateTime timestamp) {
    //     this.timestamp = timestamp;
    // }

    // public List<String> getMessage() {
    //     return this.message;
    // }

    // public void setMessage(List<String> message) {
    //     this.message = message;
    // }
    

}
