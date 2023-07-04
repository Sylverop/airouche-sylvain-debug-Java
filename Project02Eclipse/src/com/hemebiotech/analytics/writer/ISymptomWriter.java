package com.hemebiotech.analytics.writer;


import java.io.IOException;
import java.util.Map;

    /**
     * The interface for writing symptom data to a file.
     */
public interface ISymptomWriter {

    /**
     * Writes the symptoms and their occurrences to a file.
     * @param symptomWithOccurrences A map containing the symptoms as keys and their occurrence count as values.
     * @param file                   The path to the file to write the data to.
     */
    void writeSymptoms(Map<String, Integer> symptomWithOccurrences, String file) throws IOException;
}
