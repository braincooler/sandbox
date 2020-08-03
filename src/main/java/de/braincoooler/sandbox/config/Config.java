package de.braincoooler.sandbox.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class Config {
    private static final Logger log = LoggerFactory.getLogger(Config.class);

    @Value("${gw.user}")
    private String gwUser;

    @PostConstruct
    public void init(){
        log.info("<< ----- gw.user:{} ----- >>", gwUser);
    }

}
