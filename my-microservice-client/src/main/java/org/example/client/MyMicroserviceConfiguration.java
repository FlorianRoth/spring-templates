package org.example.client;

import org.example.client.feign.FeignClientConfiguration;
import org.example.client.resttemplate.RestTemplateClientConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FeignClientConfiguration.class, RestTemplateClientConfiguration.class})
public class MyMicroserviceConfiguration {
}
