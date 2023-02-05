package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SalesDataFromConsole implements SalesInput {
    @Autowired
    private AppInput in;

    private List<Sale> saleList = new ArrayList<>();

    @Override
    public List<Sale> getSales() {
            String customerName = in.getInput("Enter customer name: ");
            while (saleList.isEmpty() || !customerName.equalsIgnoreCase("Q")) {
                String customerCountry = in.getInput("Enter customer country: ");
                Double customerAmount = Double.valueOf(in.getInput("Enter sale amount: "));
                Double customerTax = Double.valueOf(in.getInput("Enter tax: "));
                saleList.add(new Sale(customerName, customerCountry, customerAmount, customerTax));
                customerName = in.getInput("Enter customer name (Q to quit): ");
        }
            return saleList;
    }
}
