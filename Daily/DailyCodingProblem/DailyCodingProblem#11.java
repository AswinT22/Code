package Daily.DailyCodingProblem;


//https://www.geeksforgeeks.org/auto-complete-feature-using-trie/
//Implement an autocomplete system. That is, given a query string s and a set of all possible query strings,
// return all strings in the set that have s as a prefix.
//For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].


class DailyCodingProblem11 {

 static final int MAX_SIZE = 26;

 static class TrieNode {

      boolean isEnd;
      int count=0;
      TrieNode[] children = new TrieNode[MAX_SIZE];

      TrieNode() {
           isEnd = false;

           for (int i = 0; i < MAX_SIZE; i++) {
            children[i] = null;
           }
      }

 }

 static TrieNode root;

     static void insert(String s) {

          int level;
          int length = s.length();
          int index;
          TrieNode crawl = root;
          for (level = 0; level < length; level++) {
              index = s.charAt(level) - 'a';

              if (crawl.children[index] == null)
                 crawl.children[index] = new TrieNode();

              crawl = crawl.children[index];
              crawl.count++;
          }

          crawl.isEnd = true;
     }

     static boolean search(String key) {

          int level;
          int length = key.length();
          int index;
          TrieNode crawl = root;
          for (level = 0; level < length; level++) {
               index = key.charAt(level) - 'a';

               if (crawl.children[index] == null)
                  return false;

               crawl = crawl.children[index];
          }

          return crawl.isEnd;

     }


     static void printSuggestions(TrieNode Node,StringBuffer prefix ){

        if(Node==null)
          return;

        if(Node.isEnd)
          System.out.println(prefix);

        for (int i = 0; i < MAX_SIZE; i++) {

           if(Node.children[i]!=null){
               printSuggestions(Node.children[i],prefix.append((char)('a'+i)));
               prefix.deleteCharAt(prefix.length()-1);
           }

        }


     }

     static int autoSuggestions(String prefix){

      int level;
      int length = prefix.length();
      int index;
      TrieNode crawl = root;
      for (level = 0; level < length; level++) {
         index = prefix.charAt(level) - 'a';

         if (crawl.children[index] == null)
          return -1;

         crawl = crawl.children[index];
      }

       if(crawl.isEnd && crawl.count==0)
             return 0;

       printSuggestions(crawl,new StringBuffer(prefix));

       return 1;

     }

      public static void main(String args[])
      {
           // Input keys (use only 'a' through 'z' and lower case)
           String keys[] = {"hello", "dog", "hell", "cat", "a",
              "hel", "help", "helps", "helping"};

                   //{"the", "a", "there", "answer", "any",
                   //"by", "bye", "their"};


           root = new TrieNode();

           // Construct trie
           int i;
           for (i = 0; i < keys.length ; i++)
            insert(keys[i]);


           autoSuggestions("hell");


 }

}



