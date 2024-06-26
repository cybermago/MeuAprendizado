package collections;

import java.util.HashSet;

public class CustomHashSet {
    public static void main(String[] args) {
        HashSet<String> banks = new HashSet<String>();
        banks.add("BB");
        banks.add("BNB");
        banks.add("BB");
        banks.add("BA");
        banks.add("CEF");
        banks.add("Banestes");
        banks.add("Bacem");

        System.out.println(banks.add("BNY") ? "sim" : "não");
        System.out.println(banks.size());
        System.out.println(banks.isEmpty());
        System.out.println(banks.contains("BB"));
        System.out.println(banks.remove("BB"));
        System.out.println(banks);
        System.out.println(banks.size());
        System.out.println(banks.isEmpty());
        System.out.println(banks.iterator("BB"));
    }
}
