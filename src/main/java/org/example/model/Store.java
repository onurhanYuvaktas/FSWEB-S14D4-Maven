package org.example.model;

import java.awt.*;
import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[2];
        products[0] = new Chocolate("Bitter", 60, "Test");
        products[1] = new Coke("Classic", 50, "Test");
        products[2] = new Bread("Tam Buğday", 75, "Test");

    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            product.showDetails();
        }
    }
}