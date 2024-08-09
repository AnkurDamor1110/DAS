package LinkedList;


public class L3_Zig_Zag_LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {   // static hoy ke na hoy chalse ...... beacuse object thi call thay chhe 
        // 1.create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // 2.new node's next head
        newNode.next = head;

        // 3.noe head =newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // 2.
        tail.next = newNode;
        // 3.
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag(){
        Node mid = getMid(head);

        //reverse 2nd half 
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Zig-Zag
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    
    
    
   
    public static void main(String[] args) {
        L3_Zig_Zag_LinkedList ll = new L3_Zig_Zag_LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addFirst(5);
        ll.addFirst(10);
  
        ll.print();

    //    ll.mergeSort(ll.head);
        ll.zigZag();

        ll.print();
        
       
    }
}
