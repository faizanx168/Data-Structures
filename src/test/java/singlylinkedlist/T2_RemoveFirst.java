package singlylinkedlist;
import edu.datastructures.singlylinkedlist.SinglyLinkedList;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("SinglyLinkedList by: Muhammad Faizan")
public class T2_RemoveFirst extends _MainTest {
    @Test
    @DisplayName("Remove 1st item")
    public void t1(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A","B","C","D","E");
        sl.removeFirst();
        var actual = sl.size();
        var expected = 4;
        print.accept(sl.toString());
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Remove 1st item and check value")
    public void t1b(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A","B","C","D","E");
        sl.removeFirst();
        Optional<String> actual = sl.getFirstItem();
        var expected = "B";
        print.accept(sl.toString());
        assertEquals(expected,actual.get());
    }
    @Test
    public void t2(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A");
        sl.removeFirst();
        var actual = sl.size();
        var expected =0;
        print.accept(sl.toString());
        assertEquals(expected,actual);
    }
    @Test
    public void t3(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A","B","C","D","E");
        int size = sl.size();
        for(int i = 0; i<size;i++)
            sl.removeFirst();
        var actual = sl.size();
        var expected =0;
        print.accept(sl.toString());
        assertEquals(expected,actual);
    }
    public void deleteTooMuch(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A","B","C","D","E");
        int size = sl.size()+1;
        for(int i = 0; i<size;i++)
            sl.removeFirst();
        var actual = sl.size();
        var expected =0;
        print.accept(sl.toString());
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Remove all + 1")
    public void t6Exception(){
        assertThrows(NoSuchElementException.class
        ,()->{
                deleteTooMuch();
                });
    }
    @Test
    @DisplayName("Remove from Empty List")
    public void t4() {
        var sl = new SinglyLinkedList<>(String[]::new);
        assertThrows(NoSuchElementException.class, sl::removeFirst);
    }
    @Test
    @DisplayName("Remove First from List with One Element")
    public void t5() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A");
        sl.removeFirst();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Remove First Element Multiple Times")
    public void t6() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeFirst();
        sl.removeFirst();
        var actual = sl.size();
        var expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Remove All Elements")
    public void t7() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        int size = sl.size();
        for (int i = 0; i < size; i++)
            sl.removeFirst();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Remove All Elements (Duplicates)")
    public void t9() {
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A", "B", "A", "C", "A");
        int size = sl.size();
        for (int i = 0; i < size; i++)
            sl.removeFirst();
        var actual = sl.size();
        var expected = 0;
        assertEquals(expected, actual);
    }


}
