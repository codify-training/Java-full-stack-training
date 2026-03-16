package org.example.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

    public static void main(String[] args) {
        File file = new File("test.txt");
        try{
            FileReader fileReader = new FileReader(file);
        }catch (FileNotFoundException ex){
            System.out.println("File is not avaiable to read.");
        }
        System.out.println("File reading completed");

        }
    }

