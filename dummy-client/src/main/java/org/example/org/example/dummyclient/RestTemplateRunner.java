package org.example.org.example.dummyclient;

import org.example.client.resttemplate.api.HelloWorldResourceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestTemplateRunner implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(RestTemplateRunner.class);

    private final HelloWorldResourceApi resourceApi;

    @Value("${config-name}")
    private String configName;

    public RestTemplateRunner(HelloWorldResourceApi resourceApi) {
        this.resourceApi = resourceApi;
    }

    @Override
    public void run(String... args) {
        LOG.info("Using configuration '{}'", this.configName);

        try {
            var greeting = resourceApi.helloWorld();

            LOG.info("Got greeting: {}", greeting);
        } catch (Exception ex) {
            LOG.error(ex.getMessage(), ex);
        }
    }
}
