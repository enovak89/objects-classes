public class App {
    public static void library() {
        Author firstAuthor = new Author("Lev", "Tolstoy");
        Author secondAuthor = new Author("Fedor", "Dostoyevsky");
        Book firstBook = new Book("War & peace", firstAuthor, 1867);
        Book secondBook = new Book("Idiot", firstAuthor, 1869);

        Book.setYear(firstBook, 1901);
        Book.setYear(secondBook, 1902);

//        firstBook.setYear(1901);
//        secondBook.setYear(1902);

        System.out.println("firstBook.getYear() = " + firstBook.getYear());
        System.out.println("secondBook.getYear() = " + secondBook.getYear());
    }
}
