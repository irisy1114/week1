package edu.wctc;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesDataFromFile implements SalesInput{

    private List<Sale> saleList = new ArrayList<>();

    @Override
    public List<Sale> getSales() {
        try {
            // read sales data from file and add it to the saleList
            File file = new File("src/main/java/edu/wctc/salesDetails.txt");
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNextLine()) {
                var saleData = scanner.nextLine().split(",");
                var sale = new Sale(saleData[0], saleData[1], Double.valueOf(saleData[2]), Double.valueOf(saleData[3]));
                saleList.add(sale);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return saleList;
    }
}
