package lv.jg.lesson5.level1;

import java.util.Objects;

public class Book {

    private String author, title;
    private int pageCount;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Book{"
                + "author='" + author + '\''
                + ", title='" + title + '\''
                + ", page count='" + pageCount + '\''
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    public void compareViaEquals(Book book1, Book book2) {

        System.out.println(book1);
        System.out.println(book2);
        System.out.print("***'equals' comparison outcome >>> ");

        if (book1.equals(book2)) {
            System.out.print("Books '" + book1.getTitle() + "' and '" + book2.getTitle());
            System.out.println("' are both written by " + book1.getAuthor() + ".");
        } else {
            System.out.print("Books '" + book1.getTitle() + "' and '" + book2.getTitle());
            System.out.println("' are written by different authors.");
        }

        compareViaEqualSigns(book1, book2);
        System.out.println();

    }

    private void compareViaEqualSigns(Book book1, Book book2) {

        System.out.print("***'  ==  ' comparison outcome >>> ");

        if (book1 == book2) {
            System.out.print("Books '" + book1.getTitle() + "' and '" + book2.getTitle());
            System.out.println("' are equal.");
        } else {
            System.out.print("Books '" + book1.getTitle() + "' and '" + book2.getTitle());
            System.out.println("' are different.");
        }

    }

    private String getAuthor() {
        return author;
    }

    private String getTitle() {
        return title;
    }

}
