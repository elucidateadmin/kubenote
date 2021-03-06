package com.example.configserver.logging.rest;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface LogSource {
    String OUTPUT = "restLoggingOutput";

    @Output(LogSource.OUTPUT)
    MessageChannel pushLog();
}
