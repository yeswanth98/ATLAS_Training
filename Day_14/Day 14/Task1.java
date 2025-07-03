class LinkedList<T> {
    Node head;
    int size;

    LinkedList() {
        this.head = null;
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
        node.next = head;
        head = node;
        size++;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println("");
    }

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(5);
        list.add("Hi");
        list.traverse();
    }
}