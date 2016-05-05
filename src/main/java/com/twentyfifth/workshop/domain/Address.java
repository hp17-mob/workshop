package com.twentyfifth.workshop.domain;

public class Address {
    private String street;
    private String zipCode;
    private String city;
    private String country;

    public Address(String street, String zipCode, String city, String country) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return street + " " + zipCode + " " + city + " " + country;
    }
}
