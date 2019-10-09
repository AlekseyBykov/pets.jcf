//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-09
 */
@DisplayName("Tests for basic map methods")
class CoreMapTest {

    @Test
    @DisplayName("Test for duplicates")
    void testForDuplicates() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Immutable", 1);
        map.put("Immutable", 1);
        map.put("Immutable", 2);
        map.put("Immutable", 3);
        map.put("Immutable", 2);

        assertEquals(map.get("Immutable"), Integer.valueOf(2));
        assertEquals(map.size(), 1);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            assertEquals(entry.getKey(), "Immutable");
            assertEquals(entry.getValue(), Integer.valueOf(2));
        }
    }
}