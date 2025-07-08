class Node {
    int data;
    Node next;
    Node previous;

    Node(int value) {
        this.data = value;
        this.next = null;
        this.previous = null;
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

    void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public addFirst(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty, cannot remove first element.");
        }
        T removedData = head.data;
        head = head.next;

        if (head != null) {
            head.previous = null;
        } else {
            tail = null;
        }
        size--;
        return removedData;
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