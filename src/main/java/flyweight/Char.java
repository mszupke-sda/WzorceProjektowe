package flyweight;

public abstract class Char {

    protected Character character;

    public Char(Character character)
    {
        this.character = character;
    }

    public void DisplayText(String color)
    {
        System.out.print(color + character + ConsoleColors.RESET);
    }
}
