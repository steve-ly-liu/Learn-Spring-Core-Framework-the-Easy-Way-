package org.company.obeserverdesignpatternsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class ObeserverDesignPatternSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObeserverDesignPatternSampleApplication.class, args);
        Article newArticle = new Article("Steve", "Snowden",
                "The story of whistleblower Edward Snowden is the most dramatic spy story of the decade. An Oliver Stone biopic was inevitable. So here it is. As movies almost always do, Snowden eliminates the nuance from this complicated and controversial story, painting Snowden as a hero and the National Security Agency as a one-dimensional villain. But as WIRED pointed out when the movie debuted, Snowden is important because it's the accessible version of events that many Americans will remember.",
                new Date());
        Blog blog = new Blog();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        try {
            blog.registerObserver(subscriber1);
            blog.registerObserver(subscriber2);
            subscriber1.setSubject(blog);
            subscriber2.setSubject(blog);
            blog.postNewArticle(newArticle);
            System.out.println("The subscribe1's updated article title is: [" + subscriber1.getArticle().getTitle() + "].");
            System.out.println("The Subscribe2's updated article title is: [" + subscriber2.getArticle().getTitle() + "].");
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

}
