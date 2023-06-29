package com.hemebiotech.analytics;


import java.util.*;

import com.hemebiotech.analytics.reader.*;
import com.hemebiotech.analytics.writer.*;

public class AnalyticsCounter {

//    private  ISymptomReader reader;
//    private  ISymptomWriter writer;
//
//    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer){
//
//    }

    public static void main(String[] args) throws Exception {
        List<String> listSymptomsFromFilePath = new ArrayList<>();
        ISymptomReader readerSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse\\symptoms.txt");


        listSymptomsFromFilePath = readerSymptomDataFromFile.getSymptoms();
         System.out.println(listSymptomsFromFilePath);

         ISymptomWriter writerSymptomDataToFile = new WriteSymptomDataToFile();
        writerSymptomDataToFile.writeSymptoms(sortSymptoms(countSymptoms(listSymptomsFromFilePath)),"result.out");
    }
     public  static Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> listSymptomsCount = new HashMap<>();
        for(String symptom : symptoms) {
          Integer numberOfSymptoms = listSymptomsCount.get(symptom);
          if(numberOfSymptoms == null ){
              numberOfSymptoms = 1;
          }else{
              numberOfSymptoms = numberOfSymptoms + 1;
          }
          listSymptomsCount.put(symptom, numberOfSymptoms);
       /** solution avec getDefaultOrder à étudier **/
        //   listSymptomsCount.put(symptom, (numberOfSymptoms == null ? 1 : numberOfSymptoms + 1 ));
        }
        return listSymptomsCount;
     }
    public static  Map<String , Integer> sortSymptoms(Map<String, Integer> symptoms){
        Map<String, Integer> listSymptomsSort = new TreeMap<>(symptoms);
        return listSymptomsSort;
    }
}

//      public Map<String, Integer>sortSymptoms(Map<String, Integer> symptoms) {
//

