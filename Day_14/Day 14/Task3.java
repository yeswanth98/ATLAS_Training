class CircularLinkedList<T> {
    Node head;
    Node tail;
    int size;

    CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
        } else {
            node.next = head;
            tail.next = node;
            head = node;
        }
        size++;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        CircularLinkedList<Object> list = new CircularLinkedList<>();
        list.add(5);
        list.add("Hi");
        list.add(85);
        list.traverse();
    }
}