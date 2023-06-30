package com.hemebiotech.analytics.analytics;


import java.io.IOException;
import java.util.*;

import com.hemebiotech.analytics.reader.*;
import com.hemebiotech.analytics.writer.*;

public class AnalyticsCounter implements IAnalyticsCounterAndSort {


    public Map<String, Integer> countSymptoms(List<String> symptoms) throws IOException {
        Map<String, Integer> listSymptomsCount = new HashMap<>();
        for (String symptom : symptoms) {
            Integer numberOfSymptoms = listSymptomsCount.get(symptom);
            if (numberOfSymptoms == null) {
                numberOfSymptoms = 1;
            } else {
                numberOfSymptoms = numberOfSymptoms + 1;
            }
            listSymptomsCount.put(symptom, numberOfSymptoms);            /** solution avec getDefaultOrder à étudier **/
            //   listSymptomsCount.put(symptom, (numberOfSymptoms == null ? 1 : numberOfSymptoms + 1 ));
        }
        return listSymptomsCount;
    }
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) throws IOException {
        Map<String, Integer> listSymptomsSort = new TreeMap<>(symptoms);
        return listSymptomsSort;
    }
}

