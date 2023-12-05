package ArrayUtilityHelper;

import edu.datastructures.array.ArrayUtilityHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static edu.datastructures.array.ArrayUtilityHelper.copyRange;
import static edu.datastructures.array.ArrayUtilityHelper.removeIndexes;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("ArrayUtilityHelper.copyRange by: Muhammad Faizan")

public class T3_ArrayUtilityHelperCopyRange {

    @Test
    public void t1_size() {
        String [] m1 = {"n1", "n2", "n3","n4","n5"};
        String[] newData = copyRange(String[]::new,m1,1,4 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 4;
        var actual = newData.length;
        assertEquals(expected,actual);
    }
    @Test
        public void t2_size() {
            String [] m1 = {"n1", "n2", "n3","n4","n5"};
            String[] newData = copyRange(String[]::new,m1,1,4 );
             System.out.println(ArrayUtilityHelper.toString(newData));
            var expected = "n5";
            var actual = newData[newData.length-1];
            assertEquals(expected,actual);
        }

    @Test
    public void t3_size() {
        Integer [] data = {3,5,2,7,5,8,45,6};
        Integer[] newData = copyRange(Integer[]::new,data,1,4 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 5;
        var actual = newData[newData.length-1];
        assertEquals(expected,actual);
    }
    @Test
    public void t4_size() {
        Integer [] data = {3,5,2,7,5,8,45,6};
        Integer[] newData = copyRange(Integer[]::new,data,4,6 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 45;
        var actual = newData[newData.length-1];
        assertEquals(expected,actual);
    }
    @Test
    public void t5_size() {
        Integer [] data = {3,6,7,9,5,8,45,6,4,5};
        Integer[] newData = copyRange(Integer[]::new,data,2,8 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 7;
        var actual = newData.length;
        assertEquals(expected,actual);
    }
    @Test
    public void t6_size() {
        String [] m1 = {"n1", "n2", "n3","n4","n5","n6","n7"};
        String[] newData = copyRange(String[]::new,m1,3,6 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n7";
        var actual = newData[newData.length-1];
        assertEquals(expected,actual);
    }
    @Test
    public void t7_size() {
        String [] m1 = {"n1", "n2", "n3","n4","n5","n6","n7"};
        String[] newData = copyRange(String[]::new,m1,3,6 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 4;
        var actual = newData.length;
        assertEquals(expected,actual);
    }
    @Test
    public void t8_size() {
        Float [] m1 = {2.5f,9.6f,6.8f,5.5f,2.6f,7.5f,9.85f};
        Float[] newData = copyRange(Float[]::new,m1,1,6 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 6;
        var actual = newData.length;
        assertEquals(expected,actual);
    }
    @Test
    public void t9_size() {
        Float [] m1 = {2.5f,9.6f,6.8f,5.5f,2.6f,7.5f,9.85f};
        Float[] newData = copyRange(Float[]::new,m1,1,6 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 9.85f;
        var actual = newData[newData.length-1];
        assertEquals(expected,actual);
    }
    @Test
    public void t10_size() {
        Float [] m1 = {2.5f,9.6f,6.8f,5.5f,2.6f,7.5f,9.85f};
        Float[] newData = copyRange(Float[]::new,m1,2,4 );
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = 2.6f;
        var actual = newData[newData.length-1];
        assertEquals(expected,actual);
    }
    @Test
    public void t11_size() {
        Float [] m1 = {2.5f,9.6f,6.8f,5.5f,2.6f,7.5f,9.85f};
        Float[] newData = removeIndexes(Float[]::new,m1,0 ,2,5);
        System.out.println(ArrayUtilityHelper.toString(newData));
    }
}
