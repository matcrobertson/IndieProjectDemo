package dsr.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Artist")
@Table(name = "artist")
public class Artist {

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "artistsSet")
    private Set<User> user = new HashSet<>();

    @Id
    @Column(name="artist_id")
    @GeneratedValue
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
//    @GenericGenerator(name = "id", strategy = "native")
    private int artistId;

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "deezer_id")
    private String deezerId;


}
