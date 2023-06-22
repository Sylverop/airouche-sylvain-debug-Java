package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
    private static int headacheCount = 0;
    private static int highBloodPressureCount = 0;
    private static int rashCount = 0;


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
        String line = reader.readLine();


        while (line != null) {
            if (line.equals("headache")) {
                headacheCount++;
            } else if (line.equals("high blood pressure")) {
                highBloodPressureCount++;
            } else if (line.contains("rash")) {
                rashCount++;
            }
            line = reader.readLine();
        }
        System.out.println("number of headaches: " + headacheCount);
        System.out.println("number of high blood pressure: " + highBloodPressureCount);
        System.out.println("number of rash: " + rashCount);

        FileWriter writer = new FileWriter("result.out");
        writer.write("headache: " + headacheCount + "\n");
        writer.write("rash: " + highBloodPressureCount + "\n");
        writer.write("dialated pupils: " + rashCount + "\n");
        writer.close();
    }
}
