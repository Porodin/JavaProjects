public class Main{
    public static void main(String[] args) throws Exception{

        System.out.println("--------------ПОЕХАЛИ--------------");
        System.out.println("\n");

        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();


        myThread.start();
        myThread1.start();
        myThread2.start();
        myThread3.start();



        for (int i = 0; i < 3; i++){
            System.out.print("One");

            myThread.setPriority(1);
            MyThread.sleep(1000);

            System.out.print("Two");

            myThread1.setPriority(2);
            MyThread.sleep(1000);

            System.out.print("Three");

            myThread2.setPriority(3);
            MyThread.sleep(1000);

            System.out.println("Four");

            myThread3.setPriority(4);
            MyThread.sleep(1000);
        }

        System.out.println("\n" + "--------------НА СЕГОДНЯ ВСЕ--------------");
    }
}


