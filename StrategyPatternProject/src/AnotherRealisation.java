public class AnotherRealisation implements RoadDescription {

    @Override
    public void getOutOfBed() {
        System.out.println("\n" + "Встать с кровати и заправить её" );
    }


    @Override
    public void eating() {
        System.out.println("Позавтракать макаронами с сыром");
    }

    @Override
    public void toGetToWork() {
        System.out.println("Доехать до офиса, завода или учебного заведения");
    }
}

class AnotherImplementation implements RoadDescription{

    @Override
    public void getOutOfBed() {
        System.out.println("\n" + "Встать с кровати и не заправлять её" );
    }

    @Override
    public void eating() {
        System.out.println("Не завтракать");
    }

    @Override
    public void toGetToWork() {
        System.out.println("Дойти до офиса, завода или учебного заведения");
    }
}
