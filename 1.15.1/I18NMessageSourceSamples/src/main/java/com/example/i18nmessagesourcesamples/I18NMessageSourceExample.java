package com.example.i18nmessagesourcesamples;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class I18NMessageSourceExample {
    private MessageSource messageSource;

    public void setMessageSource(MessageSource source) {
        this.messageSource = source;
    }

    public String getLocalExceptionsMessage(Locale localeCode) {
        return this.messageSource.getMessage("argument.required",
                new Object[] {"UserDao"}, "Required", localeCode);
    }

    public String getLocalFormatMessage(Locale localeCode) {
        return this.messageSource.getMessage("message", null, localeCode);
    }
}
