package com.medical.kafkaspringstreams.handlers;

import com.medical.kafkaspringstreams.events.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class PageEventHandler {

    @Bean
    public Consumer<PageEvent> pageEventConsumer(){
        return (input) -> {
            System.out.println("**************"+input.toString()+" **************");
        };
    }
}
