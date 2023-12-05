package ru.rengen.Ulgid.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@Getter
@PropertySource("botInfo.yaml")
public class BotConfig {

    @Value("${name}")
    String botName;

    @Value("${token}")
    String token;

    @Value("${owner}")
    Long ownerId;
}