public class App {
    public static void library() {
        Author firstAuthor = new Author("Lev", "Tolstoy");
        Author secondAuthor = new Author("Fedor", "Tolstoy");
        Book firstBook = new Book("War & peace", firstAuthor, 1867);
        Book secondBook = new Book("War & peace", firstAuthor, 1869);


        firstBook.setYear(1901);
        secondBook.setYear(1902);

        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        System.out.println("secondBook.getYear() = " + secondBook.getYear());

        System.out.println("firstAuthor.toString() = " + firstAuthor.toString());
        System.out.println("secondAuthor.toString() = " + secondAuthor.toString());
        System.out.println("firstAuthor.equals(secondAuthor) = " + firstAuthor.equals(secondAuthor));

        System.out.println("firstBook.toString() = " + firstBook.toString());
        System.out.println("firstBook.equals(secondBook) = " + firstBook.equals(secondBook));
    }
}
