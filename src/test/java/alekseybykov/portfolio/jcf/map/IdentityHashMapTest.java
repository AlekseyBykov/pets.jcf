package alekseybykov.portfolio.jcf.map;

import alekseybykov.portfolio.jcf.data.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.IdentityHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

@DisplayName("Tests for some concepts of IdentityHashMap")
class IdentityHashMapTest {

    @Test
    @DisplayName("Compare keys by references")
    void testCompareKeysByReferences() {

        Map<User, String> map = new IdentityHashMap<>();

        User firstUser = User.builder().id(1).regNumber(1).build();
        User secondUser = User.builder().id(2).regNumber(2).build();

        User thirdUser = User.builder().id(3).regNumber(3).build();
        User anotherThirdUser = User.builder().id(3).regNumber(3).build();
        User yetAnotherThirdUser = User.builder().id(3).regNumber(3).build();

        map.put(firstUser, "first user");
        map.put(secondUser, "second user");
        map.put(thirdUser, "third user");
        map.put(anotherThirdUser, "another third user [duplicate]");
        map.put(yetAnotherThirdUser, "yet another third user [duplicate]");

        assertEquals(thirdUser, anotherThirdUser);
        assertEquals(yetAnotherThirdUser, anotherThirdUser);
        assertEquals(thirdUser, yetAnotherThirdUser);

        assertNotSame(thirdUser, anotherThirdUser);
        assertNotSame(yetAnotherThirdUser, anotherThirdUser);
        assertNotSame(yetAnotherThirdUser, thirdUser);

        assertEquals(map.size(), 5);
    }
}
