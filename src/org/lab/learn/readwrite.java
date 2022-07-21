package org.lab.learn;

import java.io.*;
/**
 * Copy one file to another using low level byte streams, one byte at a time.
 * @author www.codejava.net
 * 
 * https://www.codejava.net/java-se/file-io/how-to-read-and-write-binary-files-in-java
 */
public class readwrite {
    public static void main(String[] args) {
 
        String inputFile = "/home/lou1/file.text";
        String outputFile = "/home/lou1/filetext.copy";
 
        try (
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            int byteRead = -1;
 
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}