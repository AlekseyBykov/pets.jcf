package alekseybykov.portfolio.jcf.comparator;

import alekseybykov.portfolio.jcf.data.User;
import lombok.NoArgsConstructor;

import java.util.Comparator;

/**
 * @author Aleksey Bykov
 * @since 09.10.2019
 */
@NoArgsConstructor
public class ComparatorById implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getId() - o2.getId();
    }
}
