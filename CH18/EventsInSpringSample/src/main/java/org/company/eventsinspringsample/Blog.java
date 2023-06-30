package org.company.eventsinspringsample;

import org.springframework.context.ApplicationEvent;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * This class represents the ConcreteSubject class in the Observer Design Pattern.
 * */
public class Blog {
    private Deque<Article> articleStack;

    public Blog() {
        this.articleStack = new ArrayDeque<>();
    }


    public Object getUpdate() {
        Article newestArticle = null;
        // should have logic to send the state change to query
        if (!this.articleStack.isEmpty()) {
            newestArticle = this.articleStack.getLast();
        }
        return newestArticle;
    }

    public void postNewArticle(Article newArticle) throws Exception {
        if (newArticle != null) {
            articleStack.add(newArticle);
            System.out.println("The article with title[" + newArticle.getTitle() + "] has been posted to blog.");
        } else
            throw new Exception("The new article is NULL, can not post the article!");
    }
}

