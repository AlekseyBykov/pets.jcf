package alekseybykov.portfolio.jcf.map;

import alekseybykov.portfolio.jcf.collection.map.EnumMapKey;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 10.10.2019
 */
@DisplayName("Tests for some concepts of EnumMap")
class EnumMapTest {

    @Test
    @DisplayName("Put elements in EnumMap")
    void testPutElementsInMap() {
        Map<EnumMapKey, String> map = new EnumMap<>(EnumMapKey.class);

        map.put(EnumMapKey.KEY_1, "first");
        map.put(EnumMapKey.KEY_2, "second");
        map.put(EnumMapKey.KEY_3, "third");

        assertEquals(map.size(), 3);
    }
}
