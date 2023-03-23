public class Author {
    private final String nameAuthor;
    public String getName() {
        return this.nameAuthor;
    }
    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
        System.out.println(nameAuthor);
    }

}

