import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class TestClass {
    public static void main(String[] args) throws Exception {

    }

    private String[] parseLine(String line) throws IOException {

        String[] result = new String[2];

        CSVParser parser = CSVParser.parse(line, CSVFormat.RFC4180);
        for (CSVRecord record : parser) {
            result[0] = record.get(0);
            result[1] = record.get(17);
        }

        return result;
    }
}