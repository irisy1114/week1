package edu.wctc;

public class Sale {
    private String name;
    private String country;
    private double amount;
    private double tax;
    private double shipping;

    public Sale(String name, String country, double amount, double tax) {
        this.name = name;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }

    public double getAmount() {
        return amount;
    }
    public double getTax() {
        return tax;
    }

    public void setShipping(double shippingFee) {
        this.shipping = shippingFee;
    }
    public double getShipping() {
        return shipping;
    }

    public String toString() {
        return String.format("%-23s %-23s %-23.2f %-23.2f %-23.2f", name, country, amount, tax, shipping);
    }
}

