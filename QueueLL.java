class Node
{
    int data;       
    Node next;      
 
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
 
class Queue
{
    private static Node rear = null, front = null;
    private static int count = 0;

    public void enqueue(int item)    
    { 
        System.out.printf("Inserting Element %d\n", item);
        Node node = new Node(item);
 
        if (front == null)
        {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
 
        count += 1;
    }
 
    public void dequeue()     
    {
        if (front == null)
        {
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }
        System.out.printf("Removing Element %d\n", front.data);
 
        // advance front to the next node
        front = front.next;
 
        // if the list becomes empty
        if (front == null) {
            rear = null;
        }
 
        // decrease the node's count by 1
        count -= 1;
 
        // return the removed item
    }
    public int peek()
    {
        
        if (front == null) {
            System.exit(-1);
        }
 
        return front.data;
    }
    private int size() {
        return count;
    }
    public void display(){
        Node current = front;
        System.out.println("Elements are ");
        while(current!=null){
            System.out.print(current.data +" ");
            current = current.next;
        }
        System.out.println();

    }
}
class QueueLL
{
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(2);  
        q.enqueue(3);
        q.enqueue(9);
        q.enqueue(6);
        q.enqueue(15);
        System.out.printf("The Front Element is :  %d\n", q.peek());
        q.display();
        q.dequeue(); 
        q.dequeue();
        q.dequeue();
        q.dequeue(); 
        q.display();
    }
}