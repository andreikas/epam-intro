package com.epam.programmigWithCasses.simple.task8;

import java.util.List;

public class Shop {
    private List<Customer> customerList;

    public Shop() {
    }

    public Shop(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
