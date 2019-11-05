package JavaIO;

import java.io.*;


//ABC.txt  contents
//Programmers
//1
//2
//3
//Example
//Hello
//a Program is explained here .



//Java.io.StreamTokenizer class parses input stream into “tokens”.
// It allows to read one token at a time. Stream Tokenizer can recognize numbers, quoted strings, and various comment styles.


 //java.io.StreamTokenizer.commentChar(int arg) ignores all characters from the single-line comment character to the end of the line by this StreamTokenizer.
//public class StreamTokenizerClassExample {
//
//
//     public static void main(String[] args) throws InterruptedException,
//             FileNotFoundException, IOException
//     {
//         FileReader reader = new FileReader("ABC.txt");
//         BufferedReader bufferread = new BufferedReader(reader);
//         StreamTokenizer token = new StreamTokenizer(bufferread);
//         // Use of commentChar() method
//         token.commentChar('a');
//         int t;
//         while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
//         {
//             switch (t)
//             {
//                 case StreamTokenizer.TT_NUMBER:
//                     System.out.println("Number : " + token.nval);
//                     break;
//                 case StreamTokenizer.TT_WORD:
//                     System.out.println("Word : " + token.sval);
//                     break;
//
//             }
//         }
//     }
// }




 // java.io.StreamTokenizer.lineno() returns the current line number of this StreamTokenizer.
//public class StreamTokenizerClassExample {
//
//     public static void main(String[] args) throws InterruptedException,
//             FileNotFoundException, IOException
//     {
//         FileReader reader = new FileReader("ABC.txt");
//         BufferedReader bufferread = new BufferedReader(reader);
//         StreamTokenizer token = new StreamTokenizer(bufferread);
//
//         token.eolIsSignificant(true);
//         // Use of lineno() method
//         // to get current line no.
//         System.out.println("Line Number:" + token.lineno());
//
//         token.commentChar('a');
//         int t;
//         while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
//         {
//             switch (t)
//             {
//                 case StreamTokenizer.TT_EOL:
//                     System.out.println("");
//                     System.out.println("Line No. : " + token.lineno());
//                     break;
//                 case StreamTokenizer.TT_NUMBER:
//                     System.out.println("Number : " + token.nval);
//                     break;
//                 case StreamTokenizer.TT_WORD:
//                     System.out.println("Word : " + token.sval);
//                     break;
//
//             }
//         }
//     }
//}


//java.io.StreamTokenizer.toString() represents current Stream token as a string along with it’s line no.
//public class StreamTokenizerClassExample {
//    public static void main(String[] args) throws InterruptedException,
//            FileNotFoundException, IOException
//    {
//        FileReader reader = new FileReader("ABC.txt");
//        BufferedReader bufferread = new BufferedReader(reader);
//        StreamTokenizer token = new StreamTokenizer(bufferread);
//
//        int t;
//        while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
//        {
//            switch (t)
//            {
//                case StreamTokenizer.TT_NUMBER:
//                    // Value of ttype field returned by nextToken()
//                    System.out.println("Number : " + token.nval);
//                    break;
//                // Value of ttype field returned by nextToken()
//                case StreamTokenizer.TT_WORD:
//
//                    // Use of toStringn() method
//                    System.out.println("Word : " + token.toString());
//                    break;
//            }
//        }
//    }
//}


// java.io.StreamTokenizer.eolIsSignificant(boolean arg) tells whether to treat end of line as a token or not.
// If ‘arg’ is true, then it End Of Line is treated as a token.
// If true, then the method returns TT_EOL and set the ttype field when End Of Line is reached.
//If ‘arg’ is false then the End Of Line is treated simply as a white space.

public class StreamTokenizerClassExample {
    public static void main(String[] args) throws InterruptedException,
            IOException
    {
        FileReader reader = new FileReader("ABC.txt");
        BufferedReader bufferread = new BufferedReader(reader);
        StreamTokenizer token = new StreamTokenizer(bufferread);

        boolean arg = true;
        // Use of eolIsSignificant() method
        token.eolIsSignificant(arg);
        // Here the 'arg' is set true, so EOL is treated as a token

        int t;
        while ((t = token.nextToken()) != StreamTokenizer.TT_EOF)
        {
            switch (t)
            {
                case StreamTokenizer.TT_EOL:
                    System.out.println("End of Line encountered.");
                    break;
                case StreamTokenizer.TT_NUMBER:
                    System.out.println("Number : " + token.nval);
                    break;
                case StreamTokenizer.TT_WORD:
                    System.out.println("Word : " + token.sval);
                    break;

            }
        }
    }
}

