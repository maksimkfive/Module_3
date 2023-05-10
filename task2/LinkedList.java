package task2;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data == data) {
                curr.next = curr.next.next;
                return;
            }

            curr = curr.next;
        }
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }

        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (count == index) {
                return curr.data;
            }

            count++;
            curr = curr.next;
        }

        return -1;
    }
}
