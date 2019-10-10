//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-10
 */
@DisplayName("Tests for some manipulations with all the types of references")
class ReferencesTest {

    @Test
    @SneakyThrows
    @DisplayName("Attempt to remove empty references")
    void testGCEmptyReferences() {

        // Strong reference
        Long key = 1L;

        WeakReference<Long> weakReference = new WeakReference<>(key);
        assertNotNull(weakReference);

        PhantomReference<Long> phantomReference = new PhantomReference<>(key, new ReferenceQueue<>());
        assertNotNull(phantomReference);

        SoftReference<Long> softReference = new SoftReference<>(key);
        assertNotNull(softReference);

        key = null;

        System.gc();

        assertNull(key);

        /* It might not work immediately, see in debug mode */
        assertNull(weakReference);
        assertNull(phantomReference);
        assertNull(softReference);
    }
}
