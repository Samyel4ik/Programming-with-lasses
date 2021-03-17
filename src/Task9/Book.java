package Task9;

public class Book {
    int id;
    int theYearOfPublishing;
    int numberOfPages;
    int price;
    String bindingType;
    String name;
    String author;
    String publishingHouse;

    public Book(int id, String name, int theYearOfPublishing, int numberOfPages, int price, String bindingType, String author, String publishingHouse) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.bindingType = bindingType;
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
        this.theYearOfPublishing = theYearOfPublishing;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name=" + name +
                ",  author=" + author +
                ", bindingType=" + bindingType +
                ", numberOfPages=" + numberOfPages +
                ", publishingHouse=" + publishingHouse +
                ", theYearOfPublishing=" + theYearOfPublishing +
                ", price=" + price +
                '}';
    }
}
