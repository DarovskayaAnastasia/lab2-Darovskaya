import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TextPair implements WritableComparable<TextPair> {

    private int ID;
    private byte DATA;

    public TextPair(int, byte) {
        this.ID = ID;
        this.DATA = DATA;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public void setDATA(byte DATA) {
        this.DATA = DATA;
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
        return this.ID.toString() + this.DATA.toString();
    }

    @Override
    public int compareTo(TextPair textPair) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
