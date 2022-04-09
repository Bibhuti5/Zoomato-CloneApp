package com.cs5500.NEUEat.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customer")
public class Customer extends User {

  public Customer() {
    this.setType("customer");
  }

  public Customer(String userName, String password, String phoneNumber, String address,
      String city, String state, String zip) {
    super(userName, password, phoneNumber, address, city, state, zip);
    this.setType("customer");
  }
}
