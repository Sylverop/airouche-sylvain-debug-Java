package com.hemebiotech.analytics.analytics;

import java.util.*;

/**
 *  This class performs analytics operations on a list of symptoms.
 */

public class AnalyticsCounter implements IAnalyticsCounterAndSort {
    /**
     * Count the occurrences of symptoms in a list
     *
     * @param symptoms The list of symptoms.
     * @return A map containing the symptoms as keys and their occurrence count as values.
     */
    @Override
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> listSymptomsCount = new HashMap<>();
        for (String symptom : symptoms) {
            Integer numberOfSymptoms = listSymptomsCount.get(symptom);
            if (numberOfSymptoms == null) {
                numberOfSymptoms = 1;
            } else {
                numberOfSymptoms += 1;
            }
            listSymptomsCount.put(symptom, numberOfSymptoms);
        }
        return listSymptomsCount;
    }
    /**
     *  Sort the symptoms in alphabetical order
     *
     *  @param symptoms The map containing the symptoms and their occurrence count.
     *  @return A sorted map with symptoms sorted in alphabetical order.
     */
    @Override
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        return new TreeMap<>(symptoms);
    }
}

