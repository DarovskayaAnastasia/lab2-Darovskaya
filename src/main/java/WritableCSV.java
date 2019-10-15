import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WritableCSV  {
    public static void main(String[] args) throws IOException {

    }
    void parseCSV(String path) {
        CSVRecord[]
        File source = new File(path);
        CSVParser parser = CSVParser.parse(source, StandardCharsets.UTF_8, CSVFormat.RFC4180);
        for (CSVRecord record : parser) {

        }
    }
}
