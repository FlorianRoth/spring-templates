package org.example.client.feign;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ExampleFeignClientConfiguration {

    @Value("${my-microservice-client.basicAuth.username}")
    private String username;
    @Value("${my-microservice-client.basicAuth.password}")
    private String password;

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(username, password);
    }
}
