package com.epam.programmigWithCasses.simple.task8;

import java.util.ArrayList;
import java.util.List;

public class ShopMain {
    public static void main(String[] args) {
        ShopView shopView = new ShopView();
        Shop shop = new Shop();
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Ivanov", "Stepan", "Kuzmich", "Minsk", 1515151, 123456));
        customerList.add(new Customer(2, "Sidorov", "Ivan", "Petrovich", "Minsk", 2515151, 223456));
        customerList.add(new Customer(3, "Kuzmin", "Stepan", "Kuzmich", "Minsk", 3515151, 323456));
        customerList.add(new Customer(4, "Malinin", "Ivan", "Ivanovich", "Minsk", 4515151, 423456));
        customerList.add(new Customer(5, "Sidorov", "Anton", "Bogdanovich", "Minsk", 5515151, 523456));

        shop.setCustomerList(customerList);
        shopView.printCustomerList(shop);
        ShopLogic shopLogic = new ShopLogic();
        shop = shopLogic.sortingCustomer(shop);
        shopView.printCustomerList(shop);
        shop = shopLogic.filterCustomer(shop,2515151,3515151);
        shopView.printCustomerList(shop);
    }
}
