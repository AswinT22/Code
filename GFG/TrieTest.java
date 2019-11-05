package GFG;

import java.util.*;

//https://practice.geeksforgeeks.org/problems/trie-delete/1
class TrieNode
{
    char content;
    boolean isEnd;
    int count;
    LinkedList<TrieNode> childList;
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
    }
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }
}
public class TrieTest
{   private static TrieNode root;
    TrieTest(){
        root = new TrieNode(' ');
    }
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            TrieTest z=new TrieTest();
            GfG g = new GfG();
            int n=sc.nextInt();
            ArrayList<String> keys=new ArrayList<String>();
            for(int i=0;i<n;i++){
                keys.add(sc.next());}
            for(int i = 0; i < keys.size(); i++)
            {
                insert(keys.get(i));
            }
            String abc=sc.next();
            GfG.deleteKey(root,abc);
            if(ifExsist(abc)==false)
                System.out.print("1");
            else
                System.out.print("");
            System.out.println();
        }
    }
    public static boolean ifExsist(String word)
    {
        TrieNode current = root;
        for (char ch : word.toCharArray() )
        {
            if (current.subNode(ch) == null)
                return false;
            else
                current = current.subNode(ch);
        }
        return current.isEnd == true;
    }
    public static void insert(String word)
    {
        if (ifExsist(word) == true)
            return;
        TrieNode current = root;
        for (char ch : word.toCharArray() )
        {
            TrieNode child = current.subNode(ch);
            if (child != null)
                current = child;
            else
            {
                current.childList.add(new TrieNode(ch));
                current = current.subNode(ch);
            }
            current.count++;
        }
        current.isEnd = true;
    }
}

/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below
Node is as follows:
class TrieNode
{
    char content;
    boolean isEnd;
    int count;
    LinkedList<TrieNode> childList;
    public TrieNode(char c)
    {
        childList = new LinkedList<TrieNode>();
        isEnd = false;
        content = c;
        count = 0;
    }
    public TrieNode subNode(char c)
    {
        if (childList != null)
            for (TrieNode eachChild : childList)
                if (eachChild.content == c)
                    return eachChild;
        return null;
    }
}*/
class GfG
{
    public static void deleteKey(TrieNode root,String word)
    {


        deleteKeyHelper(root,word,0,word.length());
    }
    public static boolean deleteKeyHelper(TrieNode root,String word,int level,int length)
    {

        if(root==null||level>length)
            return  false ;


        if(level==word.length()){
            if(root.count>0){
                root.isEnd=false;
                return false;
            }
            else {
                root=null;
                return true;
            }
        }
         else{
            boolean isDeleted=deleteKeyHelper(root.subNode(word.charAt(level)), word, level + 1,length);

            if(isDeleted){

                --root.count;

                if(!root.isEnd && root.count==0  )
                {
                    root=null;
                    return true;
                }

            }

            return false;
         }

    }

}