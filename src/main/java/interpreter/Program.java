package interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) throws IOException {
        String roman = null;

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        while ((roman = reader.readLine()) != "")
        {
            Context context = new Context(roman);

            ArrayList<Expression> tree = new ArrayList<Expression>();
            tree.add(new ThousandExpression());
            tree.add(new HundredExpression());
            tree.add(new TenExpression());
            tree.add(new OneExpression());

            for (Expression exp : tree)
            {
                exp.Interpret(context);
            }

            System.out.println(roman + " = " + context.getOutput());
        }
    }
}
