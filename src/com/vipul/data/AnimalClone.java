package com.vipul.data;

public class AnimalClone implements Cloneable {
    String name;

    Behaviour behaviour;

    public String getName() {
        return name;
    }

    public Behaviour getBehaviour() {
        return behaviour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}