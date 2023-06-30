package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.*;

import com.hemebiotech.analytics.analytics.*;
import com.hemebiotech.analytics.reader.*;
import com.hemebiotech.analytics.writer.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> listSymptomsFromFilePath ;
        ISymptomReader readerSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");


        listSymptomsFromFilePath = readerSymptomDataFromFile.getSymptoms();
        System.out.println(listSymptomsFromFilePath);

        ISymptomWriter writerSymptomDataToFile = new WriteSymptomDataToFile();
        IAnalyticsCounterAndSort analyticsCounterAndSort = new AnalyticsCounter();

        writerSymptomDataToFile.writeSymptoms(analyticsCounterAndSort.sortSymptoms(analyticsCounterAndSort.countSymptoms(listSymptomsFromFilePath)),"result.out");
    }
}
