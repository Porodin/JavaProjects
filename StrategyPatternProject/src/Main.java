public class Main {

    public static void main(String[] args) {

        OfficeWorker officeWorker = new OfficeWorker("Oleg", "Men", 25);
        System.out.println(officeWorker.getName());
        officeWorker.setRoadDescriptionType();



        Worker worker = new Worker("Svetlana", "Women", 30);
        System.out.println("\n" + worker.getName());
        worker.setRoadDescriptionType();



        Student student = new Student("Ivan", "Men", 18);
        System.out.println("\n" + student.getName());
        student.setRoadDescriptionType();
    }
}