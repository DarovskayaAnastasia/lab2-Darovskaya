package org.apache.hadoop.mapreduce;

public class Partitioner extends Partitioner<K, V> {
    public int getPartition(K key, V value,  int numReduceTasks) {
        return (key.hashCode() & Integer.MAX_VALUE) % numReduceTasks;
    }
}
