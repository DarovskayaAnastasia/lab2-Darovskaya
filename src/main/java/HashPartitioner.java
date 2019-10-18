import org.apache.hadoop.mapreduce.Partitioner;

public class HashPartitioner<K, V> extends Partitioner<TextPair, V> {
    @Override
    public int getPartition(TextPair key, V value, int numReduceTasks) {
        return (key.getID() & Integer.MAX_VALUE) % numReduceTasks;
    }
}