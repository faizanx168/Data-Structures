package csv;

import edu.datastructures.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class T5_DynamicArrayRemove {
    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi")
    public void t1_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.remove("b");
        Optional<String> actual = da.get(1);
        String expected = "c";
        assertEquals(expected,actual.get());
        System.out.println(da);
    }
    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi")
    public void t2_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.remove("a");
        int actual = da.size();
        int expected = 2;
        assertEquals(expected,actual);
        System.out.println(da);
    }
    @Test
    @DisplayName("Remove: Muhammad Faizan Abbasi")
    public void t3_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.remove("a");
        da.remove("b");
        da.remove("c");
        da.add("Z");
        int actual = da.size();
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi Test remove with one element")
    public void testremoveWithOneElement() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a");
        boolean deletedItem = da.remove("a");
        assertTrue(deletedItem, "true");
        assertEquals(0, da.size());
        System.out.println(da);
    }
    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi Test remove with multiple elements")
    public void testremoveWithMultipleElements() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.remove("b");
        assertEquals(2, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi Test remove on an empty array")
    public void testremoveOnEmptyArray() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        boolean deletedItem = da.remove("b");
        assertFalse(deletedItem);
        assertEquals(0, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi Test multiple consecutive remove calls")
    public void testMultipleConsecutiveremoveCalls() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.remove("a");
        da.remove("b");
        da.remove("c");
        assertFalse(da.remove(""));
        assertEquals(0, da.size());
    }

    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi Test remove and add a new element")
    public void testremoveAndAddNewElement() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.remove("a");
        da.add("Z");
        assertEquals(3, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("Remove : Muhammad Faizan Abbasi Test remove on an array of integers")
    public void testremoveOnIntArray() {
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1, 2, 3);
        da.remove(2);
        assertEquals(2, da.size());
        System.out.println(da);
    }


}
