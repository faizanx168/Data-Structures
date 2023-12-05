package csv;

import edu.datastructures.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class T3_DynamicArrayRemoveFirst {
    @Test
    @DisplayName("T1 Remove first: Muhammad Faizan Abbasi")
    public void t1_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeFirst();
        Optional<String> actual = da.get(1);
        String expected = "c";
        assertEquals(expected,actual.get());
        System.out.println(da);
    }
    @Test
    @DisplayName("T2 Remove First: Muhammad Faizan Abbasi")
    public void t2_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeFirst();
        int actual = da.size();
        int expected = 2;
        assertEquals(expected,actual);
        System.out.println(da);
    }
    @Test
    @DisplayName("T3 Remove First: Muhammad Faizan Abbasi")
    public void t3_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeFirst();
        da.removeFirst();
        da.removeFirst();
        da.add("Z");
        int actual = da.size();
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("T4 Test removeFirst with one element")
    public void testRemoveFirstWithOneElement() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a");
        String deletedItem = da.removeFirst();
        assertEquals("a", deletedItem);
        assertEquals(0, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("T5 Test removeFirst with multiple elements")
    public void testRemoveFirstWithMultipleElements() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        String deletedItem = da.removeFirst();
        assertEquals("a", deletedItem);
        assertEquals(2, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("T6 Test removeFirst on an empty array")
    public void testRemoveFirstOnEmptyArray() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        String deletedItem = da.removeFirst();
        da.add("");
        System.out.println(da.size());
        assertNull(deletedItem);
        assertEquals(0, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("T7 Test multiple consecutive removeFirst calls")
    public void testMultipleConsecutiveRemoveFirstCalls() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeFirst();
        da.removeFirst();
        da.removeFirst();
        assertEquals(0, da.size());
    }

    @Test
    @DisplayName("T9 Test removeFirst and add a new element")
    public void testRemoveFirstAndAddNewElement() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeFirst();
        da.add("Z");
        assertEquals(3, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("T10 Test removeFirst on an array of integers")
    public void testRemoveFirstOnIntArray() {
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1, 2, 3);
        int deletedItem = da.removeFirst();
        assertEquals(1, deletedItem);
        assertEquals(2, da.size());
        System.out.println(da);
    }


}
