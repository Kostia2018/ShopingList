package com.example.projectshoppinglist.Model;

import java.util.Date;

public class Order {


    private int id;

    private Date dataCreate;

    private Double totalPrice;

    private User user;


    public Order(int id, Date dataCreate, Double totalPrice, User user) {
        this.id = id;
        this.dataCreate = dataCreate;
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(Date dataCreate) {
        this.dataCreate = dataCreate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
