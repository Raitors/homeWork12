import java.util.Objects;

public class Book {
   private final String bookName;
   private int publisherYear;
   private final Author author;
    public Book(String bookName, int publisherYear, Author author) {
        this.bookName = bookName;
        this.publisherYear = publisherYear;
        this.author = author;
    }
    public String getBookName(){
        return bookName;
    }
    public int getPublisherYear() {
        return publisherYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publisherYear=" + publisherYear +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return  Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publisherYear, author);
    }
}
