import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.util.Vector;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WritableCSV {
    public static void main(String[] args) throws IOException {
        Vector records = parseCSV("src/main/resources/L_AIRPORT_ID.csv");
        int length = records.size();
        for (int i = 0; i < length; ++i) {
            System.out.println();
        }
    }
    static Vector parseCSV(String path) throws IOException {
        Vector records = new Vector();
        File source = new File(path);
        CSVParser parser = CSVParser.parse(source, StandardCharsets.UTF_8, CSVFormat.RFC4180);
        for (CSVRecord record : parser) {
            records.addElement(record);
        }

        return records;
    }
}
