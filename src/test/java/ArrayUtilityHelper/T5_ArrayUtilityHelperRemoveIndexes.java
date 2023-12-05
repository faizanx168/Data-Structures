package ArrayUtilityHelper;

import edu.datastructures.array.ArrayUtilityHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static edu.datastructures.array.ArrayUtilityHelper.removeIndexes;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("ArrayUtilityHelper.RemoveIndexes by: Muhammad Faizan")

public class T5_ArrayUtilityHelperRemoveIndexes {

    @Test
    public void t11_size() {
        Float [] data = {2.5f,9.6f,6.8f,5.5f,2.6f,7.5f,9.85f};
        Float[] newData = removeIndexes(Float[]::new,data,0 ,2,5);
        System.out.println(ArrayUtilityHelper.toString(newData));
        var  actual = data.length -3;
        var expected = newData.length;
        assertEquals(expected,actual);
    }
    @Test
    public void t2() {
        Integer[] data = {1, 2, 2, 3, 4, 4, 4};
        Integer[] newData = removeIndexes(Integer[]::new, data, 1, 3, 4);
        assertEquals(newData.length, 4);
    }

    @Test
    public void t4() {
        String[] data = {"apple", "banana", "cherry", "date"};
        String[] newData = removeIndexes(String[]::new, data, 1, 3);
        assertEquals(newData.length, 2);
    }

    @Test
    public void t5() {
        Float[] data = {2.5f, 3.0f, 4.2f, 1.7f};
        Float[] newData = removeIndexes(Float[]::new, data, 0, 2);
        assertEquals(newData.length, 2);
    }
    @Test
    public void t6() {
        Integer[] data = {1, 2, 3};
        Integer[] newData = removeIndexes(Integer[]::new, data, 1);
        assertEquals(newData.length, 2);
    }
    @Test
    public void t7() {
        Integer[] data = {1, 2, 3, 4, 5};
        Integer[] newData = removeIndexes(Integer[]::new, data, 3, 4);
        assertEquals(newData.length, 3);
    }
    @Test
    public void t8() {
        Integer[] data = {1, 2, 3, 4, 5};
        Integer[] newData = removeIndexes(Integer[]::new, data, 1, 3);
        assertEquals(newData.length, 3);
    }
    @Test
    public void t9() {
        Integer[] data = {1, 2, 3, 4, 5};
        Integer[] newData = removeIndexes(Integer[]::new, data, 0, 1);
        assertEquals(newData.length, 3);
    }

    @Test
    public void t10() {
        Integer[] data = {1, 2, 3};
        Integer[] newData = removeIndexes(Integer[]::new, data, 0, 1, 2);
        assertEquals(newData.length, 0);
    }
}
