import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class AirportIdMapper extends Mapper<Object, Text, Text, Text> {
    @Override
    protected void map(Object key, Text value, Context context) throws
            IOException, InterruptedException {
//        String record = value.toString();
        CSVParser records = parseCSV("src/main/resources/L_AIRPORT_ID.csv");
        String parts[] = 

//        String[] parts =
//                record.split(",");
         context.write(new Text(parts[0]), new Text("airport_name    " + parts[1]));
    }

    static CSVParser parseCSV(String path) throws IOException {
        File source = new File(path);
        CSVParser parser = CSVParser.parse(source, StandardCharsets.UTF_8, CSVFormat.RFC4180);

        return parser;
    }
}