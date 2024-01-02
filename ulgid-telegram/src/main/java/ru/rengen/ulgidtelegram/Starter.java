package ru.rengen.ulgidtelegram;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.rengen.ulgidtelegram.config.BotConfig;
import ru.rengen.ulgidtelegram.UlgidBot;

@Slf4j
@Component
public class Starter {
    @Autowired
    public Starter(UlgidBot bot) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bot);
            log.info("Stars is successful. Bot is working");
        }
        catch (TelegramApiException e) {
            log.error("Start error: " + e.getMessage());
        }
    }
}
