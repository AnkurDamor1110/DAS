package LinkedList;

public class LinkedList {
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

    public void addMid(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        //3-variable and 4 step 
        Node prev = null;
        Node curr = tail =head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head = prev;
    }


    public void deleteNthFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp = head;
        while(temp != null){
            sz++;
            temp = temp.next;
        }
        if(sz < n){
            System.out.println("Warong index");
            return;
        }
        //frist node 
        if(n == sz){
            head = head.next; // removeTo frist
            return;
        }
        //  Anothe size-n node 
        Node prev = head;
        int isToFind = sz - n;
        int i=1;
        while(i < isToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public Node findMid(Node head){
        Node slow = head; // +1
        Node fast = head; // +2
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow; // slow is my midNode
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //setp- 1 find mid
        Node midNode = findMid(head);

        //setp- 2 reverse 2nd hlaf 
        Node prev =null;
        Node curr = midNode;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //setp- 3 check 1st and 2nd hlaf
        Node right = prev;
        Node left =head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            right=right.next;
            left = left.next;

        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        // ll.addFirst(5);
        // ll.addMid(2, 9);
      //  ll.removeFirst();
       // ll.removeLast();
        ll.print();
        // System.out.println(ll.recSearch(9) + " ");
        // System.out.println(size); // ll.size
        ll.reverse();
        // ll.print();
    // System.out.println(ll.checkPalindrome());
        // ll.deleteNthFromEnd(7);
        ll.print();
       
        ll.print();
    }
}
