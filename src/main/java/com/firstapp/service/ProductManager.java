package com.firstapp.service;

import java.io.Serializable;
import java.util.List;

import com.firstapp.domain.Product;

public interface ProductManager extends Serializable{

    public void incresePrice(int percentage);

    public List<Product> getProducts();
}
