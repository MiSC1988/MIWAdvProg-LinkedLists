package nl.hva.miw.ads.linkedlists;

/**
 * Doubly linked list.
 *
 * @author michel
 */
public class DoublyLinkedList {

    private class Node {
        int value;

        Node next=null;      // Link to next node
        Node prev=null;      // Link to previous node

        public Node(int value) {
            this.value = value;
        }
    }

    private int size = 0;           // Length of list
    private Node head = null;      // Link to first node

    public DoublyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    /**
     * Return the value in the list at position index.
     *
     * @param index
     * @return
     */
    public int get( int index ) {
        if (index < 0 || index > size) {
            return 0;

        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    /**
     * Add an element to the list at position index.
     *
     * @param index
     * @param value
     */
    public void add( int index, int value ) {
        if (index < 0 || index > size) {
            return;
        }
        // Implement, create a new Node for this entry.
        Node n = new Node(value);
        size++;

        if (index == 0) {
            if (head != null) {
                head.prev = n;
            }
            n.next = head;
            head = n;
            return;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        n.next = current.next;
        n.prev = current;

        if (current.next != null) {
            current.next.prev = n;
        }
        current.next = n;
    }

    /**
     * Remove an elmeent from the list at position index, if it exists.
     *
     * @param index
     */
    public void remove( int index ) {
        if (index < 0 || index > size) {
            return;
        }
        size--;

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev.next = current.next;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("DoublyLinkedList{size=").append(size).append("}");

        Node current = this.head;
        while ( current != null ) {
            sb.append(" ");
            sb.append( current.value );
            current = current.next;
        }

        return sb.toString();
    }



}
