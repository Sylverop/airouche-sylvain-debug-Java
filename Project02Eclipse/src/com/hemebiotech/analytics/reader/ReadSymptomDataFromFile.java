package com.hemebiotech.analytics.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() throws IOException {
        ArrayList<String> listSymptomsFromFilePath = new ArrayList<>();

        if (filepath != null) {
            try (FileReader fileReader = new FileReader(filepath);
                 BufferedReader reader = new BufferedReader(fileReader)) {
                String line = reader.readLine();
// est-il plus pertinant d'écrire String line; while( (line = reader.realine ) != null)
                while (line != null) {
                    listSymptomsFromFilePath.add(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listSymptomsFromFilePath;
    }
}

