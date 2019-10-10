//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-10-09
 */
@Data
@Builder
@AllArgsConstructor
public class User implements Comparable<User> {
    private int id;
    private int regNumber;
    private String name;

    @Override
    public int compareTo(User o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        }
        return 0;
    }
}
