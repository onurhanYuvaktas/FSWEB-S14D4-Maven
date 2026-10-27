package org.example.model;

public class Bread extends ProductForSale {
    private double weight;

    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.weight = weight;
    }

    public Bread(String type, int price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    public void showDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "type: " + getType() + ", price: " + getPrice() + ", description: " + getDescription();
    }
}
