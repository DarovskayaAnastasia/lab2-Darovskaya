import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<TextPair, Text, IntWritable, Text> {
    @Override
    protected void reduce(TextPair key, Iterable<Text> values, Context context) throws
            IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text systemInfo = new Text(iter.next());

        while (iter.hasNext()) {

            float delay = Float.valueOf(iter.next().toString());

            

            if (delay > maxDelay) {
                maxDelay = delay;
            }
            else if (delay < minDelay) {
                minDelay = delay;
            }
        }

        context.write();
    }
}