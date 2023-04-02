package homework13;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int yearOfBook;
    public Book(String bookName, Author authorName, int yearOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfBook = yearOfBook;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public int getYearOfBook() {
        return yearOfBook;
    }
    public void setYearOfBook(int yearOfBook) {
        this.yearOfBook = yearOfBook;
    }
    @Override
    public String toString() {
        return "Name of the book: " + bookName + '\n' +
                "Author: " + '\n' + authorName.toString() + '\n' +
                "Year of publishing: " + yearOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }
}
