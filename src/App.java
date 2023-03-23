public class App {
    public static void main(String[] args) {
        Author lTolstoy = new Author("Лев Толстой");
        Book warAndPeace = new Book("warAndPeace",1864, lTolstoy);

        System.out.println("Война и мир = " + warAndPeace.getBookName() + " год = "+warAndPeace.getPublisherYear()+" Автор : " + lTolstoy.getName());

        warAndPeace.setPublisherYear(1860);
        System.out.println("warAndPeace.getPublisherYear = " + warAndPeace.getPublisherYear());

        Author nGogol = new Author("Николай Гоголь");
        Book deadSouls = new Book("deadSous",1835, nGogol);

        System.out.println("Мертвые души = " + deadSouls.getBookName()+" год = "+deadSouls.getPublisherYear()+" Автор : "+ nGogol.getName());

    }
}
