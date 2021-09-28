package org.example.client.resttemplate;

import org.example.client.resttemplate.api.HelloWorldResourceApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestTemplateClientConfiguration {

    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }

    @Bean
    public HelloWorldResourceApi helloWorldResourceApi(ApiClient apiClient) {
        return new HelloWorldResourceApi(apiClient);
    }
}
