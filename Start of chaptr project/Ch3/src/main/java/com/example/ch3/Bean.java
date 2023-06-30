package com.example.ch3;

public class Bean {
    private Animal pet;
    public Bean() {}

    public Bean(Animal animalObj) {
        this.pet = animalObj;
    }

    public void shout() {
        pet.makeNoise();
    }
}
