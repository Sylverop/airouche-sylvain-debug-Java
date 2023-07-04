package com.hemebiotech.analytics.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;
    /**
     * The interface for performing analytics operations on a list of symptoms.
     */
public interface IAnalyticsCounterAndSort {
    /**
     * Counts the occurrences of symptoms in a list.
     *  @param symptoms The list of symptoms.
     *  @return A map containing the symptoms as keys and their occurrence count as values.
     *
     */
    Map<String, Integer> countSymptoms(List<String> symptoms) throws IOException;
    /**
     /**
     * Sorts the symptoms in a map in a specific order.
     *
     * @param symptoms The map containing the symptoms and their occurrence count.
     * @return A sorted map with symptoms sorted according to a specific order.
     */
    Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) throws IOException;

}