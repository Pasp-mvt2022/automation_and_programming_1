package automationandprogramming;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class MorseCodeProcessor {

    private static BidiMap<String, String> morseMap;

    public MorseCodeProcessor() {
        morseMap = new DualHashBidiMap<>();
        morseMap.put("A", "*-");
        morseMap.put("B", "-***");
        morseMap.put("C", "-*-*");
        morseMap.put("D", "-**");
        morseMap.put("E", "*");
        morseMap.put("F", "**-*");
        morseMap.put("G", "--*");
        morseMap.put("H", "****");
        morseMap.put("I", "**");
        morseMap.put("J", "*---");
        morseMap.put("K", "-*-");
        morseMap.put("L", "*-**");
        morseMap.put("M", "--");
        morseMap.put("N", "-*");
        morseMap.put("O", "---");
        morseMap.put("P", "*--*");
        morseMap.put("Q", "--*-");
        morseMap.put("R", "*-*");
        morseMap.put("S", "***");
        morseMap.put("T", "-");
        morseMap.put("U", "**-");
        morseMap.put("V", "***-");
        morseMap.put("W", "*--");
        morseMap.put("X", "-**-");
        morseMap.put("Y", "-*--");
        morseMap.put("Z", "--**");
        morseMap.put("1", "*----");
        morseMap.put("2", "**---");
        morseMap.put("3", "***--");
        morseMap.put("4", "****-");
        morseMap.put("5", "*****");
        morseMap.put("6", "-****");
        morseMap.put("7", "--***");
        morseMap.put("8", "---**");
        morseMap.put("9", "----*");
        morseMap.put("0", "-----");
        morseMap.put(".", "*-*-*-");
        morseMap.put(",", "--**--");
        morseMap.put("?", "**--**");
        morseMap.put(" ", "/");
    }

    public String encodeCharacter(String text) {
        return morseMap.get(text) == null ? "" : morseMap.get(text);
    }

    public String decodeCharacter(String morse) {
        return morseMap.getKey(morse) == null ? "" : morseMap.getKey(morse);
    }

    public String encodeString(String text) {
        StringBuilder encoded = new StringBuilder();
        for (Character c : text.toCharArray()) {
            encoded.append(encodeCharacter(c.toString()));
            encoded.append(" ");
        }
        return encoded.toString().trim();
    }

    public String decodeString(String morse) {
        StringBuilder decoded = new StringBuilder();
        for (String s : morse.split(" ")) {
            decoded.append(decodeCharacter(s));
        }
        return decoded.toString();
    }
}
