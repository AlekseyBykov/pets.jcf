//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.collection.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-10
 */
@DisplayName("Tests for custom implementation of Queue")
class CustomQueueTest {

    @Test
    @DisplayName("Check FIFO concepts")
    void testFIFO() {
        CustomQueue queue = new CustomQueue(10);

        queue.add(1L);
        queue.add(0L);
        queue.add(9L);
        queue.add(-1L);

        // FIFO
        assertEquals(queue.poll(), 1L);
        assertEquals(queue.poll(), 0L);
        assertEquals(queue.poll(), 9L);
        assertEquals(queue.poll(), -1L);

        assertTrue(queue.isEmpty());
    }

    @Test
    @DisplayName("Check for cyclic overriding")
    void testForCyclicOverriding() {
        CustomQueue queue = new CustomQueue(3);

        queue.add(1L);
        queue.add(1L);
        queue.add(21L);
        queue.add(31L);
        queue.add(41L);

        assertEquals(queue.poll(), 31L);
        assertEquals(queue.poll(), 41L);
        assertEquals(queue.poll(), 21L);
    }
}
