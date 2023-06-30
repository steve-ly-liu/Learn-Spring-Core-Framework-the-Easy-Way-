package org.company.eventsinspringsample;

import java.util.Date;

public class Article {
    private String author;
    private String title;
    private String content;
    private Date publishDate;

    public Article(String author, String title, String content, Date publishDate) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
