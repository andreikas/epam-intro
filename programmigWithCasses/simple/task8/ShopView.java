package com.epam.programmigWithCasses.simple.task8;

import java.util.List;

public class ShopView {
    public void printCustomerList(Shop  shop){
        List<Customer> customerList = shop.getCustomerList();
        for (Customer customer : customerList){
            System.out.println("CC"+customer.toString());
        }
        System.out.println("============================");
    }

}
