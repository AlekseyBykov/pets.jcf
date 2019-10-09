//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.comparator;

import alekseybykov.portfolio.jcf.collection.comparators.ComparatorById;
import alekseybykov.portfolio.jcf.collection.comparators.ComparatorByRegNumber;
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
@DisplayName("Tests for multiple independent sorts")
class ComparatorTest {

    @Test
    @DisplayName("Sort array using different comparators")
    void testBasicCollectionMethods() {
        User[] users = {
            User.builder().id(0).regNumber(1).build(),
            User.builder().id(2).regNumber(0).build(),
            User.builder().id(1).regNumber(2).build()
        };

        Arrays.sort(users, new ComparatorById());

        assertEquals(users[0].getId(), 0);
        assertEquals(users[1].getId(), 1);
        assertEquals(users[2].getId(), 2);

        Arrays.sort(users, new ComparatorByRegNumber());

        assertEquals(users[0].getRegNumber(), 0);
        assertEquals(users[1].getRegNumber(), 1);
        assertEquals(users[2].getRegNumber(), 2);
    }
}
