package extends1.ex;

public class Book extends Item {
    private String author;
    private String title;

    public Book(String name, int price, String author, String title) {
        super(name, price);
        this.author = author;
        this.title = title;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자: " + author + ", isbn: " + title);
    }
}
