package org.company.customeventssample;

import org.springframework.context.event.EventListener;

public class Subscriber {
    @EventListener
    public void checkNewestArticle(Blog blog) {
        Article newestArticle = blog.getUpdate();
        if (newestArticle != null)
            System.out.println(this.getClass().getSimpleName() + " :===> The newest article's title is: [" + newestArticle.getTitle() + "].");
        else
            System.out.println("There is no new article!");
    }
}
