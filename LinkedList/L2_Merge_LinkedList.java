package LinkedList;

public class L2_Merge_LinkedList {
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

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid =getMid(head);
        
        //left and right 
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public Node merge(Node head1,Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergell.next;

    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    
    
    
   
    public static void main(String[] args) {
        L2_Merge_LinkedList ll = new L2_Merge_LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(5);
        ll.addFirst(10);
  
        ll.print();

    //    ll.mergeSort(ll.head);

        ll.print();
        
       
    }
}
