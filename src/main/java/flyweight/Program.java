package flyweight;

public class Program {

    public static void main(String[] args) {

        String document = "SAMPLE TEXT";
        char[] CharsInDocument = document.toCharArray();

        String[] colors = new String[CharsInDocument.length];

        for (int i = 0; i < CharsInDocument.length; i++)
        {
            colors[i] = ConsoleColors.WHITE;
            if (i % 2 != 0)
            {
                colors[i] = ConsoleColors.GREEN;
            }
        }

        CharsFactory CharsFactory = new CharsFactory();

        for (int i = 0; i < CharsInDocument.length; i++)
        {
            Char letter = CharsFactory.GetChar(CharsInDocument[i]);
            letter.DisplayText(colors[i]);
        }

        System.out.println("\nNumber of repeating characters: " + CharsFactory.numberRepeatingChars);
    }
}
