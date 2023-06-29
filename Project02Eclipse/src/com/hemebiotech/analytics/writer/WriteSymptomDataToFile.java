package com.hemebiotech.analytics.writer;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
public class WriteSymptomDataToFile implements ISymptomWriter {

    /**
     * This class implements the write to file method.
     * It then writes to the file the various resources
     * from the list.
     *
     */
public void writeSymptoms(Map<String, Integer> symptomWithOccurrences, String files) throws IOException {
    try(FileWriter fileWriter = new FileWriter(files)){
        for(Map.Entry<String, Integer> occurrences : symptomWithOccurrences.entrySet()) {
            fileWriter.write(occurrences.getKey() + " : " + occurrences.getValue() + ".\n");
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
  }
}