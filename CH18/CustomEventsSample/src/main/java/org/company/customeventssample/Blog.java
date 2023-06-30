package org.company.customeventssample;

import java.util.ArrayDeque;
import java.util.Deque;

public class Blog {
    private Deque<Article> articleStack;

    public Blog() {
        this.articleStack = new ArrayDeque<>();
    }


    public Article getUpdate() {
        Article newestArticle = null;
        // should have logic to send the state change to query
        if (!this.articleStack.isEmpty()) {
            newestArticle = this.articleStack.getLast();
        }
        return newestArticle;
    }

    public boolean scanSensitiveKeyword(String keyword) {
        Article newestArticle = null;
        boolean result = false;
        if (!this.articleStack.isEmpty()) {
            newestArticle = this.articleStack.getLast();
            if (newestArticle.getTitle().contains(keyword) && newestArticle.getContent().contains(keyword))
                result = true;
        }
        return result;
    }

    public void postNewArticle(Article newArticle) throws Exception {
        if (newArticle != null) {
            articleStack.add(newArticle);
            System.out.println("The article with title [" + newArticle.getTitle() + "] has been posted to blog.");
        } else
            throw new Exception("The new article is NULL, can not post the article!");
    }
}
