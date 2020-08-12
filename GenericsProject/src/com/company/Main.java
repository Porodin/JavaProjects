package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Storage firstStorage = new Storage();
        Storage secondStorage = new Storage();
        Storage thirdStorage = new Storage();

        Dumbbells dumbbells = new Dumbbells();
        dumbbells.setWeight(50);
        Dumbbells dumbbells1 = new Dumbbells();
        dumbbells1.setWeight(32);

        Barbell barbell = new Barbell();
        barbell.setWeight(50);
        Barbell barbell1 = new Barbell();
        barbell1.setWeight(40);

        firstStorage.addGood(dumbbells);
        thirdStorage.addGood(dumbbells1);

        secondStorage.addGood(barbell);
        secondStorage.addGood(barbell1);

        firstStorage.getWeightOfContainer();
        secondStorage.getWeightOfContainer();


        firstStorage.printWeightOfContainer();
        secondStorage.printWeightOfContainer();

        firstStorage.comparisonOfConteiners(thirdStorage);
        firstStorage.comparisonOfConteiners(firstStorage);

        firstStorage.printWeightOfContainer();
        thirdStorage.printWeightOfContainer();

        firstStorage.printWeightOfContainer();
        thirdStorage.printWeightOfContainer();

        secondStorage.printWeightOfContainer();

        firstStorage.compareTo(secondStorage);
        System.out.println();
        firstStorage.printWeightOfContainer();
        System.out.println();
        secondStorage.printWeightOfContainer();
    }
}
