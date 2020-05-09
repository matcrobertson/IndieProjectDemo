package dsr.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DeezerSong {
    private String artistName;
    private LocalDate releaseDate;
    private String albumName;
    private String songTitle;


}
