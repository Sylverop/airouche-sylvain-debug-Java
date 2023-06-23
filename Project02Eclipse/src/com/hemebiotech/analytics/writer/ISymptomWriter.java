package com.hemebiotech.analytics.writer;



import java.io.IOException;
import java.util.Map;

/**
 *
 */
public interface ISymptomWriter {

     /**
      *
      *
      * @param symptomWithOccurrences
      * @param file
      * @throws IOException
      */
     void writeSymptoms(Map<String, Integer> symptomWithOccurrences, String file) throws IOException;
}
