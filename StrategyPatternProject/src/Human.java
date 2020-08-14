public abstract class Human {
    private String name;
    private String gender;
    private int age;

    protected RoadDescription roadDescriptionType;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public abstract void setRoadDescriptionType();
}
//Создаем метод в классе Human, который будет устанавливать
// конкретный класс, имплементируемый от интерфейса RoadDescription, который нам нужен
