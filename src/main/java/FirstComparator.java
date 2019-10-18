import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;

public class FirstComparator implements RawComparator {

    @Override
    public int compare(byte[] bytes, int i, int i1, byte[] bytes1, int i2, int i3) {
        return 0;
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    public int compare(WritableComparable a, WritableComparable b) {
        return a.compareTo(b);
    }
}
