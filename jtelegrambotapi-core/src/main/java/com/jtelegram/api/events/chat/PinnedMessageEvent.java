package com.jtelegram.api.events.chat;

import com.jtelegram.api.events.message.ServiceMessageEvent;
import com.jtelegram.api.TelegramBot;
import com.jtelegram.api.message.Message;
import com.jtelegram.api.message.impl.service.PinnedMessageMessage;
import com.jtelegram.api.update.Update;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class PinnedMessageEvent extends ServiceMessageEvent<PinnedMessageMessage> {
    private Message pinnedMessage;

    public PinnedMessageEvent(TelegramBot bot, Update.MessageUpdate update, PinnedMessageMessage originMessage) {
        super(bot, update, originMessage);
        this.pinnedMessage = originMessage.getPinnedMessage();
    }
}
