package ru.zsa;

public class Item {
    private final String name;
    private final int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "name = " + name + "; price = " + price;
    }
}
