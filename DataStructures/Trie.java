package DataStructures;

import java.util.Scanner;

public class Trie {

    static final int MAX_SIZE = 26;

    static class TrieNode {

        boolean isEnd;
        TrieNode[] children = new TrieNode[MAX_SIZE];

        TrieNode() {
            isEnd = false;
            for (int i = 0; i < MAX_SIZE; i++) {

                children[i] = null;
            }
        }

    }

    static TrieNode root;

    static void insert(String s){

        int level;
        int length=s.length();
        int index;
        TrieNode crawl=root;
        for ( level = 0;  level<length ; level++) {
            index=s.charAt(level)-'a';

            if(crawl.children[index]==null)
                crawl.children[index]= new TrieNode();
            crawl=crawl.children[index];
        }

        crawl.isEnd=true;
    }

    static boolean search(String key){

        int level;
        int length=key.length();
        int index;
        TrieNode crawl=root;
        for ( level = 0;  level<length ; level++) {
            index=key.charAt(level)-'a';

            if(crawl.children[index]==null)
                return false;

            crawl=crawl.children[index];
        }

        return crawl.isEnd;

    }


    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};


        root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

//        https://practice.geeksforgeeks.org/problems/trie-insert-and-search/0
//        root = new TrieNode();
//        Scanner sc=new Scanner(System.in);
//        int testCases=sc.nextInt();
//
//        while(testCases-- >0){
//
//            int insertCount=sc.nextInt();
//
//            for (int i = 0; i <insertCount ; i++) {
//
//                insert(sc.next().trim());
//            }
//
//            if(search(sc.next().trim()))
//                System.out.println(1);
//            else
//                System.out.println(0);
//
//        }

    }

}
