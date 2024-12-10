package gr.aueb.cf.exfiles;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FilesJson {

    public static void main(String[] args) throws IOException {

        String fileInput = "c:/tmp/locations.txt";
        String fileOutput = "c:/tmp/json.txt";
        String line ;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileInput));
             PrintStream ps = new PrintStream(fileOutput, StandardCharsets.UTF_8)) {

            reader.readLine();



            // Επεξεργασία των υπόλοιπων γραμμών
            while((line = reader.readLine()) != null ) {
                tokens = line.split(",+\\s*");


             //   if (tokens.length == 3) {
                    printFormatted(ps, tokens);
                    printFormatted(System.out, tokens);
               // }else {
                 //   System.err.println("Μη έγκυρη γραμμή:" + line);
                }



        }catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
           System.err.println("File not found in specified path");
        }


    }
    public static void printFormatted (PrintStream ps , String[] tokens){
        ps.printf("{ location: '%s' ,latitude: %.4f,longitude: %.4f }, \n",tokens[0],Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
    }
}
