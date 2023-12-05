package csv;
import com.jbbwebsolution.fileutility.SVUtility;
import edu.datastructures.array.DynamicArray;
import edu.datastructures.model.simpleStock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class T1_ReadFile {
    @Test
    @DisplayName("SVUtility: Muhammad Faizan Abbasi")
    public void t1_size(){
       var svUtility = new SVUtility<simpleStock>();
       String fileName = "./data/cst3650.stock.quant.csv";
       java.net.URL resource = SVUtility.class.getClassLoader().getResource(fileName);
       svUtility.process(System.out::println,resource,simpleStock.class,2,",");
    }
    @Test
    @DisplayName("DynamicArray: Muhammad Faizan Abbasi")
    public void t2_size(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new,10);
        da.add("A");
        da.add("B");
        da.add("C");
        da.add("D");
        da.add("E");
        da.add("F");
        da.add("G");
        da.add("H");
        da.add("I");
        da.add("J");
        da.add("K");
        da.add("L");
        da.add("M");
        int actual = da.size();
        int expected = 13;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName(("DynamicArray: Muhammad Faizan Abbasi"))
    public void t3_get() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);
        da.add("A");       da.add("B");
        da.add("C");       da.add("D");
        da.add("E");       da.add("F");
        da.add("G");       da.add("H");
        da.add("I");       da.add("K");
        da.add("K");       da.add("L");
        da.add("M");
        da.add("N", "O", "P", "Q");
        var actual = da.get(16).get() + da.get(0).get();
        var expected = "Q" + "A";
        assertEquals(expected, actual);
        System.out.println(da);
    }

    @Test
    @DisplayName(("DynamicArray: Muhammad Faizan Abbasi"))
    public void t4_get() {
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);
        da.add("A");       da.add("B");
        var actual = da.get(16);
        var expected = Optional.empty();
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("SVUtility: Muhammad Faizan Abbasi")
    public void t5_size(){
        var svUtility = new SVUtility<simpleStock>();
        String fileName = "./data/cst3650.stock.quant.csv";
        java.net.URL resource = SVUtility.class.getClassLoader().getResource(fileName);
        DynamicArray<simpleStock> da = new DynamicArray<>(simpleStock[]::new,0);
        svUtility.process(da::add,resource,simpleStock.class,2,",");
        System.out.println(da.toString());
        var actual =da.size();
        var expected = 4500;
        var condition = actual > expected;
        assertTrue(condition);
    }
    @Test
    @DisplayName("SVUtility: Muhammad Faizan Abbasi")
    public void t6_size(){
        var svUtility = new SVUtility<simpleStock>();
        String fileName = "./data/cst3650.stock.quant.csv";
        java.net.URL resource = SVUtility.class.getClassLoader().getResource(fileName);
        DynamicArray<simpleStock> da = new DynamicArray<>(simpleStock[]::new,0);
        svUtility.process(da::add,resource,simpleStock.class,2,",");
        var actual =da.size();
        var expected = 4500;
        var condition = actual > expected;
        assertTrue(condition);
        da.removeAll();
        svUtility.process(da::add,resource,simpleStock.class,2,",");
        System.out.println(da);
    }
}