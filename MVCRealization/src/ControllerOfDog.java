public class ControllerOfDog {
    private ModelOfDog model;
    private ViewOfDog view;

    public ControllerOfDog(ModelOfDog model, ViewOfDog view) {
        this.model = model;
        this.view = view;
    }
    public void setNameOfDog(String nameOfDog){
        model.setNameOfDog(nameOfDog);
        }

    public String getNameOfDog(){
        return model.getNameOfDog();
    }
    public void setBreed(String breed){
        model.setBreed(breed);
    }
    public String getBreed(){
        return model.getBreed();
    }
    public void viewUpdate(){
        view.printDogInfo(model.getNameOfDog(), model.getBreed());
    }
}

