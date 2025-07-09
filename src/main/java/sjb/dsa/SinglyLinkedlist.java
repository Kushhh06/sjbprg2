package sjb.dsa;

public class SinglyLinkedlist {
    Node head; 

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; 
            }
            temp.next = newNode; 
        }
    }
    
    public void display() {
    	Node current = head;
    	
    	while (current != null) {
    		System.out.println(current.data);
    		current = current.next;
    	}
		System.out.println("null");
		
	}
    public static void main(String[] args) {
		SinglyLinkedlist list=new SinglyLinkedlist();
		list.insert(10);
		list.insert(20);
		list.insert(40);
		
		list.display();
	}
}
