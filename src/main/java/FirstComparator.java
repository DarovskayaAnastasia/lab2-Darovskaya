import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparable;

import static org.graalvm.compiler.word.BarrieredAccess.readInt;

public class FirstComparator implements RawComparator {

    @Override
    public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
        Integer i1 = readInt(b1, s1);
        Integer i2 = readInt(b2, s2);

        return i1.compareTo(i2);
    }

    @Override
    public int compare(Object o, Object t1) {
        return 0;
    }

    public int compare(WritableComparable a, WritableComparable b) {
        TextPair pair1 = (TextPair)a;
        TextPair pair2 = (TextPair)b;
        return pair1.getID().compareTo(pair2.getID());
    }
}
