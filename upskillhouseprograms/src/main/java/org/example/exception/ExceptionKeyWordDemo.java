package org.example.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionKeyWordDemo {

    public static void test() throws FileNotFoundException{
        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println("File reading completed");
    }


    public static void doDiv(int i, int j){
        if(j==0){
            throw new RuntimeException("You cant divide number with Zero");
        }
        System.out.println(i/j);
    }

    public static void main(String[] args){
        try{
            test();
        }catch(FileNotFoundException fx){
            System.out.println("File not founc exception araised");
        }
        try{
            doDiv(10, 2);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Division Finally executed");
        }
    }
}

