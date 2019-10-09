//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.comparator;

import alekseybykov.portfolio.jcf.collection.data.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-09
 */
@DisplayName("Tests for implementation of comparable")
class ComparableTest {

    @Test
    @DisplayName("Sort array based on compareTo() logic")
    void testBasicCollectionMethods() {

        User[] users = {
            User.builder().id(1).build(),
            User.builder().id(0).build(),
            User.builder().id(2).build()
        };

        Arrays.sort(users);

        assertEquals(users[0].getId(), 0);
        assertEquals(users[1].getId(), 1);
        assertEquals(users[2].getId(), 2);
    }
}
