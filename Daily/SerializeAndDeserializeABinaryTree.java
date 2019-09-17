package Daily;

//https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1
import java.util.*;
class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}
class SND{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Tree root=null;
			if(n==1){
				System.out.println(sc.nextInt());
				n--;
			}
			while(n-->0){
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				char lr=sc.next().charAt(0);
				if(root==null){
					root=new Tree(n1);
					switch(lr){
						case 'L':root.left=new Tree(n2);
						break;
						case 'R':root.right=new Tree(n2);
						break;
					}
				}
				else{
					insert(n1,n2,lr,root);
				}
			}
		ArrayList<Integer> aa=new ArrayList<Integer>();
		GfG g=new GfG();
		String s=g.serialize(root,aa);
		Tree root1=g.deSerialize(s);
		inorder(root1);
		System.out.println();
		}
	}
	public static void inorder(Tree root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
public static void insert(int n1,int n2,char lr,Tree root){
	if(root==null){
		return;
	}
	if(root.data==n1){
		switch(lr){
			case 'L':root.left=new Tree(n2);
			break;
			case 'R':root.right=new Tree(n2);
			break;
		}
	}
		insert(n1,n2,lr,root.left);
		insert(n1,n2,lr,root.right);
}
	}

/*This is a function problem.You only need to complete the function given below*/
/*Complete the given function
Node is as follows:
class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG{
	public String serialize(Tree root,ArrayList<Integer> aa) {
//add Code here.



	if(root == null){


		return "-1";
	}


	StringBuilder sb=new StringBuilder(String.valueOf(root.data));
	String left = serialize(root.left,aa);
	String right =serialize(root.right,aa);

	return  sb.append(",").append(left).append(",").append(right).toString();
}
public Tree deSerialize(String data) {
//add code here.
	String[] strArr=data.split(",");

	Queue<Integer> queue=new ArrayDeque<>();

	Arrays.stream(strArr).map(Integer::parseInt).forEach(queue::add);
	return deSerializeHelper(queue);
}

	public Tree deSerializeHelper(Queue<Integer> queue){

		if(queue.isEmpty())
			return new Tree(-1);
		int ele=queue.poll();
		if(ele==-1)
			return new Tree(-1);



		Tree root=new Tree(ele);

		Tree left=deSerializeHelper(queue);
		Tree right=deSerializeHelper(queue);

		if(left.data!=-1)
			root.left=left;

		if(right.data!=-1)
			root.right=right;

		return root;

	}
}