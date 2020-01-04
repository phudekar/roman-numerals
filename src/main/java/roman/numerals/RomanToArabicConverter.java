package roman.numerals;

import java.util.HashMap;

public class RomanToArabicConverter {

    private HashMap<String, Integer> constants = new HashMap<>();

    public RomanToArabicConverter() {
        constants.put("I", 1);
        constants.put("V", 5);
        constants.put("X", 10);
        constants.put("L", 50);
        constants.put("C", 100);
        constants.put("D", 500);
        constants.put("M", 1000);
    }

    public int convert(String romanNumber) {
        int previous = 0;
        final char[] chars = romanNumber.toCharArray();
        int total = 0;
        for (char c : chars) {
            String s = String.valueOf(c).toUpperCase();
            if (constants.containsKey(s)) {
                final Integer current = constants.get(s);
                total = total + current;
                if (previous < current) {
                    total = total - (2 * previous);
                }
                previous = current;
            }
        }
        return total;
    }
}
