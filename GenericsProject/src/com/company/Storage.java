package com.company;

import java.util.ArrayList;

public class Storage<T  extends Goods > {
    T good;

    ArrayList<T> arrayList = new ArrayList<T>();

    void addGood(T good) {
        arrayList.add(good);
    }

    int getWeightOfContainer() {
        int containerWeight = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            containerWeight = containerWeight + arrayList.get(i).getWeight();
        }
        return containerWeight;
    }


    void printWeightOfContainer() {
            System.out.println("Вес вашего товара: " + getWeightOfContainer());
    }

    void comparisonOfConteiners(Storage secondStorage) {
        if (getWeightOfContainer() > secondStorage.getWeightOfContainer()) {
            System.out.println("Масса первого контейнера больше чем масса второго");
            if (getWeightOfContainer() < secondStorage.getWeightOfContainer()) {
                System.out.println("Масса первого контейнера меньше массы второго");
            } else {
                System.out.println("Массы одинаковы");
            }
        }
    }

    public interface Comparable<T> {
        public int compareTo(T o);
    }

    public void compareTo(Storage secondStorage) {
        if (!secondStorage.arrayList.getClass().equals(arrayList.getClass())) {
            System.out.println("Не прошел проверку");
        } else {
        arrayList.addAll(secondStorage.arrayList);
        secondStorage.arrayList.clear();
    }
    }
}










