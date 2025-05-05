package com.hex4w0rd.boarddie.services.impl;

import com.hex4w0rd.boarddie.services.IMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import java.util.Locale;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements IMessageService {

    private final MessageSource messageSource;

    @Override
    public String getProperty(String name) {
        return this.messageSource.getMessage(name, null, Locale.getDefault());
    }

}