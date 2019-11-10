package com.epam.programmigWithCasses.simple.task9;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Философия Java", "Брюс Эккель", "Питер", 2005, 250, 30, "hardcover");
        Book book2 = new Book(2, "Философия Java", "Брюс Эккель 2", "Питер2", 2010, 250, 30, "hardcover");
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        Library library = new Library(bookList);
        LibraryView libraryView = new LibraryView();
        libraryView.printBookList("Исходная библиотека", library);
        String filter = "Питер2";
        LibraryLogic libraryLogic = new LibraryLogic();
        Library libraryNew = libraryLogic.getBookListByPublishingHouse(filter, library);
        libraryView.printBookList("Фильтр по издательству = " + filter, libraryNew);
        filter = "Брюс Эккель";
        libraryNew = libraryLogic.getBookListByAuthor("Брюс Эккель", library);
        libraryView.printBookList("Фильтр по автору = " + filter, libraryNew);
        int filterI = 2009;
        libraryNew = libraryLogic.getBookListAfterYear(filterI, library);
        libraryView.printBookList("Фильтр по году издания > " + filterI, libraryNew);
    }
}
