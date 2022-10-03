import java.util.Objects;

public class Book {
    private final String bookName;
    private int yearPublishing;
    private Autor autor;

    public  String getBookName() {
        return this.bookName;
    }
    public Autor getAutor() { return this.autor; }

    public int getYearPublishing() { return yearPublishing; }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Book (String bookName, Autor autor, int yearPublishing) {
        this.bookName = bookName;
        this.autor = autor;
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Книга: " +
                this.bookName + " , " + this.autor + " , издание " +
                this.yearPublishing + " года." ;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearPublishing == book.yearPublishing && bookName.equals(book.bookName) && autor.equals(book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublishing, autor);
    }

}  // скобка класса
