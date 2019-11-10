package com.epam.programmigWithCasses.simple.task9;

import java.util.List;

public class Library {
  private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Library() {

    }


    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
