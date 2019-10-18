import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.util.Vector;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WritableCSV {
    public static void main(String[] args) throws IOException {
        CSVParser records = parseCSV("src/main/resources/L_AIRPORT_ID.csv");
        for (CSVRecord record : records) {
            System.out.println(record.get(0));
        }
    }
    static CSVParser parseCSV(String path) throws IOException {
        File source = new File(path);
        CSVParser parser = CSVParser.parse(source, StandardCharsets.UTF_8, CSVFormat.RFC4180);

        return parser;
    }
}
