import org.apache.hadoop.io.WritableComparable;

public class TextPair implements WritableComparable<TextPair> {

    private int ID;
    private byte DATA;

    public TextPair(int, byte) {
        this.ID = ID;
        this.DATA = DATA;
    }

    
}
