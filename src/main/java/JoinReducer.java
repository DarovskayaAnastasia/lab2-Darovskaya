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
        Text name = new Text(iter.next());

//        throw new IOException("ITERATOR INFORMATION: " + iter.next().toString());

        float maxDelay = Float.MIN_VALUE;
        float minDelay = Float.MAX_VALUE;
        float averageDelay = 0;
        int n = 0;

        while (iter.hasNext()) {

            n++;
            float delay = Float.parseFloat(iter.next().toString());

            if ( delay >= 0 ) {
                averageDelay += delay;

                if (delay > maxDelay) {
                    maxDelay = delay;
                } else if (delay < minDelay) {
                    minDelay = delay;
                }
            }

            averageDelay /= n;
        }

        if (n>0) {
            context.write(new IntWritable(key.getID()), new Text(name + ": "
                    + "min delay time = " + minDelay
                    + "; max delay time = " + maxDelay
                    + "; average delay time = " + averageDelay
                    + ";"));
        }
    }
}