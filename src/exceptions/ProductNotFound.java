package src.exceptions;

public class ProductNotFound extends Exception{
    public ProductNotFound(String message){
        System.out.println(message);
    }
    public ProductNotFound(){
        System.out.println("This product not found.");
    }
}
