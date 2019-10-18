import org.apache.hadoop.mapreduce.Partitioner;

public class HashPartitioner<K, V> extends Partitioner<K, V> {
    @Override
    public int getPartition(K key, V value, int numReduceTasks) {
        return (((TextPair)key).getID().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}