//import org.apache.hadoop.io.WritableComparable;
//import java.io.DataInput;
//import java.io.DataOutput;
//import java.io.IOException;
//
//public class TextPair implements WritableComparable<TextPair> {
//
//    private Integer ID;
//    private Byte INDICATOR;
//
//    @SuppressWarnings("unused")
//    public TextPair() {
//        ID = 0;
//        INDICATOR = (byte)0;
//    }
//
//    @SuppressWarnings("unused")
//    public TextPair(Integer ID, Byte INDICATOR) {
//        this.ID = ID;
//        this.INDICATOR = INDICATOR;
//    }
//
//    @SuppressWarnings("unused")
//    public void setID(Integer ID) {
//        this.ID = ID;
//    }
//
//    @SuppressWarnings("unused")
//    public Integer getID() {
//        return this.ID;
//    }
//
//    @SuppressWarnings("unused")
//    public void setINDICATOR(Byte INDICATOR) {
//        this.INDICATOR = INDICATOR;
//    }
//
//    @SuppressWarnings("unused")
//    public byte getINDICATOR() {
//        return this.INDICATOR;
//    }
//
//
//    @Override
//    public void write(DataOutput dataOutput) throws IOException {
//        dataOutput.writeInt(this.ID);
//        dataOutput.writeByte(this.INDICATOR);
//    }
//
//    @Override
//    public void readFields(DataInput dataInput) throws IOException {
//        this.ID = dataInput.readInt();
//        this.INDICATOR = dataInput.readByte();
//    }
//
//    @Override
//    public String toString() {
//        return this.ID.toString() + this.INDICATOR.toString();
//    }
//
//    @Override
//    public int compareTo(TextPair textPair) {
//        return this.toString().compareTo(textPair.toString());
//    }
//}
