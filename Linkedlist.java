public class LinkedList<E> implements List<E> {
    // Reference to the first node in the sequence.
    private Node front;

    public void add(E element) {
        if (front == null) {
            // If the list is empty, assign the new node to the front.
            front = new Node(element);
        } else {
            // Otherwise, add the element to the end of the list.
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(element);
        }
    }

    public E remove(int index) {
        // You'll implement this in your project.
        Element removedElement = this[index];

    }

    public int size() {
        // Count the number of nodes starting from front.
        int result = 0;
        Node current = front;
        while (current != null) {
            result += 1;
            current = current.next;
        }
        return result;
    }

    private class Node {
        private final E value;
        private Node next;

        public Node(E value) {
            this(value, null);
        }

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
