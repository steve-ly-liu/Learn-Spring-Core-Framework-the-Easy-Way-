package org.company.obeserverdesignpatternsample;

/**
 * This class represents the ConcreteObserver in the Observer Design Pattern.
 * */
public class Subscriber implements Observer {
    private Article article;
    private Subject blog;

    @Override
    public void update() {
        System.out.println("Subject's state changing reported by Subject");
        article = (Article) blog.getUpdate();
    }

    @Override
    public void setSubject(Subject subject) {
        this.blog = subject;
        //article = null;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
