package alekseybykov.portfolio.jcf.collection.set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for some concepts of HashSet")
class HashSetTest {

    @Test
    @DisplayName("Check sorting in set by ascending of hashcodes")
    void testSortingByHashcodes() {

        Set<Integer> set = new HashSet<>();

        Integer firstItem = 1;
        Integer secondItem = 2;
        Integer thirdItem = 3;

        set.add(secondItem);
        set.add(thirdItem);
        set.add(firstItem);

        assertEquals(firstItem.hashCode(), 1);
        assertEquals(secondItem.hashCode(), 2);
        assertEquals(thirdItem.hashCode(), 3);

        Iterator<Integer> iterator = set.iterator();

        assertEquals(iterator.next(), firstItem);
        assertEquals(iterator.next(), secondItem);
        assertEquals(iterator.next(), thirdItem);
    }
}
