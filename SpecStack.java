
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Stack<Integer> s=new Stack<>();
            GfG g=new GfG();
            while(!g.isFull(s,n)){
                g.push(sc.nextInt(),s);
            }
            System.out.println(g.min(s));
        }
    }
}

/*This is a function problem.You only need to complete the function given below*/
/*Complete the function(s) below*/
class GfG{
    static Stack<Integer> minStack=new Stack<>();
    public void push(int a,Stack<Integer> s)
    {

        //add code here.
        if(isEmpty(s) || minStack.peek()>=a)
            minStack.add(a);

        s.add(a);
    }
    public int pop(Stack<Integer> s)
    {
        //add code here..

            int val = s.pop();
            if (val == minStack.peek())
                    minStack.pop();

      return val;
    }
    public int min(Stack<Integer> s)
    {
        //add code here.
        return minStack.peek();
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        //add code here.
        return s.size()>n;
    }
    public boolean isEmpty(Stack<Integer>s)
    {
        //add code here.
        return s.isEmpty();


    }
}