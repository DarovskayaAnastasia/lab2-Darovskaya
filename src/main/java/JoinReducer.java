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

        float maxDelay = Float.MIN_VALUE;
        float minDelay = Float.MAX_VALUE;
        float averageDelay = 0;
        int n = 0;

        while (iter.hasNext()) {

            n++;
            float delay = Float.valueOf(iter.next().toString());

            averageDelay += delay;

            if (delay > maxDelay) {
                maxDelay = delay;
            }
            else if (delay < minDelay) {
                minDelay = delay;
            }

            averageDelay /= n;
        }

        context.write();
    }
}