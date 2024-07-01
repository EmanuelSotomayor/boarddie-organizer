package com.hex4w0rd.boarddie.services.impl;

import com.hex4w0rd.boarddie.services.IMessageService;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import java.util.Locale;

@Service
public class MessageServiceImpl implements IMessageService {

    private final MessageSource messageSource;

    public MessageServiceImpl(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @Override
    public String getProperty(String name) {
        return this.messageSource.getMessage(name, null, Locale.getDefault());
    }

}