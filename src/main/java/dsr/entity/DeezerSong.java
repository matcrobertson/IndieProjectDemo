package dsr.entity;

import lombok.Data;

import java.time.LocalDate;


/**
 * The type Deezer song.
 */
@Data
public class DeezerSong {
    private String artistName;
    private LocalDate releaseDate;
    private String albumName;
    private String songTitle;
    private String videoId;

}
