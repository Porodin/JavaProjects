public class Main {
    public static void main(String[] args){
        StaticInterfaceClass.NiceNested niceNested = new SecondInterfaceClass();
        // создали экземляр первого класса с этим интерфейсом
        //... и дали ему название

        if(niceNested.isNotTrue(-102030)) {
            System.out.println(" -102030  ");
        }

        if(niceNested.isNotTrue(50033)) {
            System.out.println("   ");
        }
    }
}


