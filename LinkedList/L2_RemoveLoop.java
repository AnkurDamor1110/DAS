package LinkedList;

public class L2_RemoveLoop {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;

        while(fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;

            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle == false){
            return;
        }

        //Find meething point
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle

        prev.next =null;
    }
    public static void main(String[] args) {
        
        Node head = new Node(1);
        Node temp = new Node(5);
        head.next = temp;
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = temp;

        System.out.println(isCycle(head));
        removeCycle(head);
        System.out.println(isCycle(head));
    }
}
