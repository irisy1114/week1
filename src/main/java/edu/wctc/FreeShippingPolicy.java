package edu.wctc;

public class FreeShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0);
    }
}
