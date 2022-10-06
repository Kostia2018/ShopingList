package com.example.projectshoppinglist.Servise;

import com.example.projectshoppinglist.Model.Product;

import java.util.List;

public interface ProductS {



     void addProduct(Product product);

     List<Product> getProduct();

     void updateProduct(Integer idProduct,Product product);









}
