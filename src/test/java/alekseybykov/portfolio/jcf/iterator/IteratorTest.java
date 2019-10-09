//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.iterator;

import alekseybykov.portfolio.jcf.collection.data.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-09
 */
@DisplayName("Tests for basic iterator methods")
class IteratorTest {

    @Test
    @DisplayName("Test for cursor position")
    void testBasicIteratorMethods() {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(iterator.next(), Integer.valueOf(10));

        ListIterator<Integer> listIterator = list.listIterator();
        listIterator.next();
        assertTrue(listIterator.hasPrevious());
        assertEquals(listIterator.previous(), Integer.valueOf(10));
    }

    @Test
    @DisplayName("Test for attempt to change primitive value")
    void testTryToChangePrivitive() {
        int[] array = {1, 2, 3, 4};
        for (int value : array) {
            ++value;
        }

        assertEquals(array[0], 1);
        assertNotEquals(array[0], 2);
    }

    @Test
    @DisplayName("Test for attempt to change object field")
    void testTryToChangeObjectField() {
        User zeroUser = User.builder().id(0).name("Zero user").build();
        User firstUser = User.builder().id(1).name("First user").build();

        User[] users = {zeroUser, firstUser};

        for (User user : users) {
            user.setName("User");
        }

        assertEquals(zeroUser.getName(), "User");
        assertEquals(firstUser.getName(), "User");
    }
}
