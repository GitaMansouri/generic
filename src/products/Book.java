package src.products;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre){
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }


    public String getAuthor() {
        return author;
    }
    public String getPublication() {
        return publication;
    }
    public String getGenre() {
        return genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + "The author of book with genre(" + genre + ") by publication: " + publication + " is " + author;
    }

    public String generateId(){
       setId("1");
       return getId();
    }
}
