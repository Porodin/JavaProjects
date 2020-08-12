import java.io.BufferedReader;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static Main main = new Main();
    public static BufferedWriter bufferedWriter = null;

    private static String[] myArray = {"125\n", "124\n", "123\n", "122\n", "121\n"};

    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            File file = new File("File");
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread first = new Thread(()
                -> main.fileWriter(bufferedWriter, myArray));

        first.start();
        first.join();

    }

    public void fileWriter(BufferedWriter bufferedWriter, String[] myArray) {
        try {
            for (int i = 0; i < 5; i++) {
                bufferedWriter.write(myArray[i]);
                System.out.print(myArray[i]);
                Thread.sleep(1000);
            }
            bufferedWriter.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}











