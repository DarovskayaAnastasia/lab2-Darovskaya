import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;

public class OnTimeMapper extends Mapper<Object, Text, Text, Text> {
    @Override
    protected void map(Object key, Text value, Context context) throws
            IOException, InterruptedException {

        String record = value.toString();
        String[] idDelay = ;
        context.write(new Text(), new Text());
    }
}