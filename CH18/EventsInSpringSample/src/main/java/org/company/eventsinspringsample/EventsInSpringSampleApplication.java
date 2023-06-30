package org.company.eventsinspringsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

@SpringBootApplication
public class EventsInSpringSampleApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(EventsInSpringSampleApplication.class, args);
        Article newArticle = new Article("Steve", "Snowden",
                "The story of whistleblower Edward Snowden is the most dramatic spy story of the decade. An Oliver Stone biopic was inevitable. So here it is. As movies almost always do, Snowden eliminates the nuance from this complicated and controversial story, painting Snowden as a hero and the National Security Agency as a one-dimensional villain. But as WIRED pointed out when the movie debuted, Snowden is important because it's the accessible version of events that many Americans will remember.",
                new Date());
        Blog blog = new Blog();
        blog.postNewArticle(newArticle);

        // Bean config using xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        NewArticleEventPublisher publisher = (NewArticleEventPublisher) context.getBean("newArticleEventPublisher");
        publisher.publishNewArticleEvent(blog);

    }

}
