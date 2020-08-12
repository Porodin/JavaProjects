import java.io.IOException;

public class LaunchClass {
    static int getInt;
    static int getInt2;
    static int length = 4;
    String getSum;


    public void main(String[] args) throws IOException, MyArraySizeException, MyArrayDataException {

        String[][] array = new String[][]{{"1", "2", "3", "4"}, {"2", "3", "4", "5"}, {"4", "2", "3", "1"}, {"3", "4", "1", "2"}};
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

    private void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != length) {
            throw new MyArraySizeException("К сожалению вы вышли за пределы массива");
        }
    }
    private void checkArrayData(String[][] array) throws MyArrayDataException {
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

    private boolean someMethod(String array) {
        try {
            Integer.valueOf(array);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


