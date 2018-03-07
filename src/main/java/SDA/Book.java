package SDA;

public class Book {
    int id, numberOfItemsInStock;
    String TitleOFBook, author;
    double price;


    public Book(int id, String titleOFBook, String author, double price, int numberOfItemsInStock) {
        this.id = id;
        this.numberOfItemsInStock = numberOfItemsInStock;
        TitleOFBook = titleOFBook;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfItemsInStock() {
        return numberOfItemsInStock;
    }

    public void setNumberOfItemsInStock(int numberOfItemsInStock) {
        this.numberOfItemsInStock = numberOfItemsInStock;
    }

    public String getTitleOFBook() {
        return TitleOFBook;
    }

    public void setTitleOFBook(String titleOFBook) {
        TitleOFBook = titleOFBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", TitleOFBook='" + TitleOFBook + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", numberOfItemsInStock=" + numberOfItemsInStock +
                '}';
    }
}
