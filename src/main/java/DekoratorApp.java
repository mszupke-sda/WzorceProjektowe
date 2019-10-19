import dekorator.*;

public class DekoratorApp {

    public static void main(String[] args) {

        Napoj napoj1 = new Espresso();
        printNapoj(napoj1);

        Napoj napoj2 = new MocnoPalona();
        napoj2 = new Czekolada(napoj2);
        napoj2 = new Czekolada(napoj2);
        napoj2 = new BitaSmietana(napoj2);
        printNapoj(napoj2);

        Napoj napoj3 = new Bezkofeinowa();
        napoj3 = new Mleko(napoj3);
        printNapoj(napoj3);
    }

    private static void printNapoj(Napoj napoj) {
        System.out.println(napoj.pobierzOpis() + " " + napoj.koszt() + " zł");
    }
}
