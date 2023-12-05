package csv;
import edu.datastructures.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class T2_DynamicArrayRemoveIndex {
    @Test
    @DisplayName("SVUtility: Muhammad Faizan Abbasi")
    public void t1_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeAt(1);
        Optional<String> actual = da.get(1);
        String expected = "c";
        assertEquals(expected,actual.get());
        System.out.println(da);
    }
    @Test
    @DisplayName("SVUtility: Muhammad Faizan Abbasi")
    public void t2_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeAt(1);
        int actual = da.size();
        int expected = 2;
        assertEquals(expected,actual);
        System.out.println(da);
    }
    @Test
    @DisplayName("SVUtility: Muhammad Faizan Abbasi")
    public void t3_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeAt(0);
        da.removeAt(0);
        da.removeAt(0);
        da.add("Z");
        int actual = da.size();
        int expected = 1;
        System.out.println(da);
        assertEquals(expected,actual);
    }
}
