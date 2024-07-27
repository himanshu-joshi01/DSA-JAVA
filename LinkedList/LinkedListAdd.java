package LinkedList;

public  class LinkedListAdd{

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

    public void addFirst(int data) {
        // step1 create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 newNode next-head  or linking
        newNode.next = head;
        // step3 head becomes newNode
        head = newNode;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static void main(String args[]) {
        LinkedListAdd ll = new LinkedListAdd();
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addLast(3);
        ll.print();
    }

}
