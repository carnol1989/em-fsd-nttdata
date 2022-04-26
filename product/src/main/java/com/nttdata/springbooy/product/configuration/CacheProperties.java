package com.nttdata.springbooy.product.configuration;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
@ConfigurationProperties(prefix = "cache")
public class CacheProperties {

    private String port;
    private Integer size;
    private String ambiente;

}
