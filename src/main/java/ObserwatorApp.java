import obserwator.DanePogodowe;
import obserwator.Statystyka;
import obserwator.WarunkiBiezace;
import obserwator.WarunkiBiezaceCisnienia;

public class ObserwatorApp {

    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();
        WarunkiBiezace warunkiBiezace = new WarunkiBiezace(danePogodowe);
        Statystyka statystyka = new Statystyka(danePogodowe);
        WarunkiBiezaceCisnienia warunkiBiezaceCisnienia = new WarunkiBiezaceCisnienia(danePogodowe);

        danePogodowe.ustawStan(80, 65, 30.4f);
        danePogodowe.ustawStan(82, 70, 29.2f);
        danePogodowe.ustawStan(78, 90, 30.4f);
    }
}
