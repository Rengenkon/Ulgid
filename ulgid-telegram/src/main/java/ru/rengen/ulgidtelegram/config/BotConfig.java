package ru.rengen.ulgidtelegram.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Getter
@PropertySource("botInfo.propirties")
public class BotConfig {

    @Value("${name}")
    String botName;

    @Value("${token}")
    String token;

    @Value("${admin}")
    Long admin;
}