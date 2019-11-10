package com.epam.programmigWithCasses.simple.task9;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearPublishing;
    private int numberOfPage;
    private float price;
    private String bindingType;

    public Book(int id, String name, String author, String publishingHouse, int yearPublishing, int numberOfPage, float price, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearPublishing = yearPublishing;
        this.numberOfPage = numberOfPage;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", numberOfPage=" + numberOfPage +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
