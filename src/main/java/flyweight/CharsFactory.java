package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharsFactory {

    private final Map<Character, Char> chars = new HashMap<Character, Char>();
    Char letter = null;
    public int numberRepeatingChars;

    public Char GetChar(Character GiveChar)
    {

        if (chars.keySet().contains(GiveChar))
        {
            letter = chars.get(GiveChar);
            numberRepeatingChars++;
        }
        else
        {
            switch (GiveChar)
            {
                case 'P':
                    letter = new CharP();
                    break;
                case 'Z':
                    letter = new CharZ();
                    break;
                case 'R':
                    letter = new CharR();
                    break;
                case 'K':
                    letter = new CharK();
                    break;
                case 'L':
                    letter = new CharL();
                    break;
                case 'A':
                    letter = new CharA();
                    break;
                case 'D':
                    letter = new CharD();
                    break;
                case 'O':
                    letter = new CharO();
                    break;
                case 'W':
                    letter = new CharW();
                    break;
                case 'T':
                    letter = new CharT();
                    break;
                case 'E':
                    letter = new CharE();
                    break;
                case 'S':
                    letter = new CharS();
                    break;
                case 'Y':
                    letter = new CharY();
                    break;
                case 'M':
                    letter = new CharM();
                    break;
                case 'X':
                    letter = new CharX();
                    break;
                case ' ':
                    letter = new Space();
                    break;
            }
            chars.put(GiveChar, letter);
        }
        return letter;
    }
}
