package org.acme.rest.json;

public class Fruit {

    public String name;
    public String description;
    public Integer tartness;
    public Integer malicAcidConcentration;

    public Fruit() {
    }

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
