package edu.wctc;

public class OrderAmountBasedShippingPolicy implements ShippingPolicy{
    @Override
    public void applyShipping(Sale sale) {
        if(sale.getAmount() > 100) {
            sale.setShipping(0);
        } else
            sale.setShipping(sale.getAmount() * 0.1);
    }
}
