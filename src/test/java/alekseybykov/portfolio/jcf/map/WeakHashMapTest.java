//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.map;

import alekseybykov.portfolio.jcf.data.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.WeakHashMap;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-10
 */
@DisplayName("Tests for some concepts of WeakHashMap")
class WeakHashMapTest {

    @Test
    @DisplayName("Remove object from Map by empty references")
    void testRemoveObjectByEmptyWeakReference() {
        String key = "key";

        User user = User.builder().id(-1).build();

        Map<String, User> weakHashMap = new WeakHashMap<>();

        weakHashMap.put(key, user);

        assertNotNull(weakHashMap.get("key"));

        key = null;
        System.gc();

        /* It might not work immediately, see in debug mode */
        assertNull(weakHashMap.get("key"));
    }
}
