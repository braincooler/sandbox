package de.braincoooler.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class Config {
    private static final Logger logger = LoggerFactory.getLogger(Config.class);

    @Value("${server.tomcat.max-threads}")
    private Integer threads;

    @PostConstruct
    public void init(){
        logger.info("thread limit: {}", threads);
    }
}
