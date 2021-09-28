package org.example.client;

import org.example.client.feign.FeignClientConfiguration;
import org.example.client.resttemplate.RestTemplateClientConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// Using @Import instead of @ComponentScan to have more control over what is picked up
@Import({
        FeignClientConfiguration.class,
        RestTemplateClientConfiguration.class
})
public class MyMicroserviceConfiguration {
}
