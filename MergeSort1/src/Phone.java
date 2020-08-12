public class Phone {
    private String name;
    private String color;
    private int amount;
    private int price;



    public Phone(String name, String color, int amount, int price) {
        this.name = name;
        this.color = color;
        this.amount = amount;
        this.price = price;
    }

    public String getName(){
        return  name;
    }
    public String getColor(){
        return color;
    }

    public int getAmount(){
        return amount;
    }
    public int getPrice(){
        return price;
    }

    public void setAmount(int amount) {
            this.amount = amount;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
