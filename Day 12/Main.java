import java.util.*;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// try to add element in the list

class CustomLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    // Add at the end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    // Add at the beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Remove from the beginning
    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    // Get element at index
    public T get(int index) {
        checkBounds(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
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

    // Size of the list
    public int size() {
        return size;
    }
    
    private void checkBounds(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }
        
}

class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(10);
        list.add("Apple");
        list.addFirst(55);
        list.displayList();
    }
}