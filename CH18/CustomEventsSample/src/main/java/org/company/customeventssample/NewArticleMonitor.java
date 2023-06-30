package org.company.customeventssample;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class NewArticleMonitor {
    @EventListener({ContextRefreshedEvent.class, Blog.class})
    public void monitorMultipleEvents() {
        System.out.println("\n");
        System.out.println(this.getClass().getSimpleName() + " :===> Listen to multiple events...");
    }

    @EventListener(condition = "#blog.getUpdate().scanSensitiveKeyword('Snowden') == true")
    public void monitorSpecificArticleTitle(Blog blog) {
        System.out.println(this.getClass().getSimpleName() + " :===> !!! Warning: There is a new article where contains sensitive keyword [Snowden].");
    }
}
