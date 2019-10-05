public class WritableComparable implements RawComparator {
    //...

    public int compare (WritableComparable a, WritableComparable b) {
        return a.compareTo(b);
    }
}
