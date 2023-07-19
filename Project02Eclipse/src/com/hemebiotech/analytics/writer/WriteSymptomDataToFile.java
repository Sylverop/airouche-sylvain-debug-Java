package com.hemebiotech.analytics.writer;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

    /**
     * Writes symptom data to a file.
     */
public class WriteSymptomDataToFile implements ISymptomWriter {

    /**
     * Writes the symptoms and their occurrences to a file.
     * @param symptomWithOccurrences  A map containing the symptoms as keys and their occurrence count as values.
     * @param files                   The path to the file to write the data to.
     */

    public void writeSymptoms(Map<String, Integer> symptomWithOccurrences, String files)  {
        try (FileWriter fileWriter = new FileWriter(files)) {
            for (Map.Entry<String, Integer> occurrences : symptomWithOccurrences.entrySet()) {
                fileWriter.write(occurrences.getKey() + " : " + occurrences.getValue() + ".\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}