package singlylinkedlist;

import edu.datastructures.singlylinkedlist.SinglyLinkedList;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName("SinglyLinkedList by: Muhammad Faizan")
public class T4_RemoveAll extends _MainTest {

    @Test
    @DisplayName("Remove All Elements from an Empty List")
    public void testRemoveAllEmptyList() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove All Elements from a List with One Element")
    public void testRemoveAllFromListWithOneElement() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove All Elements from a List with Five Elements")
    public void testRemoveAllFromListWithFiveElements() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove All Elements from a List with Duplicates")
    public void testRemoveAllFromListWithDuplicates() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "A", "C", "A");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove All Elements from a List with Null Values")
    public void testRemoveAllFromListWithNullValues() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", null, "B", null, "C");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Remove All Elements from a List with Negative Numbers")
    public void testRemoveAllFromListWithNegativeNumbers() {
        var sl = new SinglyLinkedList<>(Integer[]::new);
        sl.add(-1, -2, -3, -4, -5);
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Remove All Elements from a Large List")
    public void testRemoveAllFromLargeList() {
        var sl = new SinglyLinkedList<>(Integer[]::new);
        for (int i = 0; i < 1000; i++) {
            sl.add(new Integer[]{i});
        }
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove All Elements from a List with Zeroes")
    public void testRemoveAllFromListWithZeroes() {
        var sl = new SinglyLinkedList<>(Integer[]::new);
        sl.add(0, 0, 0, 0, 0);
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Remove All Elements")
    public void t8() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Remove All Elements from a List with Mixed Data Types")
    public void testRemoveAllFromListWithMixedDataTypes() {
        var sl = new SinglyLinkedList<>(Object[]::new);
        sl.add("A", 123, 3.14, true, null);
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }


}
