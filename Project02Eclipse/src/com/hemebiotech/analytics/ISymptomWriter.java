package com.hemebiotech.analytics;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
     void writeSymptoms(Map<String, Integer> symptomWithOccurrences, String file) throws IOException;
}
