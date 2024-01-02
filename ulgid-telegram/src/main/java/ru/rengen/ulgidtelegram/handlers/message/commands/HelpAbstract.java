package ru.rengen.ulgidtelegram.handlers.message.commands;

import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public abstract class HelpAbstract implements Command{
    protected String commands;

    @Override
    public String getCommand() {
        return "/help";
    }

    @Override
    public String getDescription() {
        return "Список доступных команд и их описание";
    }

    @Override
    public void exe(DefaultAbsSender bot, Message message) throws TelegramApiException {
        //Чтобы не показывать некоторые команды, придется ходить в бд
        //Стоит ли это того?
         bot.execute(SendMessage.builder()
                .text(commands)
                .chatId(message.getChatId())
                .build());
    }

    protected String getHelpText(List<? extends Command> list) {
        StringBuilder builder = new StringBuilder();
        for (Command command : list) {
            builder.append(command.getCommand())
                    .append(" - ")
                    .append(command.getDescription())
                    .append("\n");
        }
        return builder.toString();
    }
}
