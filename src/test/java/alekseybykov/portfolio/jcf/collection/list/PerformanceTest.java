//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.collection.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-10
 */
@DisplayName("Tests for some concepts of Lists")
class PerformanceTest {

    private static final int size = 100_000;

    @Test
    @DisplayName("Insert in the start position of the list with shifting")
    void testInsertInStartOfList() {
        long t1 = getTimeOfInsertWithShifting(new ArrayList(), 0);
        long t2 = getTimeOfInsertWithShifting(new LinkedList(), 0);

        assertTrue(t1 > t2);
    }

    @Test
    @DisplayName("Insert in the end position of the list with shifting")
    void testInsertInEndOfList() {
        long t1 = getTimeOfInsertWithShifting(new ArrayList(), size);
        long t2 = getTimeOfInsertWithShifting(new LinkedList(), size);

        assertTrue(t1 > t2);
    }

    private long getTimeOfInsertWithShifting(List list, int position) {
        long startTime = new Date().getTime();
        insertWithShifting(list, position);
        long endTime = new Date().getTime();

        return endTime - startTime;
    }

    private void insertWithShifting(List list, int position) {
        for (int i = 0; i < size ; i++) {
            if (position == size) {
                list.add(i);
            } else {
                list.add(0, i);
            }
        }
    }
}
