package dsr;



import dsr.entity.DeezerArtist.DataItem;
import dsr.entity.DeezerSong;
import dsr.persistence.DeezerAlbumDao;
import dsr.persistence.DeezerArtistDao;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class DeezerMethods {


//    public DeezerSong getArtistAlbums(String artistId, LocalDate userDate) {
//
//        }
//        return artistAlbums;
//    }


        public LocalDate stringToLocalDate (String myDate) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
             return LocalDate.parse(myDate, formatter);
        }

//        public List<dsr.entity.DeezerAlbum.DataItem> addToSongsList(List<String> newAlbums) {
//
//            return returnedSongs;
//        }

    public void agregateData() {
        DeezerSong artistAlbum = new DeezerSong();
    }
}
