import java.util.*;
class Stack
{
	class Node
	{
    		char data;       
    		Node next;      

    		public Node(char x) {
			this.data = x;
			next = null;
   		}
	}
    private Node top;

    public Stack() {
        this.top = null;
    }
	void push(char x)        
	{
		Node node = new Node(x);		
		node.data = x;
		node.next = top;
		top = node;
		
	}    
	public char pop()        
	{
			
		char temp = top.data;
		top = top.next;	
		return temp;
	}
	public boolean isEmpty(){
		return top == null;
	}
}


public class BB
{ 
	static boolean areBB(String expr)
	{
		Stack s = new Stack();

		for(int i=0;i<expr.length();i++)
		{
			char x = expr.charAt(i);
			if(x=='{' || x=='[' || x=='(')
			{
				s.push(x);
				continue;
			}
			if(s.isEmpty())
				return false;
				
			char check;
			switch(x)
			{
				case ')' :
					check=s.pop();
					if(check == '[' || check == '{')
						return false;
						break ;
				case '}' :
					check=s.pop();
					if(check == '[' || check == '(')
						return false;
					break ;
				case ']' :
					check=s.pop();
					if(check == '(' || check == '{')
						return false;
					break ;
					
			}
		}
		return(s.isEmpty());
		
	}
		public static void main(String[] args)
		{
			Scanner Obj = new Scanner(System.in);
			System.out.println("Enter paranthesis :");
			String expr = Obj.nextLine();
			if(areBB(expr))
				System.out.println("Balanced");
			else
				System.out.println("Not Balanced");
		}
}
						