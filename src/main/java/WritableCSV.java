import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WritableCSV {
    public static void main(String[] args) throws IOException {
        CSVParser airports = parseCSV("src/main/resources/L_AIRPORT_ID.csv");
        for (CSVRecord airport : airports) {
            System.out.println(airport.get(0));
        }

        CSVParser delays = parseCSV("src/main/resources/")
    }
    static CSVParser parseCSV(String path) throws IOException {
        File source = new File(path);
        CSVParser parser = CSVParser.parse(source, StandardCharsets.UTF_8, CSVFormat.RFC4180);

        return parser;
    }
}
