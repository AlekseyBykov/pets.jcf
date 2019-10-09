//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.jcf.collection.data;

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
public class User {
    long id;
    String name;
}
