package com.hemebiotech.analytics.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads symptom data from a file.
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private final String filepath;

    /**
     * Constructs a new ReadSymptomDataFromFile instance with the specified filepath.
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     *  Reads the symptoms from the file and returns a list of symptoms.
     *
     * @return A list of symptoms read from the file.
     */
    @Override
    public List<String> getSymptoms(){

        ArrayList<String> listSymptomsFromFilePath = new ArrayList<>();

        if (filepath != null) {
            try (FileReader fileReader = new FileReader(filepath);

                 BufferedReader reader = new BufferedReader(fileReader)) {

                String line = reader.readLine();

                while (line != null) {
                    listSymptomsFromFilePath.add(line);
                    line = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error, file not found!");
            } catch (IOException e) {
                System.out.println("File input/output error!");
                e.printStackTrace();
            }
        }
        return listSymptomsFromFilePath;
    }
}

