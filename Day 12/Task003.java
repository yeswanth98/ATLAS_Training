import java.util.*;

class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList<T> {
    private Node<T> head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T data) {
        addLast(data);
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(T data) {

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } 
        else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty, cannot remove first element.");
        }
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public T removeLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty, cannot remove last element.");
        }
        if (head.next == null) {
            T removedData = head.data;
            head = null;
            size--;
            return removedData;
        }
        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        T removedData = current.next.data;
        current.next = null;
        size--; 
        return removedData;
    }

    public T get(int index) {
        checkBounds(index);

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node<T> temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null (Size: " + size + ")");
    }

    public int size() {
        return size;
    }

    public void traverse() {
        display();
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size + ". Index must be between 0 and " + (size - 1) + " for get/remove.");
        }
    }
}

class Task003 {
    public static void main(String[] args) {
        CustomLinkedList<Object> list = new CustomLinkedList<>();
        list.add("FirstItem");
        list.addLast(100);
        list.addFirst(50);
        list.add("LastItem");
        list.display();
        System.out.println("Current Size: " + list.size());
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("Element at last index (" + (list.size() - 1) + "): " + list.get(list.size() - 1)); // NewLast
        System.out.println("Removed first: " + list.removeFirst());
        list.display();
        System.out.println("Removed last: " + list.removeLast()); // NewLast
        list.display();
        list.traverse();
    }
}