package edu.wctc;

import java.util.List;

public class DetailSalesReport implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        printHeadings();
        for(Sale sale : salesList)
            System.out.println(sale);
    }

    private void printHeadings() {
        String customer = "Customer";
        String country = "Country";
        String amount = "Amount";
        String tax = "Tax";
        String shipping = "Shipping";
        System.out.printf("%-23s %-23s %-23s %-23s %-23s\n", customer, country, amount, tax, shipping);
    }
}
