//import java.io.IOException;
//import org.apache.hadoop.io.*;
//import org.apache.hadoop.mapreduce.Mapper;
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//
//public class AirportIdMapper extends Mapper<LongWritable, Text, TextPair, Text> {
//
//    @Override
//    protected void map(LongWritable key, Text value, Context context) throws
//            IOException, InterruptedException {
//        String line = value.toString();
//        String[] keyValuePair = new String[2];
//        keyValuePair = parseLine(line);
//
//        if (key.get() > 0) {
//            TextPair indicatoredKey = new TextPair(Integer.parseInt(keyValuePair[0]), (byte) 0);
//            context.write(indicatoredKey, new Text(keyValuePair[1]));
//        }
//    }
//
//    private String[] parseLine(String line) throws IOException {
//
//        String[] result = new String[2];
//
//        CSVParser parser = CSVParser.parse(line, CSVFormat.RFC4180);
//        for (CSVRecord record : parser) {
//            result[0] = record.get(0);
//            result[1] = record.get(1);
//        }
//
//        return result;
//    }
//
//}