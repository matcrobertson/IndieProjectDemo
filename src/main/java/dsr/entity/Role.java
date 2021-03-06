package dsr.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Role.
 */
@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Role")
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    @Column(name = "role")
    private String role;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<User> users =  new HashSet<>();

    @Column(name = "user_name")
    private String userName;

//    public Role(String role) {
//        this.role = role;
//    }

    /**
     * Instantiates a new Role.
     *
     * @param role     the role
     * @param userName the user name
     */
    public Role(String role, String userName) {
        this.role = role;
        this.userName = userName;
    }

    /**
     * Add user.
     *
     * @param order the order
     */
    public void addUser(User order) {
        users.add(order);
        order.setRole(this);
    }


}
