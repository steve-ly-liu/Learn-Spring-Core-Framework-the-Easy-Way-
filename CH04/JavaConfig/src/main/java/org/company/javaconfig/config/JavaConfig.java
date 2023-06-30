package org.company.javaconfig.config;

import org.company.javaconfig.Animal;
import org.company.javaconfig.AnimalNoise;
import org.company.javaconfig.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Animal animal() {
        return new Cat();
    }

    @Bean
    public AnimalNoise animalNoise(Animal animal) {
        return new AnimalNoise(animal);
    }
}
