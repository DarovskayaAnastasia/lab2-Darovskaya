import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class TextPair implements WritableComparable<TextPair> {

    private Integer ID;
    private Byte DATA;

    @SuppressWarnings("unused")
    public TextPair() {
        ID = 0;
        DATA = (byte)0;
    }

    @SuppressWarnings("unused")
    public TextPair(Integer ID, Byte DATA) {
        this.ID = ID;
        this.DATA = DATA;
    }

    @SuppressWarnings("unused")
    public void setID(Integer ID) {
        this.ID = ID;
    }

    @SuppressWarnings("unused")
    public int getID() {
        return this.ID;
    }

    @SuppressWarnings("unused")
    public void setDATA(Byte DATA) {
        this.DATA = DATA;
    }

    @SuppressWarnings("unused")
    public byte getDATA() {
        return this.DATA;
    }


    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.ID);
        dataOutput.writeByte(this.DATA);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.ID = dataInput.readInt();
        this.DATA = dataInput.readByte();
    }

    @Override
    public String toString() {
        return this.ID.toString() + this.DATA.toString();
    }

    @Override
    public int compareTo(TextPair textPair) {
        return this.toString().compareTo(textPair.toString());
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
