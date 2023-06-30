package org.company.obeserverdesignpatternsample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * This class represents the ConcreteSubject class in the Observer Design Pattern.
 * */
public class Blog implements Subject {
    private Deque<Article> articleStack;
    private List<Observer> observerList;
    private boolean isStateChanged;

    public Blog() {
        this.articleStack = new ArrayDeque<>();
        this.observerList = new ArrayList<>();
        isStateChanged = false;
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        if (observer != null)
            this.observerList.add(observer);
        else
            throw new Exception("Observer can not be null!");
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (isStateChanged) {
            for (Observer observer: observerList) {
                observer.update();
                System.out.println("Observer notified!" );
            }
        }
    }

    @Override
    public Object getUpdate() {
        Article newestArticle = null;
        // should have logic to send the state change to query
        if (isStateChanged) {
            newestArticle = this.articleStack.getLast();
        }
        return newestArticle;
    }

    public void postNewArticle(Article newArticle) throws Exception {
        if (newArticle != null) {
            articleStack.add(newArticle);
            isStateChanged = true;
            notifyObserver();
        } else
            throw new Exception("The new article is NULL, can not post the article!");


    }
}
