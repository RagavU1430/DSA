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
    // Method to create a node and return it
    public static Node createNode(int data) {
        Node newNode = new Node(data);
        System.out.println("Node was created with value: " + data);
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
    }

    static void printList(Node head) {
        // node print pandrom
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println(" -> null");
    }
}
