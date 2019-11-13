package alekseybykov.portfolio.jcf;

import alekseybykov.portfolio.jcf.data.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DisplayName("Tests for some manipulations with all the types of references")
class ReferencesTest {

    @Test
    @DisplayName("Attempt to remove empty references")
    void testGCEmptyReferences() {

        // Strong reference
        User user = User.builder().id(1).build();

        WeakReference<User> weakReference = new WeakReference<>(user);
        assertNotNull(weakReference);

        PhantomReference<User> phantomReference = new PhantomReference<>(user, new ReferenceQueue<>());
        assertNotNull(phantomReference);

        SoftReference<User> softReference = new SoftReference<>(user);
        assertNotNull(softReference);

        user = null; // user object will be removed in regular cycle of gc

        System.gc();

        assertNull(user);

        /* It might not work immediately, see in debug mode */
        /*assertNull(weakReference);
        assertNull(phantomReference);*/
        /*assertNull(softReference);*/ // will be removed if the JVM needs memory
    }
}
