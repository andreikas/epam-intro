package com.epam.programmigWithCasses.simple.task8;

import java.util.*;
import java.util.stream.Collectors;

public class ShopLogic {
    public Shop sortingCustomer(Shop shop) {
        List<Customer> customerList = new ArrayList<Customer>(shop.getCustomerList());

        Comparator<Customer> sortByFirstName
                = (p, o) -> p.getFirstName().compareToIgnoreCase(o.getFirstName());
        Comparator<Customer> sortByLastName
                = (p, o) -> p.getLastName().compareToIgnoreCase(o.getLastName());

        List<Customer> customerListNew = customerList.stream().sorted(
                sortByFirstName
                .thenComparing(sortByLastName)
        ).collect(Collectors.toList());

        shop.setCustomerList(customerListNew);
        return shop;
    }

    public Shop filterCustomer(Shop shop, int intervalBegin, int intervalEnd) {
        List<Customer> customerListNew = new ArrayList<>();
        List<Customer> customerList = new ArrayList<>(shop.getCustomerList());
        customerListNew = customerList.stream().filter(d -> intervalBegin <= d.getCreditCartNumber() && intervalEnd <= d.getCreditCartNumber()).collect(Collectors.toList());
        shop.setCustomerList(customerListNew);
        return shop;
    }
}
