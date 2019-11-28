package com.fh.config;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.util.UUID;

public class MyConverter extends ClassicConverter{

    @Override
    public String convert(ILoggingEvent event) {
        return UUID.randomUUID().toString().replace("-","");
    }
}
