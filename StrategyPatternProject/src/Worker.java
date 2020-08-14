public class Worker extends Human{
    public Worker(String name, String gender, int age) {
        super(name, gender, age);
    }


    @Override
    public void setRoadDescriptionType() {
        roadDescriptionType = new AnotherRealisation();
        roadDescriptionType.getOutOfBed();
        roadDescriptionType.eating();
        roadDescriptionType.toGetToWork();

    }
}
