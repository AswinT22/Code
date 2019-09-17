package JavaIO;


import java.io.File;
import java.io.PrintWriter;


//public class PrintWriter extends Writer
//
//Java PrintWriter class is the implementation of Writer class.
// It is used to print the formatted representation of objects to the text-output stream.



public class PrintWriterClassExample {



    public static void main(String[] args) throws Exception {
        //Data to write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("This is the first line");
        writer.flush();
        writer.close();
        //Data to write in File using PrintWriter
        PrintWriter writer1 =null;
        writer1 = new PrintWriter(new File("D:\\testout.txt"));
        writer1.write("This is the second line");
        writer1.flush();
        writer1.close();
    }

}
