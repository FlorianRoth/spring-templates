package org.example.client.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients // Scans for Feign clients in the package, also enabled ComponentScan
public class FeignClientConfiguration {
}
