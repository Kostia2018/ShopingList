package com.example.projectshoppinglist.Servise;

import com.example.projectshoppinglist.Model.User;

import java.util.List;

public interface UserS {

    public List<User> getAllUser();


    public User createUser();

    public User udateUser(Integer idUser);



}
