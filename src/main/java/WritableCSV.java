//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVRecord;
//import java.io.File;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//public class WritableCSV {
//    public static void main(String[] args) throws IOException {
//        CSVParser airports = parseCSV("src/main/resources/L_AIRPORT_ID.csv");
//        for (CSVRecord airport : airports) {
////            System.out.println("id: " + airport.get(0) + "; name: " + airport.get(1));
//        }
//
////        CSVParser delays = parseCSV("src/main/resources/664600583_T_ONTIME_sample.csv");
////        for (CSVRecord delay : delays) {
////            System.out.println("id: " + delay.get(14) + "; dest " + delay.get(18));
////        }
//    }
//    static CSVParser parseCSV(String path) throws IOException {
//        File source = new File(path);
//        CSVParser parser = CSVParser.parse(source, StandardCharsets.UTF_8, CSVFormat.RFC4180);
//        for (CSVRecord record : parser) {
//            System.out.println(record);
//        }
//
//        return parser;
//    }
//}

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WritableCSV {
    public static void main(String[] args) throws IOException {
        String line = "\"10001\",\"Afognak Lake, AK: Afognak Lake Airport\"";

        CSVParser airports = parseCSV(line);
        for (CSVRecord airport : airports) {
//            System.out.println("id: " + airport.get(0) + "; name: " + airport.get(1));
        }

//        CSVParser delays = parseCSV("src/main/resources/664600583_T_ONTIME_sample.csv");
//        for (CSVRecord delay : delays) {
//            System.out.println("id: " + delay.get(14) + "; dest " + delay.get(18));
//        }
    }
    static CSVParser parseCSV(String line) throws IOException {

        CSVParser parser = CSVParser.parse(line, CSVFormat.RFC4180);
        for (CSVRecord record : parser) {
            System.out.println(record);
        }

        return parser;
    }
}

