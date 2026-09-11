public class nodecreation {
    // Node ah define pandrom
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // static Node head;

    // Method to create a node and return it
    public static Node createNode(int data) {
        Node newNode = new Node(data);
        return newNode;
    }

    public static void main(String[] args) {
        // Create nodes and link them
        Node head = createNode(10);
        head.next = createNode(20);
        head.next.next = createNode(30);
        head.next.next.next = createNode(40);

        // Print the list
        printList(head);
        insert_pos(3, 25, head);
        printList(head);
    }

    static void printList(Node head) {
        // node print pandrom
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" -> null");
    }

    static void insert_pos(int pos, int data, Node head) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            System.out.println("Cannot insert at position 0 with current method signature (void). For pos 0, head reference needs to be updated externally.");
            return;
        }

        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
}