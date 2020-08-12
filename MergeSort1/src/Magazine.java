
import javax.naming.Name;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.IOException;


public class Magazine {
    private static ArrayList<Phone> phones = new ArrayList<Phone>();



    static int totalAmount = 0;
    static boolean getModel;
    static boolean getColor;
    static String get_Model;
    static String get_Color;
    static int positionInList;
    private static String myModel;
    static String myColor;
    static String myAmount;
    static String myPrice;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {


        System.out.println("\n" + "|------|-------|Приветствую дорогие покупатели, в нашем магазине вы можете преобрести интересующую вас модель телефона, выберайте, что хотите купить|-------|------| Press 1");

        Magazine magazine = new Magazine();
        ArrayList<Phone> arrayList = new ArrayList<>();


        NewProduct(new Phone("ZTE", "White", 3, 10000));
        NewProduct(new Phone("ZTE", "Black", 1, 10000));
        NewProduct(new Phone("Nokia", "Black", 1, 30000));
        NewProduct(new Phone("ZTE", "White", 1, 10000));
        NewProduct(new Phone("Nokia", "Black", 1, 10000));
        NewProduct(new Phone("Iphone", "Blue", 2, 20000));
        NewProduct(new Phone("ZTE", "Pink", 2, 10000));
        String SwitchShop;
        int check = 0;
        boolean myboool = true;
        boolean showInterfase = true;
        while (showInterfase) {
            check = 0;
            myboool = true;
            System.out.println("1 - добавить продукт, 2 - совершить покупку, 3 - посчитать сумму");
            while (myboool) {

                SwitchShop = scanner.nextLine();
                try {
                    check = Integer.parseInt(SwitchShop);
                } catch (NumberFormatException e) {
                    System.out.println("Введите число от 1 до 6");
                }
                if (check > 0 && check <= 6) {
                    myboool = false;
                } else {
                    System.out.println("Вы вышли за границы выбора меню");
                }

            }

            System.out.println("Выберите характеристики вашей модели " + "\n");
            switch (check) {
                case 1:
                    boolean mybool = true;
                    Scanner scanner = new Scanner(System.in);
                    while (mybool) {
                        System.out.println("Введите модель: ");
                        myModel = scanner.nextLine();
                        if (isInteger(myModel)) {
                            System.out.println("Вы ввели модель неправильно, введите модель еще раз");
                        } else {
                            mybool = false;
                        }
                    }


                    boolean myBooll = true;
                    while (myBooll) {
                        System.out.println("Введите цвет: ");
                        myColor = scanner.nextLine();
                        if (isInteger(myColor)) {
                            System.out.println("Вы ввели цвет неправильно, введите цвет еще раз");
                        } else {
                            myBooll = false;
                        }
                    }

                    int cheeck = 0;
                    boolean booool = true;
                    while (booool) {
                        System.out.println("Введите количество");
                        myAmount = scanner.nextLine();
                        if (!isInteger(myAmount)) {
                            System.out.println("Вы ввели недопустимое количество, попробуйте еще раз");
                        } else {
                            cheeck = Integer.parseInt(myAmount);
                            booool = false;
                        }
                    }

                    int cheeeck = 0;
                    boolean boooool = true;
                    while (boooool) {
                        System.out.println("Введите цену");
                        myPrice = scanner.nextLine();
                        if (!isInteger(myPrice)) {
                            System.out.println("Вы ввели цену неправильно, попробуйте снова");
                        } else {
                            cheeeck = Integer.parseInt(myPrice);
                            boooool = false;
                        }
                    }

                    try {
                        FileWriter fileWriter = new FileWriter("JavaShop.txt");
                        fileWriter.write("1)---------------- Мы добавили новый продукт в корзину ----------------");
                        fileWriter.close();
                    }catch (Exception e){
                        System.out.println("Вы словили исключение,к сожалению");
                    }

                    System.out.println("Далее переходите к следующему шагу, добавьте ваш товар в корзину PRESS 2 " + "\n");
                    Magazine.NewProduct(new Phone(myModel, myColor, cheeck, cheeeck));
                    break;
                case 2:
                    Magazine.Purchase();
                    Magazine.appendStrToFile("\n" + "2)----------------Мы купили данный товар----------------" + "\n" + myModel + " " + myColor + " " + check + " " + totalAmount);
                    break;
                case 3:
                    Magazine.SaleReport();
                    Magazine.appendStrToFile("\n" + "3)----------------Мы посчитали сумму наших товаров---------------- " + "\n"+  myModel + " " + myColor + " " + check + " " + totalAmount);
                    break;
                case 4:
                    showInterfase = false;

                    break;
                case 5:
                    PrintList();

                    break;
            }
        }
    }


    //equals name - проверяем цвет, если цвет тоже совпадает, то увеличиваем кол-во
    private static void NewProduct(Phone phone) throws IOException {
        boolean isDouble = false;
        if (phones.size() == 0) {
            phones.add(phone);
        } else {
            for (Phone value : phones) {
                if (value.getName().equals(phone.getName()) &&
                        value.getColor().equals(phone.getColor())) {
                    value.setAmount(value.getAmount() + phone.getAmount());
                    isDouble = true;
                    break;
                }
            }
            if (!isDouble) {
                phones.add(phone);
            }
        }
    }

    private static void PrintList() {
        for (int i = 0; i < phones.size(); i++) {

            System.out.println(i + 1 + ": " + "\n" +
                    "Model: " + phones.get(i).getName()
                    + "\n" + "Color: " + phones.get(i).getColor()
                    + "\n" + "Price: " + phones.get(i).getPrice()
                    + "\n" + "Amount: " + phones.get(i).getAmount());

        }

        System.out.println("\n" + "|------|-------|Приветствую дорогие покупатели, выше перечислены все имеющиеся товары в данном магазине, выберайте что хотите купить|-------|------|");
    }


    private static void Purchase() throws IOException {
        boolean hasInCashe = false;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите модель: ");
        String model = scanner.nextLine();

        System.out.println("Введите цвет: ");
        String color = scanner.nextLine();
        String check = null;
        int amount = 0;
        boolean boool = true;
        while (boool) {
            try {
                System.out.println("Введите количество");
                check = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Введите число");
            }
            if (isInteger(check)) {
                boool = false;
                amount = Integer.parseInt(check);
            } else {
                System.out.println("Вы ввели недопустимое количество, попробуйте еще раз");
            }
        }


        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getName().equals(model)) {
                if (phones.get(i).getColor().equals(color)) {
                    if (phones.get(i).getAmount() >= amount) {
                        phones.get(i).setAmount(phones.get(i).getAmount() - amount);
                        totalAmount += phones.get(i).getPrice() * amount;
                        System.out.println("На складе имеется " + phones.get(i).getName() + " с цветом " + phones.get(i).getColor() + " количество:" + phones.get(i).getAmount());
                        System.out.println("Далее оформите покупку, для этого PRESS 3" + "\n");
                        break;
                    } else {
                        System.out.println("Нет такого кол-ва товара!");

                    }
                } else {
                    System.out.println("Нет товара такого цвета!");
                }
            } else {
                System.out.println("Нит такого товара!");
            }
        }
    }

    public static void appendStrToFile(String msg){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("JavaShop.txt", true))); // true добавит новые данные
            out.println(msg + "\n");
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    private static boolean isInteger(String string) {
        try {
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void SaleReport() throws IOException {
        System.out.println("Сумма проданных товатов: " + "\n" + totalAmount);
        System.out.println("Поздравляю с покупкой" + "\n");
        System.out.println("_____________Возьмите ваш чек_____________");
    }
}







