package dictionary;

import edu.datastructures.Dictionary.CustomDictionary;
import edu.datastructures.model.Stock;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Custom Dictonary Dealing with Duplicates: Muhammad Faizan Abbasi")
public class T2_DictionaryDuplicates extends _MainTest {
    CustomDictionary<String, Stock> map;
    @BeforeEach
    public void before() {
        map = new CustomDictionary<>(Stock[]::new);
        map.collisionEvent((index,entry)-> System.out.println("(" +index +") Collision: "+entry));
        map.put( new Stock("BCSF", 0.1097f));
        map.put( new Stock("FRO", 0.1368f));
        map.put( new Stock("NAT", 0.1262f));
        map.put( new Stock("HSBC", 0.0545f));
        map.put( new Stock("ESEA ", 0.075f));
        map.put( new Stock("ISNPY", 0.0676f));
        map.put( new Stock("KB", 0.0543f));
        map.put( new Stock("GLP", 0.0733f));
        map.put( new Stock("BBDC", 0.1122f));
        //Muhammad Faizan Abbasi, Developer
        System.out.println("before");

    }

    @Test
    @DisplayName("Update duplicates")
    public void t5b() {
        map.put(new Stock("HSBC", 0.416f));
        String expected = "HSBC";
        String actual = map.get(expected).get().getKey();
        assertEquals(expected, actual);
    }


}
