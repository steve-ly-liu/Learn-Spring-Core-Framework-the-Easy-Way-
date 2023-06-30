package org.company.javaconfig;

public class AnimalNoise {
    private Animal animal;

    public AnimalNoise(Animal animal) {
        this.animal = animal;
    }

    public void shout() {
        animal.makeNoise();
    }
}
