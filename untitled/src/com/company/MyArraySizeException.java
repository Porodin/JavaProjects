package com.company;

class MyArraySizeException extends Exception {
    int someLength;
    int length;


    public MyArraySizeException(String s) {
        super(s);
    }
}

