package org.lab.learn;

//public class readwritefaster {

import java.io.*;
/**
 * Copy one file to another using low level byte streams, 4KB at a time.
 * @author www.codejava.net
 */
public class readwritefaster {
    private static final int BUFFER_SIZE = 4096; // 4KB
 
    public static void main(String[] args) {
        
        String inputFile = "/home/lou1/file.text";
        String outputFile = "/home/lou1/filetext.copy";
 
 
        try (
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
 
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}