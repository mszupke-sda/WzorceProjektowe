package dekorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamApp {

    public static void main(String[] args) {

        int c;

        try {
            String filePath = "/Users/mszupke/Documents/Szkolenia/javabdg8wzorcprojektowe/src/main/resources/test.txt";
            InputStream inputStream =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(filePath)));

            while ((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }

            inputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
