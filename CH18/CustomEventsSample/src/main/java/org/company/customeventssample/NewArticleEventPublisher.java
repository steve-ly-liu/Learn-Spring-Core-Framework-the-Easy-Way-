package org.company.customeventssample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

public class NewArticleEventPublisher {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishNewArticleEvent(Blog blog) {
        System.out.println(this.getClass().getSimpleName() + " :===> publish new article into blog which title is [" + blog.getUpdate().getTitle() + "].");
        this.publisher.publishEvent(blog);
    }
}
