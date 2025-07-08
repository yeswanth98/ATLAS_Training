class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private Node tail;
    private int size; 

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null (Size: " + size + ")");
    }
}

class Task002 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.displayList();
    }
}