package nl.hva.miw.ads.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @Test
    public void add() {
        SinglyLinkedList l = new SinglyLinkedList();
        System.out.println(l);

        l.add(0, 400);
        l.add(0, 100);
        l.add(1, 200);
        l.add(2, 300);
        l.add(4, 500);

        String expected = "SinglyLinkedList{size=5} 100 200 300 400 500";
        String actual = l.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        SinglyLinkedList l = new SinglyLinkedList();

        l.add(0, 400);
        l.add(0, 100);
        l.add(1, 200);
        l.add(2, 300);
        l.add(4, 500);

        int expected = 100;
        int actual = l.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        SinglyLinkedList l = new SinglyLinkedList();

        l.add(0, 400);
        l.add(0, 100);
        l.add(1, 200);
        l.add(2, 300);
        l.add(4, 500);

        String expected = "SinglyLinkedList{size=3} 200 300 400";
        l.remove(4);
        l.remove(0);
        String actual = l.toString();
        assertEquals(expected, actual);
    }
}