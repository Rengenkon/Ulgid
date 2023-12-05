package ru.rengen.Ulgid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import ru.rengen.Ulgid.telegram.UlgidBot;

@Slf4j
@Component
public class Starter {
    @Autowired
    public static void start(UlgidBot bot) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bot);
        }
        catch (TelegramApiException e) {
            log.error("Start error: " + e.getMessage());
        }
    }
}
