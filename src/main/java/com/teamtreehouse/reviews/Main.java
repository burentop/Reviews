package com.teamtreehouse.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

/**
 * Created by perramount on 9/17/16.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Brent", "Perry", 5, "Loved It!");
            printer.printRecord("David", "Perry", 4, "So, so");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
