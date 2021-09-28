package org.example.client.feign;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

// No @Configuration here!
// We don't want this class to be picked up by @ComponentScan
// Config is explicitly loaded by ExampleFeignClient's @FeignClient annotation
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
