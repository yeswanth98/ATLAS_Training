class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomQueue {
    Node front; 
    Node rear;
    int size;

    public CustomQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean is_empty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node temp = new Node(data);
        if (rear == null) {
            front = temp;
            rear = temp;
        } 
        else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public int deque() {
        if (is_empty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return front.data;
    }

    public int peek() {
        if (is_empty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public void display() {
        if(is_empty()) {
            System.out.println("Queue is empty");
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        System.out.println(queue.is_empty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println(queue.peek());
        queue.deque();
        queue.display();
        System.out.println(queue.is_empty());
        System.out.println(queue.size());
    }
}