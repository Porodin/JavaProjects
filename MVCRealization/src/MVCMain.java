public class MVCMain {
    public static void main(String[] args){
        ModelOfDog model = retrieveDogFromDB();
        ViewOfDog view = new ViewOfDog();
        ControllerOfDog controller = new ControllerOfDog(model, view);
        controller.viewUpdate();
        controller.setNameOfDog("Тайсон");
        controller.setBreed("Ёкшер");
        controller.viewUpdate();
        controller.viewUpdate();
    }
    public static ModelOfDog retrieveDogFromDB(){
        ModelOfDog modelOfDog = new ModelOfDog();
        modelOfDog.setNameOfDog("Моля");
        modelOfDog.setBreed("Шпиц");
        modelOfDog.setNameOfDog("Кузьма");
        modelOfDog.setBreed("Лабрадор");

        return modelOfDog;
    }
}
