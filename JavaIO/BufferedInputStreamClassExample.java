package JavaIO;
import java.io.*;

//public class BufferedInputStream extends FilterInputStream
//
//Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.
//
//The important points about BufferedInputStream are:
//
//       1. When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
//       2. When a BufferedInputStream is created, an internal buffer array is created.


//int read()	It read the next byte of data from the input stream.
public class BufferedInputStreamClassExample {


    public static void main(String[] args){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
