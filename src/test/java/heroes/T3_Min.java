package heroes;

import edu.learning.datatructure.java17.junit._MainTest;
import edu.datastructures.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Muhammad Faizan Abbasi: Min Mehtod test")
public class T3_Min extends _MainTest {
    @Test
    public void t1Min() {
        Integer[] items = {64, 25, 12, 18, 22, 48};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 12;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t2Min() {
        String[] items = {"A", "F", "G", "X", "Z", "S"};
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add(items);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = "A";
        assertEquals(expected, actual);
    }

    @Test
    public void t3MinWithEmptyArray() {
        Integer[] items = {};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.add(items);
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        assertNull(actual);
    }

    @Test
    public void t4MinWithAllNegativeNumbers() {
        Integer[] items = {-5, -2, -8, -1, -10};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = -10;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t5MinWithMixedTypes() {
        Object[] items = {42, "A", 17, "B", 5};
        DynamicArray<Object> da = new DynamicArray<>(Object[]::new);
        da.add(items);
        AtomicReference<Object> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void t6MinWithAllEqualValues() {
        Double[] items = {3.14, 3.14, 3.14, 3.14, 3.14};
        DynamicArray<Double> da = new DynamicArray<>(Double[]::new);
        da.add(items);
        AtomicReference<Double> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 3.14;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t7MinWithNullValues() {
        Integer[] items = {null, 12, null, 8, null};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
       var actual = atomicReference.get();
       var expected  = 8;
       assertEquals(expected,actual);
    }

    @Test
    public void t8MinWithOnlyOneElement() {
        Float[] items = {99f};
        DynamicArray<Float> da = new DynamicArray<>(Float[]::new);
        da.add(items);
        AtomicReference<Float> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 99f;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t9MinWithNegativeFloatingPointNumbers() {
        Float[] items = {-3.5f, -1.2f, -2.8f, -0.6f, -0.1f};
        DynamicArray<Float> da = new DynamicArray<>(Float[]::new);
        da.add(items);
        AtomicReference<Float> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = -3.5f;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t10MinWithMixedNumberTypes() {
        Number[] items = {3.5, 10, 7L, 2.5f, 15};
        DynamicArray<Number> da = new DynamicArray<>(Number[]::new);
        da.add(items);
        AtomicReference<Number> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 2.5f;
        assertEquals(expected, actual);
    }

    @Test
    public void t11MinWithDuplicatedMinimumValues() {
        Integer[] items = {7, 3, 5, 3, 8, 3};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.min((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 3;
        assertEquals(expected, actual, 0);
    }


}
