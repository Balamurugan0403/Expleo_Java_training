package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedstream {

    public static void main(String[] args) {

        try (BufferedReader buffinput = new BufferedReader(new FileReader("output.txt"));
             BufferedWriter bufOutput = new BufferedWriter(new FileWriter("output1.txt"))) {

            String line = "";

            while ((line = buffinput.readLine()) != null) {
                bufOutput.write(line);
                bufOutput.newLine();
            }

        } catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
