package test;

import automationandprogramming.MorseCodeProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeProcessorTest {

    @Test
    public void testEncodeCharacter() {
        MorseCodeProcessor morseCodeProcessor = new MorseCodeProcessor();
        assertEquals("*-", morseCodeProcessor.encodeCharacter("A"));
    }

    @Test
    public void testDecodeCharacter() {
        MorseCodeProcessor morseCodeProcessor = new MorseCodeProcessor();
        assertEquals("A", morseCodeProcessor.decodeCharacter("*-"));
    }

    @Test
    public void testEncodeString() {
        MorseCodeProcessor morseCodeProcessor = new MorseCodeProcessor();
        assertEquals("**** * *-** *-** --- / *-- --- *-* *-** -** ", morseCodeProcessor.encodeString("HELLO WORLD"));
    }

    @Test
    public void testDecodeString() {
        MorseCodeProcessor morseCodeProcessor = new MorseCodeProcessor();
        assertEquals("HELLO WORLD", morseCodeProcessor.decodeString("**** * *-** *-** --- / *-- --- *-* *-** -**"));
    }
}
