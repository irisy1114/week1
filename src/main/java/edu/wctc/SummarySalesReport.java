package edu.wctc;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SummarySalesReport implements SalesReport{

    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES SUMMARY REPORT");
        printHeadings();
        // find the unique countries and add to the new countryList
        var countryList= salesList.stream().map(e->e.getCountry()).distinct().collect(Collectors.toList());
        for(String country: countryList)
        {
            System.out.printf("%-23s %-23.2f %-23.2f %-23.2f\n", country, getTotal(country, salesList, e -> e.getAmount()), getTotal(country, salesList, e -> e.getTax()), getTotal(country, salesList, e -> e.getShipping()));
        }
    }

    // pass in Function requires sale object and return double
    private Double getTotal(String country, List<Sale> salesList, Function<Sale, Double> mapper ) {
        return salesList.stream().filter(e -> e.getCountry().equals(country)).map(mapper).mapToDouble(e -> e).sum();
    }
//
//    private Double getTotalAmount(String country, List<Sale> salesList) {
//        return salesList.stream().filter(e -> e.getCountry().equals(country)).map(e -> e.getAmount()).mapToDouble(e -> e).sum();
//    }
//
//    private Double getTotalTax(String country, List<Sale> salesList) {
//        return salesList.stream().filter(e -> e.getCountry().equals(country)).map(e -> e.getTax()).mapToDouble(e -> e).sum();
//    }
//
//    private Double getTotalShipping(String country, List<Sale> salesList) {
//        return salesList.stream().filter(e -> e.getCountry().equals(country)).map(e -> e.getShipping()).mapToDouble(e -> e).sum();
//    }

    private void printHeadings() {
        String country = "Country";
        String amount = "Amount";
        String tax = "Tax";
        String shipping = "Shipping";
        System.out.printf("%-23s %-23s %-23s %-23s\n", country, amount, tax, shipping);
    }
}
