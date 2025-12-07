package com.vipul.basics;

import java.util.Arrays;

public class ObjectReferenceBasics {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setName("Lion");

        Animal[] array = new Animal[2];
        array[0] = animal;
        System.out.println(Arrays.toString(array));

        animal = new Animal();
        animal.setName("Tiger");

        System.out.println(Arrays.toString(array));
    }

}

class Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

