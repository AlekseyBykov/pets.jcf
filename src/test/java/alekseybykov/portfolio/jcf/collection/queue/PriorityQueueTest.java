package alekseybykov.portfolio.jcf.collection.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 10.10.2019
 */
@DisplayName("Tests for some methods of Queue")
class PriorityQueueTest {

    @Test
    @DisplayName("Add items to the queue in natural order and call methods")
    void testQueueWithNaturalOrderSort() {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(1);
        queue.offer(8);
        queue.offer(3);
        queue.offer(0);

        assertEquals(queue.poll(), Integer.valueOf(0));
        assertEquals(queue.remove(), Integer.valueOf(1));
        assertEquals(queue.element(), Integer.valueOf(3));
        assertEquals(queue.peek(), Integer.valueOf(3));

        assertEquals(queue.size(), 2);
    }

    @Test
    @DisplayName("Sort items in the queue in reverse order and call methods")
    void testQueueWithReverseOrderSort() {

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        queue.offer(1);
        queue.offer(8);
        queue.offer(3);
        queue.offer(0);

        assertEquals(queue.poll(), Integer.valueOf(8));
        assertEquals(queue.remove(), Integer.valueOf(3));
        assertEquals(queue.element(), Integer.valueOf(1));
        assertEquals(queue.peek(), Integer.valueOf(1));

        assertEquals(queue.size(), 2);
    }
}
