package JavaIO;
import java.io.*;


//public class BufferedOutputStream extends FilterOutputStream
//Java BufferedOutputStream class is used for buffering an output stream.
//It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.



// We are writing the textual information in the BufferedOutputStream object which is connected to the FileOutputStream object.


public class BufferedOutputStreamClassExample {

    public static void main(String[] args)throws Exception{
        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to OutputStream.";
        byte[] b = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}

// The flush() flushes the data of one stream and send it into another. It is required if you have connected the one stream with another.
//	void flush() It flushes the buffered output stream.
//  void write()	It writes the specified byte to the buffered output stream.