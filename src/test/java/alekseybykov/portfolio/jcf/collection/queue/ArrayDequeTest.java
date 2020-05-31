package alekseybykov.portfolio.jcf.collection.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 10.10.2019
 */
@DisplayName("Tests for some methods of ArrayDeque")
class ArrayDequeTest {

    @Test
    @DisplayName("Add items to the deque and call methods")
    void testArrayDeque() {

        Deque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("A");
        arrayDeque.add("B");

        assertEquals(arrayDeque.getFirst(), "A");

        arrayDeque.push("-A");

        assertEquals(arrayDeque.getFirst(), "-A");
        assertEquals(arrayDeque.getLast(), "B");

        assertEquals(arrayDeque.size(), 3);

        assertEquals(arrayDeque.pop(), "-A");
        assertEquals(arrayDeque.pop(), "A");
        assertEquals(arrayDeque.pop(), "B");

        assertEquals(arrayDeque.size(), 0);
    }
}
