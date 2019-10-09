//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-09
 */
@DisplayName("Tests for basic collection methods")
class CoreCollectionTest {

    @Test
    @DisplayName("Call basic collection methods")
    void testBasicCollectionMethods() {
        Collection<Integer> firstList = new ArrayList<>();

        firstList.add(1);

        assertTrue(firstList.add(1));
        assertEquals(firstList.size(), 2);

        Collection<Integer> secondList = new ArrayList<>();

        assertEquals(secondList.size(), 0);

        secondList.addAll(firstList);

        assertEquals(secondList.size(), 2);

        secondList.clear();

        assertEquals(secondList.size(), 0);
        assertTrue(secondList.isEmpty());

        Object[] array = firstList.toArray();
        assertEquals(array.length, 2);
    }
}
