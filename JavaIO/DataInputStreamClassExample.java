package JavaIO;
import java.io.*;

//public class DataInputStream extends FilterInputStream implements DataInput
//
//
//Java DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.
//
//Java application generally uses the data output stream to write data that can later be read by a data input stream.


public class DataInputStreamClassExample {

    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("D:\\testout.txt");
        DataInputStream inst = new DataInputStream(input);
        int count = input.available();
        byte[] ary = new byte[count];
        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+"-");
        }
    }
}
