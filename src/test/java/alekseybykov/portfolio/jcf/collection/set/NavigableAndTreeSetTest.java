package alekseybykov.portfolio.jcf.collection.set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NavigableSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Aleksey Bykov
 * @since 10.10.2019
 */
@DisplayName("Tests for some concepts of NavigableSet and TreeSet")
class NavigableAndTreeSetTest {

    @Test
    @DisplayName("Check for natiral order sort and ceiling")
    void testNaturalOrderSortAndCeiling() {

        NavigableSet<Integer> treeSet = new TreeSet<>();

        assertTrue(treeSet.add(2));
        assertTrue(treeSet.add(5));
        assertTrue(treeSet.add(0));
        assertTrue(treeSet.add(1));

        assertFalse(treeSet.add(1));

        assertEquals(treeSet.ceiling(4), Integer.valueOf(5));

        // Natural sorting
        assertEquals(treeSet.pollFirst(), Integer.valueOf(0));
        assertEquals(treeSet.pollFirst(), Integer.valueOf(1));
        assertEquals(treeSet.pollFirst(), Integer.valueOf(2));
        assertEquals(treeSet.pollFirst(), Integer.valueOf(5));

        assertTrue(treeSet.size() == 0);
    }

    @Test
    @DisplayName("Checks for obtaining the subset and modifying both")
    void testExtractSubsetAndModifyBoth() {

        NavigableSet<Integer> treeSet = new TreeSet<>();

        assertTrue(treeSet.add(2));
        assertTrue(treeSet.add(7));
        assertTrue(treeSet.add(0));
        assertTrue(treeSet.add(1));

        assertEquals(treeSet.size(), 4);

        NavigableSet<Integer> subset = treeSet.headSet(5, true);

        assertEquals(subset.size(), 3);

        assertThrows(IllegalArgumentException.class,
                () -> subset.add(10), "key out of range");

        subset.add(4);

        assertEquals(treeSet.size(), 5);
        assertEquals(subset.size(), 4);
    }
}
