package edu.wctc;

public class FlatRateDomesticShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(20);
    }
}
