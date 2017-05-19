import java.util.LinkedList;

public class linkedList {
	Node head; 
	 
    public int nthElement(int index){
        Node current = head;
        int count = 0; 
        while (current != null){ 
        	
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
		return 0;
 
    }
    public void push(int new_data){
 
        Node newNode = new Node(new_data);
 
        newNode.next = head;
 
        head = newNode;
    }

	public static void main(String[] args) {
		
	        LinkedList<Integer> list = new LinkedList<Integer>();
	        list.push(10);
	        list.push(20);
	        list.push(40);
	        list.push(60);
	        list.push(80);
	        list.push(100);
	 
	        System.out.println("The element at index 3 " + " is: "  +
	        list.get(3));
	        System.out.println("The element at index 1 " + " is: " + list.get(1));
	}

}
