package alekseybykov.portfolio.jcf.collection.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Tests for some concepts of ArrayList")
class ArrayListTest {

    @Test
    @DisplayName("Checks for item shift")
    void testShiftElements() {

        List<Integer> list = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

        assertEquals(list.size(), 5);

        for (int i = 0; i < list.size() ; i++) {
            list.remove(0); // shift
        }

        assertNotEquals(list.size(), 5);
    }
}
