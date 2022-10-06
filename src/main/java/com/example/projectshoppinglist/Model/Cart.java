package com.example.projectshoppinglist.Model;

import java.util.Date;

public class Cart {

    private int id;

    private Date dateCreate;

    private User user;

    private int amount;

    public Cart(int id, Date dateCreate, User user, int amount) {
        this.id = id;
        this.dateCreate = dateCreate;
        this.user = user;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
