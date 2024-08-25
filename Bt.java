import java.util.Scanner;

class Node{
	Node left ,right;
	int data; 
  
  
	public Node (int d){ 
		left=null;
		right=null;
		data=d;
	}
}
public class Bt{
	Node root;
	Bt(){
		System.out.println("enter the element");
   		Scanner Obj =new Scanner(System.in);
   		root=create(Obj);
   	}
   	Node create(Scanner Obj){
    	int data=Obj.nextInt();
    	if(data==-1)
      	{
      	return null;
      	}
      
      	Node n=new Node(data);
      	n.left=create(Obj);
      	n.right=create(Obj);
      	return n;
   	}
   	void display(){
   		inorder(root);
   }
   void inorder(Node root){
   		if(root==null){
   			return;
   		}
   		inorder(root.left);
   		System.out.println(root.data);
   		inorder(root.right);
   	}
   
   public int countN()
   {
   		return countN(root);
   }
   public static int countN(Node root)
   {
    	if(root == null)
    		return 0;
    	else
    	{
    		int count = 1;
    		count += countN(root.left);
    		count += countN(root.right);
    		return count;
    	}
    }
    public static void printLeafNodes(Node root)
    {
    	if(root == null)
    		return;
    	if(root.left == null && root.right == null)
    	{
    		System.out.println(root.data +" ");
    		return;
    	}
    	if(root.left != null)
    		printLeafNodes(root.left);
    	if(root.right != null)
    		printLeafNodes(root.right);
    }
    		
   	   
   public static void main(String [] args)
    {
          Bt t= new Bt();
          t.display();
          System.out.println("Nodes: "+t.countN());
          System.out.println("Leaves Are :");
          t.printLeafNodes(t.root);
    }      
}