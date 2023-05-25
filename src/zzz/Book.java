package zzz;

public class Book {
    String title;
    Author name;
    double price;

    public Book(String title, Author name, double price) {
        this.title = title;
        this.name = name;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(Author name) {
        this.name = name;
    }

    public String toString() {
        return "Title: " + title + "\nAuthor: " + name.toString() + "\nPrice: " + price;
    }
}