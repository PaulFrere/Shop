package ru.zsa;

import org.jetbrains.annotations.NotNull;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class ItemStorage {

    private static Map<Integer, Item> storage = new HashMap<>();

    private ItemStorage() {
    }

    public static Map getInstance() {
        if (storage == null) {
            synchronized (ItemStorage.class) {
                if (storage == null){
                    storage = new HashMap<>();
                }
            }
        }

        return storage;
    }

    public static void addItem(String name, int price) {
        storage.put(storage.size(), new Item(name, price));
    }

    public static void addItem(Item item) {
        storage.put(storage.size(), item);
    }

    public static void addItems(@NotNull List<Item> itemList) {
        Map<Integer, Item> map = new HashMap<>();
        int temp = storage.size();
        for (int i = temp; i < temp + itemList.size(); i++) {
            addItem(itemList.get(i));
        }
        storage.putAll(map);
    }

    public static Item getItem(int index) {
        return storage.get(index);
    }

    public String toString() {
        return String.join("\n",
                storage.values().stream()
                        .map(Item::getName)
                        .collect(toList()));
    }
}
