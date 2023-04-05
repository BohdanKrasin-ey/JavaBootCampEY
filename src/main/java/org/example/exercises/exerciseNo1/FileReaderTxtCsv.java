package org.example.exercises.exerciseNo1;

import com.opencsv.CSVWriter;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FileReaderTxtCsv {

    private static final String FILE_PATH_TXT = "exerciseNo1.txt";
    private static final String FILE_PATH_CSV = "exerciseNo1.csv";

    public static void main(String[] args) throws IOException {

        List list = readFileTxt(FILE_PATH_TXT);
     //   writeFileTxtToCsv(FILE_PATH_CSV,list);
        printData(list);

    }
    public static List<String> readFileTxt(String path) throws IOException {
        List <String> list = new ArrayList();
        File fileTxt = new File(path);
        try (Stream<String> linesStream = Files.lines(fileTxt.toPath())) {
            linesStream.forEach(list::add);
        }
        Collections.sort(list);

        return list;
    }

    public static void writeFileTxtToCsv(String path, List<String> data) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(path))) {
            String[] header = {"ID", "Word"};
            writer.writeNext(header);
            int id = 1;
            for (String line : data) {
                String[] row = {String.valueOf(id++), String.join(" ", line)};
                writer.writeNext(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printData(List<String> data) {
        String[] header = {"ID", "WORD"};
        System.out.printf("%-10s %-10s%n", header[0], header[1]);
        int id = 1;
        for (String line : data) {
            String[] row = {String.valueOf(id++), String.join(" ", line)};
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }


}
