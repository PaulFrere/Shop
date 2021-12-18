package ru.zsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // Создание хранилища товаров
        HashMap<Integer, String> productItem = new HashMap<>();
        int min = 10000;
        int max = 99999;
        int diff = max - min;
        String product = "Product";
        Random random = new Random();
        int i = 0;
        while(i < 1000){
            int k = random.nextInt(diff + 1);
            int l = random.nextInt(1000);
            productItem.put(k,product+l);
            i++;
        }
        System.out.println(productItem);

        //Поиск продукта по штрих-коду
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nKey =bufferedReader.readLine();
            int key = Integer.parseInt(nKey);
            String productName = productItem.get(key);
            System.out.println(productName);
        } catch (IOException e) {
            System.out.println("Неверный штрихкод");
        }

        //Сортровка по наименованию
        productItem.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }
}
