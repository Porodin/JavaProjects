package com.company;

import java.io.IOException;

public class Main {

    static int getInt;
    static int getInt2;
    static int length = 4;
    static String getSum;


    public static void main(String[] args) throws IOException, MyArraySizeException, MyArrayDataException {

        String[][] array = new String[][]{{"1", "2", "3","7"}, {"2", "3", "5", "6"}, {"4", "2", "3", "1"}, {"3", "4", "1", "2"}};
        try {
            checkArraySize(array);
        } catch (MyArraySizeException е) {
            System.out.println("Оупс... Словил CheckArraySizeException");
            return;
        }
        try {
            checkArrayData(array);
        } catch (MyArrayDataException e) {
            System.out.println("и снова словил исключение, но на этот раз CheckArrayDataException");

        }
    }

    static void checkArraySize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < array.length; i++){
            if (array[i].length != 4){
                throw new MyArraySizeException("К сожалению вы вышли за пределы массива");
            }
        }
            for (int j = 0; j < array.length; j++){
                if (array[j].length != 4){
                    throw new MyArraySizeException("К сожалению вы вышли за пределы массива");
                }
            }

            if (array.length != 4) {
            throw new MyArraySizeException("К сожалению вы вышли за пределы массива");
        }

    }
    static void checkArrayData(String[][] array) throws MyArrayDataException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                getInt = i;
                getInt2 = j;
                if (someMethod(array[i][j])) {
                    array[i][j] = String.valueOf(array[i][j]);
                    getSum += array[i][j];
                } else {
                    throw new MyArrayDataException("someString", getInt + getInt2);
                }
            }
        }
    }

    private static boolean someMethod(String array) {
        try {
            Integer.valueOf(array);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
