//import java.io.File;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//import org.apache.hadoop.io.*;
//import org.apache.hadoop.mapreduce.Mapper;
//
//public class AirportIdMapper extends Mapper<LongWritable, Text, TextPair, Text> {
//    @Override
//    protected void map(Object key, Text value, Context context) throws
//            IOException, InterruptedException {
//        String line = value.toString();
//        String[] record = parseLine(line);
//    }
//
//
//}