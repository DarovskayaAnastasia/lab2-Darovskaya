import org.apache.hadoop.mapreduce.Partitioner;

public class HashPartitioner<K, V> extends Partitioner<K, V> {
    public int getPartition(TextPair key, V value, int numReduceTasks) {
        return (key.getID().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}