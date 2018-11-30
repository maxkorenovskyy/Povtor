import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        StringProcessor processor = new StringProcessor();
        String str = "";

        try {
            str = processor.readInputText();
        } catch (Exception e) {
            e.printStackTrace();
        }


        FileWriter nFile = new FileWriter("fileWriter.txt");

        nFile.write(processor.processText(str));

        nFile.close();
    }
}