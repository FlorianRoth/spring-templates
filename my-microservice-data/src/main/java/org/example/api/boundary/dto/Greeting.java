package org.example.api.boundary.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
@ToString
public class Greeting {
    private String hello;
    private String world;
}
