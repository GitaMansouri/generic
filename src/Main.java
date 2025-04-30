package src;

import src.exceptions.ProductNotFound;
import src.inventory.Inventory;
import src.products.Accessory;
import src.products.Book;
import src.products.Notebook;
import src.products.Product;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws ProductNotFound {
            Inventory<Book> bookInventory = new Inventory<>();
            Inventory<Notebook> notebookInventory = new Inventory<>();
            Inventory<Accessory> accessoryInventory = new Inventory<>();

            Book book1 = new Book("Calculus", 1154.0, "Adams", "AmirKabir", "Mathemathics");
            Book book2 = new Book("Divan", 2423.0, "Hafez", "Ofogh", "Poetry");
            bookInventory.addItems(book1);
            bookInventory.addItems(book2);

            Notebook notebook1 = new Notebook("ToDo List", 112.0, 200, true);
            Notebook notebook2 = new Notebook("Simple notebook", 47.0, 100, false);
            notebookInventory.addItems(notebook1);
            notebookInventory.addItems(notebook2);

            Accessory accessory1 = new Accessory("pencil", 5.0, "Black");
            Accessory accessory2 = new Accessory("pen", 12.0, "blue");
            accessoryInventory.addItems(accessory1);
            accessoryInventory.addItems(accessory2);

            bookInventory.displayAll();
            notebookInventory.displayAll();
            accessoryInventory.displayAll();

            bookInventory.removeItemsById(102);
            notebookInventory.removeItemsById(205);

            System.out.println(calculateTotalPrice(bookInventory));
            System.out.println(calculateTotalPrice(notebookInventory));
            System.out.println(calculateTotalPrice(accessoryInventory));

            System.out.println("the book you that want to find: " + bookInventory.findItemsById(101).toString());
            bookInventory.findItemsById(403);

            accessoryInventory.applyDiscount("pencil", 30);
            accessoryInventory.applyDiscount("pen", 10);

            bookInventory.displayAll();
            notebookInventory.displayAll();
            accessoryInventory.displayAll();


        }
        public static double calculateTotalPrice(Inventory<? extends Product> inventory) throws ProductNotFound {
            double total = 0;
            if (inventory != null && inventory.getItems() != null) {
                for (Product product : inventory.getItems()) {
                    if (product != null) {
                        total += product.getPrice();
                    }
                }
                return total;
            }
            else{
                throw new ProductNotFound("The warehouse is empty.");
            }
        }
    }