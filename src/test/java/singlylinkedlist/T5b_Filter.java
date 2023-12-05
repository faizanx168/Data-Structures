package singlylinkedlist;

import edu.datastructures.array.DynamicArray;
import edu.learning.datatructure.java17.data.Hero;
import edu.learning.datatructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("DynamicArray filter by: Muhammad Faizan")
public class T5b_Filter extends _MainTest {

    @Test
    @DisplayName("see all heros")
    public void t1() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e->true;
        sl.filter(predicate,sResults::add);
        var actual = sResults.size();
        var expected = 39;
        print.accept(sResults);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Filter by name")
    public void t2() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e->e.name().contains("hulk");
        sl.filter(predicate,sResults::add);
        var actual = sResults.size();
        var expected = 2;
        print.accept(sResults);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Filter power score")
    public void t3() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e->e.powerScore()>900;
        sl.filter(predicate,sResults::add);
        var actual = sResults.size();
        var expected = 10;
        print.accept(sResults);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Filter power score and company")
    public void t4() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e->e.powerScore()>900;
        predicate = predicate.and(e-> e.company().equals("marvel"));
        sl.filter(predicate,sResults::add);
        var actual = sResults.size();
        var expected = 7;
        print.accept(sResults);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Filter by company")
    public void t5() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.company().equals("dc");
        sl.filter(predicate, sResults::add);
        var actual = sResults.size();
        var expected = 17;
        print.accept(sResults);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Filter by power score below 500")
    public void t6() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.powerScore() < 500;
        sl.filter(predicate, sResults::add);
        var actual = sResults.size();
        var expected = 14; // Adjust the expected value accordingly
        print.accept(sResults);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Filter by hero name length")
    public void t7() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.name().length() > 10;
        sl.filter(predicate, sResults::add);
        var actual = sResults.size();
        var expected = 8;
        print.accept(sResults);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Filter by company and power score")
    public void t8() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.company().equals("dc");
        predicate = predicate.and(e -> e.powerScore() > 500);
        sl.filter(predicate, sResults::add);
        var actual = sResults.size();
        var expected = 6;
        print.accept(sResults);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Filter by hero name starting with 's'")
    public void t9() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.name().startsWith("s");
        sl.filter(predicate, sResults::add);
        var actual = sResults.size();
        var expected = 6;
        print.accept(sResults);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Filter by company and hero name")
    public void t10() {
        var sl = new DynamicArray<>(Hero[]::new);
        var sResults = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.company().equals("marvel");
        predicate = predicate.and(e -> e.name().contains("man"));
        sl.filter(predicate, sResults::add);
        var actual = sResults.size();
        var expected = 4;
        print.accept(sResults);
        assertEquals(expected, actual);
    }

}
