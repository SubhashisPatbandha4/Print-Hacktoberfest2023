class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void bubbleSort() {
        if (head == null || head.next == null) {
            return; // List is empty or has only one element, no need to sort
        }

        boolean swapped;
        Node current;
        Node temp = null;

        do {
            swapped = false;
            current = head;

            while (current.next != temp) {
                if (current.data > current.next.data) {
                    // Swap the data of current and current.next
                    int tempData = current.data;
                    current.data = current.next.data;
                    current.next.data = tempData;
                    swapped = true;
                }
                current = current.next;
            }
            temp = current;
        } while (swapped);
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class BubbleSortLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(64);
        list.add(34);
        list.add(25);
        list.add(12);
        list.add(22);
        list.add(11);
        list.add(90);

        System.out.println("Original List:");
        list.display();

        list.bubbleSort();

        System.out.println("Sorted List:");
        list.display();
    }
}
