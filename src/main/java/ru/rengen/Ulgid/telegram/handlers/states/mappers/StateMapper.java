package ru.rengen.Ulgid.telegram.handlers.states.mappers;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.rengen.Ulgid.telegram.handlers.message.commands.CommandList;
import ru.rengen.Ulgid.telegram.logic.Logic;
import ru.rengen.Ulgid.telegram.logic.NoneState;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class StateMapper {
     protected Map<String, Logic> stateLogic;

     public abstract String getRole();

     protected void setStateLogic(CommandList list) {
          stateLogic = new HashMap<>();
          for (var command : list.getCommands().values()) {
               var logic = command.getLogic();
               if (!(logic instanceof NoneState)) {
                    stateLogic.put(logic.myState(), logic);
               }
          }
     }

     public void parse(Iterator<String> iterator, TelegramLongPollingBot bot, Message message) {
          try {
               stateLogic.get(iterator.next()).nextCAll(bot, message);
          } catch (TelegramApiException e) {
               throw new RuntimeException(e);
          }
     }
}
