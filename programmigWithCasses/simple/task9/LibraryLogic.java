package com.epam.programmigWithCasses.simple.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryLogic {
    public LibraryLogic() {
    }

    public Library getBookListByAuthor(String author, Library library) {
        List<Book> bookList = new ArrayList<>(library.getBookList());
        List<Book> bookListNew = bookList.stream().filter(d -> d.getAuthor() == author).collect(Collectors.toList());

        return new Library(bookListNew);
    }

    public Library getBookListByPublishingHouse(String publishingHouse, Library library) {
        List<Book> bookList = new ArrayList<>(library.getBookList());
        List<Book> bookListNew = bookList.stream().filter(d -> d.getPublishingHouse() == publishingHouse).collect(Collectors.toList());

        return new Library(bookListNew);
    }

    public Library getBookListAfterYear(int year, Library library) {
        List<Book> bookList = new ArrayList<>(library.getBookList());
        List<Book> bookListNew = bookList.stream().filter(d -> d.getYearPublishing() > year).collect(Collectors.toList());

        return new Library(bookListNew);
    }
}
