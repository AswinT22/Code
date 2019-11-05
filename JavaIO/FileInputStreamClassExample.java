package JavaIO;
import java.io.FileInputStream;

//public class FileInputStream extends InputStream
//Java FileInputStream class obtains input bytes from a file.
//It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. You can also read character-stream data.
//But, for reading streams of characters, it is recommended to use FileReader class.


//read single character
public class FileInputStreamClassExample {


    public static void main(String[] args){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            int i=fin.read();
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}

//int read()	It is used to read the byte of data from the input stream.

//read all characters
//public class FileInputStreamClassExample {
//
//
//    public static void main(String args[]){
//        try{
//            FileInputStream fin=new FileInputStream("D:\\testout.txt");
//            int i=0;
//            while((i=fin.read())!=-1){
//                System.out.print((char)i);
//            }
//            fin.close();
//        }catch(Exception e){System.out.println(e);}
//    }
//}
