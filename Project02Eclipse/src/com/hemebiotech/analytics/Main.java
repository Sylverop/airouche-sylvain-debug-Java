package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

import com.hemebiotech.analytics.analytics.*;
import com.hemebiotech.analytics.reader.*;
import com.hemebiotech.analytics.writer.*;

    /**
     * Main class that reads symptom data as input from a file, performs analysis on the data, and returns the results to an output file.
     */

public class Main {
    public static void main(String[] args) throws IOException {

        ISymptomReader readerSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");

        List<String> listSymptomsFromFilePath = readerSymptomDataFromFile.getSymptoms();
        System.out.println(listSymptomsFromFilePath);

        ISymptomWriter writerSymptomDataToFile = new WriteSymptomDataToFile();
        IAnalyticsCounterAndSort analyticsCounterAndSort = new AnalyticsCounter();

        Map<String, Integer> counterMap = analyticsCounterAndSort.countSymptoms(listSymptomsFromFilePath);

        Map<String, Integer> sortMap =  analyticsCounterAndSort.sortSymptoms(counterMap);

        writerSymptomDataToFile.writeSymptoms(sortMap,"result.out");
    }
}
