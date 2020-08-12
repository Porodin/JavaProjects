public class Main {
    public static void main(String[] args) throws Exception, IllegalArgumentException {

        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.start();
        myThread1.start();

        System.out.println("One");
        myThread.setPriority(1);
        MyThread.sleep(30);


        System.out.println("Three");
        myThread1.setPriority(2);
        MyThread.sleep(30);


        System.out.println("Five");
        myThread.setPriority(3);
        MyThread.sleep(30);


        System.out.println("Seven");
        myThread1.setPriority(4);
        MyThread.sleep(30);


        System.out.println("Nine");
        myThread.setPriority(5);
        MyThread.sleep(30);

        System.out.println("Eleven");
        myThread1.setPriority(6);
        MyThread.sleep(30);

        System.out.println("Thirteen");
        myThread.setPriority(7);
        MyThread.sleep(30);

        System.out.println("Fifteen");
        myThread1.setPriority(8);
        MyThread.sleep(30);

        System.out.println("Seventeen");
        myThread.setPriority(9);
        MyThread.sleep(30);

        System.out.println("Nineteen");
        myThread1.setPriority(10);
        MyThread.sleep(30);


        System.out.println("Twenty-one");

            try {
                myThread.setPriority(11);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }

            System.out.println("Twenty-three");

            try {
                myThread.setPriority(12);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }

            System.out.println("Twenty-five");


            try {
                myThread.setPriority(13);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }


            System.out.println("Twenty-seven");

            try {
                myThread.setPriority(14);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }


            System.out.println("Twenty-nine");

            try {
                myThread.setPriority(15);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }


            System.out.println("Thirty-one");

            try {
                myThread.setPriority(16);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }


            System.out.println("Thirty-three");

            try {
                myThread.setPriority(17);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }


            System.out.println("Thirty-five");

            try {
                myThread.setPriority(18);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }


            System.out.println("Thirty-seven");

            try {
                myThread.setPriority(19);
            }catch (IllegalArgumentException e){
                MyThread.sleep(30);
            }


            System.out.println("Thirty-nine");

        try {
            myThread.setPriority(20);
        }catch (IllegalArgumentException e){
            MyThread.sleep(30);
        }

        }
    }
