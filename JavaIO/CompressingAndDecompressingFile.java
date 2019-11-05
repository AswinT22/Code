package JavaIO;
import java.io.*;
import java.util.zip.*;

//The DeflaterOutputStream and InflaterInputStream classes provide mechanism to compress and decompress the data in the deflate compression format.

//DeflaterOutputStream class
//The DeflaterOutputStream class is used to compress the data in the deflate compression format. It provides facility to the other compression filters, such as GZIPOutputStream.



//public class CompressingAndDecompressingFile {
//
//    public static void main(String args[]){
//        try{
//            FileInputStream fin=new FileInputStream("Deflater.java");
//            FileOutputStream fout=new FileOutputStream("def.txt");
//            DeflaterOutputStream out=new DeflaterOutputStream(fout);
//
//            int i;
//            while((i=fin.read())!=-1){
//                out.write((byte)i);
//                out.flush();
//            }
//            fin.close();
//            out.close();
//        }catch(Exception e){System.out.println(e);}
//        System.out.println("rest of the code");
//    }
//}

//InflaterInputStream class
//The InflaterInputStream class is used to decompress the file in the deflate compression format. It provides facility to the other decompression filters, such as GZIPInputStream class.

public class CompressingAndDecompressingFile {

    public static void main(String[] args){
    try{
        FileInputStream fin=new FileInputStream("def.txt");
        InflaterInputStream in=new InflaterInputStream(fin);
        FileOutputStream fout=new FileOutputStream("D.java");

        int i;
        while((i=in.read())!=-1){
            fout.write((byte)i);
            fout.flush();
        }
        fin.close();
        fout.close();
        in.close();
    }catch(Exception e){System.out.println(e);}
    System.out.println("rest of the code");
}
}