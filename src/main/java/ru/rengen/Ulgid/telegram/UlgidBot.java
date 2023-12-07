package ru.rengen.Ulgid.telegram;


import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.config.BotConfig;

@Component
public class UlgidBot extends TelegramLongPollingBot {
    BotConfig config;

    public UlgidBot(BotConfig config) {
        super(config.getToken());
        this.config = config;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            var id = update.getMessage().getChatId().toString();
            try {
                execute(SendMessage.builder()
                        .chatId(id)
                        .text(id)
                        .build());
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }
}
