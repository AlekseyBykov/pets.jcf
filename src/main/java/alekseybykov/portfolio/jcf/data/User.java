package alekseybykov.portfolio.jcf.data;

import lombok.*;

import java.util.Objects;

/**
 * @author Aleksey Bykov
 * @since 09.10.2019
 */
@Builder
@Getter
@Setter
@ToString
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                regNumber == user.regNumber &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regNumber, name);
    }
}
