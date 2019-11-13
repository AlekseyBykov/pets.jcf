package alekseybykov.portfolio.jcf.map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for basic HashMap methods")
class HashMapTest {

    @Test
    @DisplayName("Check null as key")
    void testNullAsKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put(null, 10);
        map.put(null, 11);

        assertEquals(map.get(null), Integer.valueOf(11));
    }

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
