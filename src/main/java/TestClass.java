//import java.io.IOException;
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//
//public class TestClass {
//    public static void main(String[] args) throws Exception {
//        String line =  "2015,1,1,10,6,2015-01-10,\"AA\",19805,\"AA\",\"N790AA\",\"1\",12478,1247802,31703,12892,\"1225\",\"1235\",0.00,0.00,0.00,\"\",345.00,2475.00";
//        String[] test = new String[2];
//        test = parseLine(line);
//    }
//
//    private static String[] parseLine(String line) throws IOException {
//
//        String[] result = new String[2];
//
//        CSVParser parser = CSVParser.parse(line, CSVFormat.RFC4180);
//        for (CSVRecord record : parser) {
//            System.out.println(record.get(14) + "; " + record.get(17));
//            result[0] = record.get(14);
//            result[1] = record.get(17);
//        }
//
//        return result;
//    }
//}