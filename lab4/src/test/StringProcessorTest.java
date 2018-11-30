import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void processText() throws IOException {
        StringProcessor processor = new StringProcessor();

        // first test
        assertEquals(processor.processText("textetet google@gfgd.com text ewrweo@gkhsbkg.com"), "google@gfgd.com, ewrweo@gkhsbkg.com, ");
        // second test
        assertEquals(processor.processText("google@gfgd.com vwerwero@gkhsbkg.com"), "google@gfgd.com, vwerwero@gkhsbkg.com, ");
        // third test
        assertEquals(processor.processText("adasd@gmail.com text text"), "adasd@gmail.com, ");


        FileWriter nFile = new FileWriter("fileWriter.txt");

        nFile.write(processor.processText("google@fsdf.com vdsfsd@fdasf.com"));

        nFile.close();
    }
}