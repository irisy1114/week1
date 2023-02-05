package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Report {
    private AppInput in;
    private AppOutput out;

    @Autowired
    private SalesReport salesReport;

    @Autowired
    private ShippingPolicy shippingPolicy;

    @Autowired
    private SalesInput salesInput;

    private List<Sale> saleList = new ArrayList<>();

    @Autowired
    public Report(AppInput in, AppOutput out) {
        this.in = in;
        this.out = out;
        System.out.println("Report began");
    }

    public void create() {
        saleList = salesInput.getSales();
        for (Sale sale : saleList)
            shippingPolicy.applyShipping(sale);
        salesReport.generateReport(saleList);
        out.output("Report over");
    }
}
