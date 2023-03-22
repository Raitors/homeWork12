public class Book {
   private String bookName;
   private int publisherYear;
   private String fullNameAuthor;
    public Book(String bookName, int publisherYear, String fullNameAuthor) {
        this.bookName = bookName;
        this.publisherYear = publisherYear;
        this.fullNameAuthor = fullNameAuthor;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPublisherYear() {
        return this.publisherYear;
    }

    public String getFullNameAuthor() {
        return fullNameAuthor;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
}
