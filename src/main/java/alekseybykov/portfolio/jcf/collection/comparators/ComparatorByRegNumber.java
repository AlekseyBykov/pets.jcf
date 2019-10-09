//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.collection.comparators;

import alekseybykov.portfolio.jcf.collection.data.User;
import lombok.NoArgsConstructor;

import java.util.Comparator;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-09
 */
@NoArgsConstructor
public class ComparatorByRegNumber implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getRegNumber() - o2.getRegNumber();
    }
}
