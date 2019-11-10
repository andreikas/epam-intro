package com.epam.programmigWithCasses.simple.task8;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private int creditCartNumber;
    private int bankAccountNumber;



    public Customer(int id, String firstName, String lastName, String patronymic, String address, int creditCartNumber, int bankAccountNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCartNumber = creditCartNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCartNumber() {
        return creditCartNumber;
    }

    public void setCreditCartNumber(int creditCartNumber) {
        this.creditCartNumber = creditCartNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", creditCartNumber=" + creditCartNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
