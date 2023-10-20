package org.misty.malom.framework.core.config;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MalomBaseConfig {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void initial() {
        this.logger.info("MalomBaseConfig initial");
    }

}
