package org.example.client.feign;

import org.example.api.boundary.dto.Greeting;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(
        name = "helloWorld",
        url = "${my-microservice-client.url}",
        // Explicitly specify config here so that we have full control over which config is used
        configuration = ExampleFeignClientConfiguration.class)
@RequestMapping("/api/v1")
public interface ExampleFeignClient {

    @GetMapping("/greeting")
    Greeting helloWorld();
}
