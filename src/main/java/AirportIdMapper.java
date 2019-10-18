import java.io.IOException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class AirportIdMapper extends Mapper<LongWritable, Text, TextPair, Text> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws
            IOException, InterruptedException {
        String line = value.toString();
        String[] keyValuePair = parseLine(line);

        TextPair indicatoredKey
        context.write(, new Text(keyValuePair[1]));
    }

    private static String[] parseLine(String line) throws IOException {

        String[] textPair = {};

        CSVParser parser = CSVParser.parse(line, CSVFormat.RFC4180);
        for (CSVRecord record : parser) {
            textPair[0] = record.get(0);
            textPair[1] = record.get(1);
        }

        return textPair;
    }

}