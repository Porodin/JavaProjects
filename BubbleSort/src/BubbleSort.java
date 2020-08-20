public class BubbleSort {
    public static void main(String[] args){
        int[] array = {1, 3, 4, 5, 6, 7, 8, 9, 10, 2, -2};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int var = array[i];
                    array[i] = array[j];
                    array[j] = var;
                }
            }
            System.out.print(" " + array[i]);
        }
    }
}
