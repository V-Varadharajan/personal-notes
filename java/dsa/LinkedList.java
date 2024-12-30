public class LinkedList {
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }
    LinkedList() {
        head = null;
    }

    public void insertAtF(int value) {
        Node newLinked = new Node(value);
        newLinked.next = null;
        if(head == null) {
            head = newLinked;
        } else {
            newLinked.next = head;
            head = newLinked;
        }
    }

    public void insertAtM(int value, int target)  {
        if(target == 0) {
            insertAtF(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;

        for(int i = 1; i<target; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        }

    public void insertAtB(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList  list = new LinkedList();

        list.insertAtF(15);
        list.insertAtF(5);
        list.insertAtF(0);
        list.insertAtB(25);
        list.insertAtM(9,2);

        list.display();
    }
}
