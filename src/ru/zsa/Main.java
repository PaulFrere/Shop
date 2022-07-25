package ru.zsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Map itemStorage = ItemStorage.getInstance();

        List<Item> itemList = new ArrayList(Arrays.asList(
                new Item("Kettle", 1000),
                new Item("Microwave", 4000),
                new Item("Multicooker", 6000),
                new Item("Battery", 100)
        ));


        ItemStorage.addItems(itemList);

        System.out.println(itemList);

        System.out.println("\n\n" + ItemStorage.getItem(2));
    }

}
