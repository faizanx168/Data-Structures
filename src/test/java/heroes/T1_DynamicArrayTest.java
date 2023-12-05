package heroes;

import edu.learning.datatructure.java17.data.Hero;
import edu.learning.datatructure.java17.junit._MainTest;
import edu.datastructures.array.DynamicArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T1_DynamicArrayTest extends _MainTest {
    static DynamicArray<Hero> da = new DynamicArray<>(Hero[]::new,10);
    @BeforeEach
    public  void beforeAll(){
        da.add(heroes);
        print.accept("-".repeat(50));
    }
    @Test
    @DisplayName("(1)")
    public void addHeroes(){
        print.accept(da);
        int expected = 39;
        int actual = da.size();
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("(1)")
    public void addHeroes2(){
        da.removeAll();
        print.accept(da);
        int expected = 0 ;
        int actual = da.size();
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("(1)")
    public void addHeroes3(){
        da.removeAll();
        print.accept(da);
        int expected = 0 ;
        int actual = da.size();
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("(1)")
    public void addHeroes4(){
        da.removeFirst();
        print.accept(da);
        int expected = 38;
        int actual = da.size();
        assertEquals(expected,actual);
    }
}
