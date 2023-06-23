package com.hemebiotech.analytics;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.reader.*;
import com.hemebiotech.analytics.writer.*;

public class AnalyticsCounter {

    private  ISymptomReader reader;
    private  ISymptomWriter writer;

    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer){

    }




    public static void main(String[] args) throws Exception {
        ISymptomReader readerSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");

        List<String> listSymptomsFromFilePath = new ArrayList<>();
        listSymptomsFromFilePath = readerSymptomDataFromFile.getSymptoms();
       System.out.println(listSymptomsFromFilePath);
    }


}
