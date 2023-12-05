package heroes;
import edu.learning.datatructure.java17.junit._MainTest;
import edu.datastructures.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.concurrent.atomic.AtomicReference;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Muhammad Faizan Abbasi: Max Mehtod test")
public class T3_Max extends _MainTest {
    @Test
    public void t1Max(){
        Integer[] items = {64,25, 12 ,18, 22 ,48};
         DynamicArray<Integer> da  =new DynamicArray(Integer[]::new);
         da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.max(( index, value)->{
            System.out.println(value);
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected =64;
        assertEquals(expected,actual,0f);
     }
    @Test
    public void t2Max(){
        String[] items = {"A","F","G", "X","Z","S"};
        DynamicArray<String> da  =new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        da.add(items);
        da.max(( index,value)->{
//            System.out.println(value);
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected ="Z";
        assertEquals(expected,actual);
    }
    @Test
    public void t3MaxWithEmptyArray() {
        Integer[] items = {};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.add(items);
        da.max((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        assertNull(actual);
    }

    @Test
    public void t4MaxWithAllNegativeNumbers() {
        Integer[] items = {-5, -2, -8, -1, -10};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.max((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = -1;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t5MaxWithMixedTypes() {
        Object[] items = {42, "A", 17, "B", 5};
        DynamicArray<Object> da = new DynamicArray<>(Object[]::new);
        da.add(items);
        AtomicReference<Object> atomicReference = new AtomicReference<>();
        da.max((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = "B";
        assertEquals(expected, actual);
    }

    @Test
    public void t6MaxWithAllEqualValues() {
        Double[] items = {3.14, 3.14, 3.14, 3.14, 3.14};
        DynamicArray<Double> da = new DynamicArray<>(Double[]::new);
        da.add(items);
        System.out.println(da);
        AtomicReference<Double> atomicReference = new AtomicReference<>();
        da.max((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        System.out.println(actual);
        var expected = 3.14;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t7MaxWithNullValues() {
        Integer[] items = {null, 12, null, 8, null};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.max((index, value) -> atomicReference.set(value));
        var expected = 12;
        var actual = atomicReference.get();
        assertEquals(expected,actual);
    }

    @Test
    public void t8MaxWithOnlyOneElement() {
        Float[] items = {99f};
        DynamicArray<Float> da = new DynamicArray<>(Float[]::new);
        da.add(items);
        AtomicReference<Float> atomicReference = new AtomicReference<>();
        da.max((index,  value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 99L;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t9MaxWithNegativeFloatingPointNumbers() {
        Float[] items = {-3.5f, -1.2f, -2.8f, -0.6f, -0.1f};
        DynamicArray<Float> da = new DynamicArray<>(Float[]::new);
        da.add(items);
        AtomicReference<Float> atomicReference = new AtomicReference<>();
        da.max((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = -0.1f;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void t10MaxWithMixedNumberTypes() {
        Number[] items = {3.5, 10, 7L, 2.5f, 15};
        DynamicArray<Number> da = new DynamicArray<>(Number[]::new);
        da.add(items);
        AtomicReference<Number> atomicReference = new AtomicReference<>();
        da.max((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void t11MaxWithDuplicatedMaximumValues() {
        Integer[] items = {7, 3, 5, 7, 8, 3};
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(items);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        da.max((index, value) -> atomicReference.set(value));
        var actual = atomicReference.get();
        var expected = 8;
        assertEquals(expected, actual, 0);
    }

}
