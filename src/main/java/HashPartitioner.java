package lab2-Darovskaya;

import org.apache.hadoop.mapreduce.Partitioner;

public class HashPartitioner<K, V> extends Partitioner<K, V> {
    public int getPartition(K key, V value, int numReduceTasks) {
        return (((TextPair)key).getID().hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}