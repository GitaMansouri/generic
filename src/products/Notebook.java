package src.products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;

    public Notebook(int pageCount, boolean isHardCover) {
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }


    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }


    @Override
    public String toString() {
        if (isHardCover) {
            return super.toString() + "The book with " + pageCount + " is hard cover. ";
        } else {
            return super.toString() + "The book with " + pageCount + " is not hard cover. ";
        }
    }

    public String generateId(){
        setId("2");
        return getId();
    }
}
