public class OfficeWorker extends Human  {
    public OfficeWorker(String name, String gender, int age) {
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
