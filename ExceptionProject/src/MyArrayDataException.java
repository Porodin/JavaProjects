public class MyArrayDataException extends Exception {
    int number;
    String someString;


    public MyArrayDataException(String someString, int number) {
        super(someString);
        this.number = number;
    }
}

