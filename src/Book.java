import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название, год издания " + name + ", " + year + " " + getAuthor().toString();
//      return "Название, год издания " + name + ", " + year + " " + author.toString();
       // В текущем (пусть даже родительском) классе все равно нужно обращаться к свойству объекта другого класса через метод?
        // Или допустимо использовать вторую закомментированную строчку?
        // Book же является родительским классом по отношению к Author?

    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Book b2 = (Book) other;
        return this.name.equals(b2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }
}
