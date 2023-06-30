package org.company.eventsinspringsample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

public class NewArticleEventPublisher {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishNewArticleEvent(Blog blog) {
        this.publisher.publishEvent(blog);
    }
}
