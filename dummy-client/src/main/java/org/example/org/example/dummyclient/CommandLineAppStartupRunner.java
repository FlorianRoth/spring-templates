package org.example.org.example.dummyclient;

import org.example.client.feign.ExampleFeignClient;
import org.example.client.resttemplate.api.HelloWorldResourceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);

    private final ExampleFeignClient client;

    @Value("${config-name}")
    private String configName;

    public CommandLineAppStartupRunner(ExampleFeignClient client, HelloWorldResourceApi resourceApi) {
        this.client = client;
    }

    @Override
    public void run(String... args) {
        LOG.info("Using configuration '{}'", this.configName);

        try {
            var greeting = client.helloWorld();

            LOG.info("Got greeting: {}", greeting);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }
}
