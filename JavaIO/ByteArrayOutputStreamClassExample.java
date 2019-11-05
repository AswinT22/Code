package JavaIO;


import java.io.*;


//public class ByteArrayOutputStream extends OutputStream
//
//Java ByteArrayOutputStream class is used to write common data into multiple files.
//In this stream, the data is written into a byte array which can be written to multiple streams later.
//
//The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
//
//he buffer of ByteArrayOutputStream automatically grows according to data.

public class ByteArrayOutputStreamClassExample {


    public static void main(String[] args)throws Exception{
        FileOutputStream fout1=new FileOutputStream("D:\\f1.txt");
        FileOutputStream fout2=new FileOutputStream("D:\\f2.txt");

        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        //This will just write to ByteArrayOutputStream
        bout.write(65);

        //From ByteArrayOutputStream it will writeTo specified output stream
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();//has no effect
        System.out.println("Success...");
    }
}


//    void writeTo(OutputStream out)	It is used for writing the complete content of a byte array output stream to the specified output stream.