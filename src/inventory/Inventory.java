package src.inventory;
import src.exceptions.ProductNotFound;
import src.products.Product;

import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }
    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public void applyDiscount(String productName, int discount) throws ProductNotFound {
        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(productName)) {
                double originalPrice = item.getPrice();
                double discountedPrice = originalPrice - (originalPrice * discount / 100);
                item.setPrice(discountedPrice);
                System.out.println("Discount " + discount + " applied to the " + productName);
                return;
            } else {
                throw new ProductNotFound("This product not found.");
            }
        }
    }
    public void addItems(T product) {
        items.add(product);
    }
    public void removeItemsById(int id) throws ProductNotFound {
        for (T item : items) {
            if (item.getId().equalsIgnoreCase(String.valueOf(id))) {
                items.remove(id);
            }
            else {
                throw new ProductNotFound();
            }
            }
    }
    public T findItemsById(int id) throws ProductNotFound {
        for (T item : items) {
            if (item.getId().equalsIgnoreCase(String.valueOf(id))) {
                return item;
            }
        }
        throw new ProductNotFound();
    }
    public void displayAll() throws ProductNotFound {
        if (items.isEmpty()) {
            throw new ProductNotFound("The warehouse is empty.");
        }
        System.out.println("Inventory: ");
        for (T item : items) {
            System.out.println(item.toString());
            System.out.println(item.getId() + item.getTitle() + item.getPrice());
        }
    }
}
