package JavaIO;

import java.io.FileWriter;


//public class FileWriter extends OutputStreamWriter
//
//Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.
//
//Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
//



public class FileWriterClassExample {

    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("D:\\testout.txt");
            fw.write("Welcome to FileWriter.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}
