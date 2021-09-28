package org.example.client.resttemplate;

import org.example.client.resttemplate.api.HelloWorldResourceApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateClientConfiguration {

    @Value("${my-microservice-client.basicAuth.username}")
    private String username;
    @Value("${my-microservice-client.basicAuth.password}")
    private String password;

    @Bean
    public ApiClient apiClient() {
        var apiClient = new ApiClient();
        apiClient.setUsername(username);
        apiClient.setPassword(password);

        return apiClient;
    }

    @Bean
    public HelloWorldResourceApi helloWorldResourceApi(ApiClient apiClient) {
        return new HelloWorldResourceApi(apiClient);
    }
}
