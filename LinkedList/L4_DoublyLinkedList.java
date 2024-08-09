package LinkedList;

public class L4_DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
     
    // AddFirst 
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head= newNode;
    }

    // Remove First
    public int removeFisrt(){
        if(head == null){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if(size == 1){
            head=tail= null;
            size--;
            return val;
        }
        
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }
    public void print(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverseDLL(){
        Node prev = null;
        Node curr = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev =curr;
            curr =next;
        }

        head = prev;
    }
    public static void main(String[] args) {
        L4_DoublyLinkedList dll = new L4_DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();

        // dll.removeFisrt();
        dll.reverseDLL();

        dll.print();

    }
}
