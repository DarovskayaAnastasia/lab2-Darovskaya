import java.io.IOException;
import java.util.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;

public class WordReducer extends Reducer<Text, IntWritable, Text, LongWritable> {
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws
            IOException, InterruptedException {
        long count=0;
        Iterator iterator = values.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            count++;
        }
        context.write(key, new LongWritable(count));
    }
}