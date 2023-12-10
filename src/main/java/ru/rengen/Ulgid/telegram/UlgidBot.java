package ru.rengen.Ulgid.telegram;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.rengen.Ulgid.telegram.config.BotConfig;
import ru.rengen.Ulgid.telegram.handlers.Handler;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class UlgidBot extends TelegramLongPollingBot {
    private final BotConfig config;

    @Autowired
    private final Map<String, Handler> handlers;



    @Autowired

    private UlgidBot(BotConfig config, List<Handler> handlers) {
        super(config.getToken());
        this.config = config;
        this.handlers = handlers.stream().collect(Collectors.toMap(Handler::getName, handler -> handler));;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            handlers.get("messageHandler").parse(this, update.getMessage());
        }
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }
}
