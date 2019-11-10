package com.epam.programmigWithCasses.simple.task9;

import java.util.ArrayList;
import java.util.List;

public class LibraryView {
    public void printBookList(String title, Library library) {
        List<Book> bookList = new ArrayList<>(library.getBookList());
        System.out.println("-----------------" + title + "------------------");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
        System.out.println("========================================================");
    }
}
