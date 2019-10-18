import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TextPair implements WritableComparable<TextPair> {

    private int ID;
    private byte DATA;

    public TextPair() {
        this.ID = 0;
        this.DATA = (byte)0;
    }

    public TextPair(int ID, byte DATA) {
        this.ID = ID;
        this.DATA = DATA;
    }

    public int getID() {
        return this.ID;
    }

    public byte getDATA() {
        return this.DATA;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        ID.write(dataOutput);
        DATA.write(dataOutput);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        ID.readFields(dataInput);
        DATA.readFields(dataInput);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(TextPair textPair) {
        return 0;
    }
}
