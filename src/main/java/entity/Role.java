package entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Role")
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private int id;
    private int userId;
    @Column(name = "role")
    private String role;

}
