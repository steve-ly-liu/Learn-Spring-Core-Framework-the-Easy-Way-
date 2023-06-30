package com.example.lookupmethodinjectionexample.config;

import com.example.lookupmethodinjectionexample.Command;
import com.example.lookupmethodinjectionexample.CommandManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
    @Bean
    @Scope("prototype")
    public Command command() {
        return new Command();
    }

    @Bean
    public CommandManager commandManager() {
        return new CommandManager() {
            protected Command createCommand() {
                return command();
            }
        };
    }
}
