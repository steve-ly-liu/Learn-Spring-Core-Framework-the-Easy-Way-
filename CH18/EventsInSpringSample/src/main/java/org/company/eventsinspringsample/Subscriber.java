package org.company.eventsinspringsample;


import org.springframework.context.event.EventListener;

/**
 * This class represents the ConcreteObserver in the Observer Design Pattern.
 * */
public class Subscriber {
    @EventListener
    public void checkNewestArticle(Blog blog) {
        Article newestArticle = (Article) blog.getUpdate();
        if (newestArticle != null)
            System.out.println("The newest article's title is: [" + newestArticle.getTitle() + "].");
        else
            System.out.println("There is no new article!");
    }
}
