//*LinkedList Class
//The LinkedList class will manage the nodes and provide methods to manipulate the list.

public class LinkedList {
    Node head;
    Node head_relleno;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Method to add a node at the front of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to add a node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to add multiple "B" nodes at the end of the list
    public void addMultipleBs(int x) {
        for (int i = 0; i < x; i++) {
            addLast("#");
        }
    }

    // Method to delete the first node
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to delete the last node
    public void deleteLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "");
            current = current.next;
        }
        System.out.println("");
    }

    // Method to get the size of the linked list
    public int getSize() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Método para eliminar toda la lista
    public void clear() {
        head = null;
    }
}
