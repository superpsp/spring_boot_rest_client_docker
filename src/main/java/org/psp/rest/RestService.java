package org.psp.rest;

import org.springframework.web.client.RestClient;

public class RestService {
    private final RestClient restClient;

    public RestService(String baseUrl) {
        RestClient.Builder builder = RestClient.builder();
        this.restClient = builder.baseUrl(baseUrl).build();
    }

    public RestClient getRestClient() {
        return restClient;
    }

    public String getResponse(String uri) {
        return restClient.get().uri(uri).retrieve().body(String.class);
    }
}
