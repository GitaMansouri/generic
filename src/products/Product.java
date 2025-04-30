package src.products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    protected Product(String title, Double price, String id){
        this.title = title;
        this.price = price;
        this.id = id;
    }

    protected Product() {
    }


    public String getTitle() {
        return title;
    }
    public Double getPrice() {
        return price;
    }
    public String getId() {
        return id;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "The price of product (" + title + ") with id: " + id + " is " + price;
    }

    protected abstract String generateId();
}
