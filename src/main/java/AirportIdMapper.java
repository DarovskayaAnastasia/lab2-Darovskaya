import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;


public class AirportIdMapper extends Mapper<LongWritable, Text, Text, Text> {
    @Override
    protected void map(Object key, Text value, Context context) throws
            IOException, InterruptedException {
        String line = value.toString();
        String[] words =
                line.toLowerCase().split("[^\\p{L}-0-9']");
        for (String word : words) {
            context.write(new Text(word), new IntWritable(1));
        }
    }
}