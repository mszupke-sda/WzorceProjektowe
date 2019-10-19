package interpreter;

public abstract class Expression {

    public void Interpret(Context context)
    {
        if (context.getInput().length() == 0)
            return;

        if (context.getInput().startsWith(Nine()))
        {
            context.setOutput(context.getOutput() + (9 * Multiplier()));
            context.setInput(context.getInput().substring(2));
        }
        else if (context.getInput().startsWith(Four()))
        {
            context.setOutput(context.getOutput() + 4 * Multiplier());
            context.setInput(context.getInput().substring(2));
        }
        else if (context.getInput().startsWith(Five()))
        {
            context.setOutput(context.getOutput() + (5 * Multiplier()));
            context.setInput(context.getInput().substring(1));
        }

        while (context.getInput().startsWith(One()))
        {
            context.setOutput(context.getOutput() + (1 * Multiplier()));
            context.setInput(context.getInput().substring(1));
        }
    }

    public abstract String One();
    public abstract String Four();
    public abstract String Five();
    public abstract String Nine();
    public abstract int Multiplier();
}
