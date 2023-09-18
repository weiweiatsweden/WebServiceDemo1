package com.wei.webservicedemo.Entities;


import javax.persistence.*;

@Entity
@Table
public class Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressID")
    private int AddressId;

    //@Size(min = 1, max = 150)
    @Column(name = "street")
    private String street;
   // @Size(min = 1, max = 10)
    @Column(name = "postCode")
    private String postCode;
   // @Size(min = 1, max = 30)
    @Column(name = "city")
    private String city;
   // @Size(min = 1, max = 30)
    @Column(name = "country")
    private String country;

    public Addresses() {
    }

    public Addresses(int addressId, String street, String postCode, String city, String country) {
        AddressId = addressId;
        this.street = street;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
    }

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
