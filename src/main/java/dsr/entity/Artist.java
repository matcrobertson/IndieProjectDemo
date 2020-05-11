package dsr.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Artist.
 */
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
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int artistId;

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "deezer_id")
    private String deezerId;

    /**
     * Instantiates a new Artist.
     *
     * @param artistName the artist name
     * @param deezerId   the deezer id
     */
    public Artist( String artistName, String deezerId) {
//        this.user = user;
        this.artistName = artistName;
        this.deezerId = deezerId;
    }


}
