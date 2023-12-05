package csv;

import edu.datastructures.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class T4_DynamicArrayRemoveLast {
    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi")
    public void t1_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeLast();
        Optional<String> actual = da.get(1);
        String expected = "b";
        assertEquals(expected,actual.get());
        System.out.println(da);
    }
    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi")
    public void t2_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeLast();
        int actual = da.size();
        int expected = 2;
        assertEquals(expected,actual);
        System.out.println(da);
    }
    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi")
    public void t3_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a","b","c");
        da.removeLast();
        da.removeLast();
        da.removeLast();
        da.add("Z");
        int actual = da.size();
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi Test removeLast with one element")
    public void testremoveLastWithOneElement() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a");
        String deletedItem = da.removeLast();
        assertEquals(0, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi Test removeLast with multiple elements")
    public void testremoveLastWithMultipleElements() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        String deletedItem = da.removeLast();
        assertEquals(2, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi Test removeLast on an empty array")
    public void testremoveLastOnEmptyArray() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        String deletedItem = da.removeLast();
        assertNull(deletedItem);
        assertEquals(0, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi Test multiple consecutive removelast calls")
    public void testMultipleConsecutiveremoveLastCalls() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeLast();
        da.removeLast();
        da.removeLast();
        assertNull(da.removeLast());
        assertEquals(0, da.size());
    }

    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi Test removeLast and add a new element")
    public void testremoveLastAndAddNewElement() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeLast();
        da.add("Z");
        assertEquals(3, da.size());
        System.out.println(da);
    }

    @Test
    @DisplayName("Remove Last: Muhammad Faizan Abbasi Test removeLast on an array of integers")
    public void testremoveLastOnIntArray() {
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1, 2, 3);
        da.removeLast();
        assertEquals(2, da.size());
        System.out.println(da);
    }
}
