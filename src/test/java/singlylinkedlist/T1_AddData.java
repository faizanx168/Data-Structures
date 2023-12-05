package singlylinkedlist;
import edu.datastructures.singlylinkedlist.SinglyLinkedList;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("SinglyLinkedList by: Muhammad Faizan")

public class T1_AddData extends _MainTest {
@Test
public void t1(){
    var sl = new SinglyLinkedList<>(String[]::new);
    sl.add("A","B","C","D","E");
    var actual = sl.size();
    var expected = 5;
    print.accept(sl.toString());
    assertEquals(expected,actual);
}
    @Test
    public void t2(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A","B","C","D","E");
        var actual = sl.getLastItem().get();
        var expected = "E";
        print.accept(sl.toString());
        assertEquals(expected,actual);
    }
    @Test
    public void t3(){
        var sl = new SinglyLinkedList<>(String[]::new);
        sl.add("A");
        var actual = sl.getLastItem().get();
        var expected =sl.getFirstItem().get();
        print.accept(sl.toString());
        assertEquals(expected,actual);
    }
}
