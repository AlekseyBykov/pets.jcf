//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.helpers.comparators;

import alekseybykov.portfolio.jcf.data.User;
import lombok.NoArgsConstructor;

import java.util.Comparator;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-09
 */
@NoArgsConstructor
public class ComparatorById implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getId() - o2.getId();
    }
}
