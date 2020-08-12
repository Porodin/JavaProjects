public class Duck implements Swimmable { //имплементировали его в клас
    //имплементировали его в класc Duck месте с методом
    @Override
    public void swim() {
        System.out.println("Уточка, плыви!");
    }
    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.swim();
        // и просто его вывели
    }
}


