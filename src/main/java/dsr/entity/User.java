package dsr.entity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * represents one user in the music application
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "user_id")
    private int id;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_artist",
            joinColumns = { @JoinColumn(name = "user_id")},
            inverseJoinColumns = { @JoinColumn(name = "artist_id") })
    private Set<Artist> artistsSet = new HashSet<>();

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne
    private Role role;

    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param password the password
     */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Instantiates a new User.
     *
     * @param role     the role
     * @param userName the user name
     * @param password the password
     */
    public User( Role role, String userName, String password) {
        this.role = role;
        this.userName = userName;
        this.password = password;
    }

}