package src.products;

public class Accessory extends Product{
    private String color;

    public Accessory(String title, Double price, String color){
        super(title, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "The color of book is " + color;
    }

    public String generateId(){
        setId("3");
        return getId();
    }
}
