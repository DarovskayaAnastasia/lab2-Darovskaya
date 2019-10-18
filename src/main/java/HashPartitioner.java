import org.apache.hadoop.mapreduce.Partitioner;

public class HashPartitioner<TextPair, V> extends Partitioner<TextPair, V> {
    public int getPartition(TextPair key, V value, int numReduceTasks) {
        return (key.getID().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}