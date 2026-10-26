package org.psp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestClientApplication {
    public static final String BASE_PROTOCOL = "http";
    public static final String BASE_HOST = "localhost";
    public static final int BASE_PORT = 8080;
    public static final String PROTOCOL = "http";
    public static final String HOST = "springboot-rest-service";
    public static final int PORT = 8080;
    public static final String URI = PROTOCOL + "://" + HOST + ":" + PORT + "/";

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestClientApplication.class, args);

        RestService service = new RestService(BASE_PROTOCOL + "://" + BASE_HOST + ":" + BASE_PORT);

        String getRequest = new String(URI + "api");
        System.out.println("Request: " + getRequest);
        System.out.println("Response:");
        System.out.println(service.getResponse(getRequest));
    }
}
