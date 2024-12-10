package gr.aueb.cf.exfiles;

import java.io.*;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;
import org.apache.commons.io.FilenameUtils;




import static jdk.jfr.internal.SecuritySupport.getAbsolutePath;
import static jdk.jfr.internal.SecuritySupport.newFileInputStream;

public class BinaryData {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String folderPath = "C:/tmp/";
        String sourceFileName ;
        String sourceFilePath ;
        String destinationFileName;
        String destinationFilePath;
        String uniqueId ;
        String extension;
        byte [] buffer =  new byte[8192];
        int bytesRead;

        System.out.println("Εισάγετε το όνομα αρχείου ");
        sourceFileName = in.nextLine();
        sourceFilePath = Paths.get(folderPath,sourceFileName).toString();

        // UUID Creation
        uniqueId = UUID.randomUUID().toString().replace(":","_");
        destinationFileName = uniqueId + sourceFileName;
        destinationFilePath = Paths.get(folderPath,destinationFileName).toString();

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFilePath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFilePath))){
            while((bytesRead = bis.read(buffer)) != -1){
                bos.write(buffer,0, bytesRead);
            }
            System.out.println("H αντιγραφή ολοκληρώθηκε με επιτυχία! ");

            System.out.println("Πληρες όνομα του αρχικού αρχείου: " + new File (sourceFilePath).getAbsolutePath());
            System.out.println("Πλήρες όνομα του νέου αρχείου: " + new File (destinationFilePath).getAbsolutePath());

            //Εμφάνιση της επέκτασης αρχείου

            extension = FilenameUtils.getExtension(destinationFileName);

            System.out.println("Η επέκταση του αρχείου είναι: " + extension);


        }catch (IOException e){
            System.err.println(e.getMessage());
        }






        }



    }

