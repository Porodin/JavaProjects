public class Student extends Human {
    public Student(String name, String gender, int age) {
        super(name, gender, age);
    }


    @Override
    public void setRoadDescriptionType() {
       roadDescriptionType = new AnotherImplementation();
        roadDescriptionType.getOutOfBed();
        roadDescriptionType.eating();
        roadDescriptionType.toGetToWork();
    }
}
