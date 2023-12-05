package ArrayUtilityHelper;

import edu.datastructures.array.ArrayUtilityHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("ArrayUtilityHelper.allocateMoreData by: Muhammad Faizan")

public class T4_ArrayUtilityAllocateMoreData {
    @Test
    @ DisplayName("allocateMoreData t1")
    public void t1_allocateMoreData() {
        String[] data1 = {"a1", "a2", "a3", "a4", "a5"};
        String[] data2 = {"a6","a7", "a8", "a9" };
        int newSize = 15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new,data1, newSize , data2 );
        System.out.println("newSize: " + newSize);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));
        var  expected = newSize;
        var actual = newData.length;
        assertEquals(expected,actual);
    }
    @Test
    @ DisplayName("allocateMoreData t2")
    public void t2_allocateMoreData() {
        String[] data1 = {"a1", "a2", "a3", "a4", "a5"};
        String[] data2 = {"a6","a7", "a8", "a9" };
        int newSize = 15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new,data1, newSize , data2 );
        System.out.println("newSize: " + newSize);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));
        String  expected = null;
        String actual = newData[newData.length-1];
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("allocateMoreData t3")
    public void t3_allocateMoreData() {
        String[] data1 = {"a1", "a2", "a3", "a4", "a5"};
        String[] data2 = {"a6", "a7", "a8", "a9"};
        int newSize = 20;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        assertEquals(newSize, newData.length);
    }


    @Test
    @DisplayName("allocateMoreData t4")
    public void t4_allocateMoreData() {
        String[] data1 = {"a1", "a2", "a3", "a4", "a5"};
        String[] data2 = {"a6", "a7", "a8", "a9"};
        int newSize = 20;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        var expected  = newData[0];
        var actual = data1[0];
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("allocateMoreData t5")
    public void t5_allocateMoreData() {
        String[] data1 = {"a1", "a2", "a3", "a4", "a5"};
        String[] data2 = {"a6", "a7", "a8", "a9"};
        int newSize = 20;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        var expected  = newData[5];
        var actual = data2[0];
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("allocateMoreData t6")
    public void t6_allocateMoreData() {
        String[] data1 = {"a1", "a2", "a3", "a4", "a5"};
        String[] data2 = {"a6", "a7", "a8", "a9"};
        int newSize = 9;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        var expected = data1.length + data2.length;
        var actual = newSize;
        assertEquals(newSize, actual);
    }

    @Test
    @DisplayName("allocateMoreData - For integers t7")
    public void t7_allocateMoreData() {
        Integer[] data1 = {1,3,5,7,8,9,235,5};
        Integer[] data2 = {1,3,5,7,8,9,235,5};
        int newSize = 20;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize,data2);
        assertEquals(newSize, newData.length);
    }

    @Test
    @DisplayName("allocateMoreData t8")
    public void t8_allocateMoreData() {
        Integer[] data1 = {1,3,5,7,8,9,235,5};
        Integer[] data2 = {1,3,5,7,8,9,235,5, 9,02};
        int newSize = 18;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize,data2);
        var expected  = data1.length + data2.length;
        assertEquals(expected, newData.length);
    }

    @Test
    @DisplayName("allocateMoreData t9")
    public void t9_allocateMoreData() {
        String[] data1 = {"a1", "a2", "a3", "a4", "a5"};
        int newSize = 5;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize);
        assertEquals(newSize, newData.length);
    }

    @Test
    @DisplayName("allocateMoreData t10")
    public void t10_allocateMoreData() {
        Integer[] data1 = {1,3,5,7,8,9,235,5};
        int newSize = 10;
        Integer[] newData = ArrayUtilityHelper.allocateMoreData(Integer[]::new, data1, newSize);
        var expected  = newData.length;
        var actual = newSize;
        assertEquals(expected, actual);
    }
}
