package com.vipul.basics;

import com.vipul.data.AnimalClone;
import com.vipul.data.Behaviour;

public class JavaCloning {
    // Shallow Cloning for Behaviour
    // String is immutable
    public static void main(String[] args) throws CloneNotSupportedException {

        AnimalClone animal = new AnimalClone();
        animal.setName("Human");

        Behaviour behaviour = new Behaviour();
        behaviour.setMoods("dance");

        animal.setBehaviour(behaviour);

        AnimalClone clone = (AnimalClone) animal.clone();

        System.out.println(animal.getBehaviour().getMoods());
        System.out.println(animal.getName());

        clone.setName("com/vipul");
        clone.getBehaviour().setMoods("sleeping");

        System.out.println(animal.getBehaviour().getMoods());
        System.out.println(animal.getName());
    }

}