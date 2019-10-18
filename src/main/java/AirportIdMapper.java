import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class AirportIdMapper extends Mapper<LongWritable, Text, Text, Text> {
    @Override
    protected void map(Object key, Text value, Context context) throws
            IOException, InterruptedException {
        String record = value.toString();
        String[] parts =
                record.split(",");
         context.write(new Text(parts[0]), new Text("airport_name    " + parts[1]));
    }
}