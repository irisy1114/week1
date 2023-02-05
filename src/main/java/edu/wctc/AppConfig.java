package edu.wctc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {
    @Bean
    public AppInput appInput() {
        return new ConsoleInput();
    }

    @Bean
    public AppOutput appOutput() {
        return new ConsoleOutput();
    }
    @Bean
    public ShippingPolicy shippingPolicy() {
//        return new FreeShippingPolicy();
//        return new FlatRateDomesticShippingPolicy();
        return new OrderAmountBasedShippingPolicy();
    }

    @Bean
    public SalesReport salesReport() {
//        return new DetailSalesReport();
        return new SummarySalesReport();
    }

    @Bean
    public SalesInput salesInput() {
        return new SalesDataFromFile();
//        return new SalesDataFromConsole();
    }
}
