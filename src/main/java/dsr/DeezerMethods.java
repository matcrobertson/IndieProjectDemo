package dsr;



import dsr.entity.DeezerArtist.DataItem;
import dsr.persistence.DeezerAlbumDao;
import dsr.persistence.DeezerArtistDao;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class DeezerMethods {


    public List<String> getArtistAlbums(String artistId, LocalDate userDate) {
        String url = "https://api.deezer.com/artist/" + artistId + "/albums";
        DeezerArtistDao deezerArtist = new DeezerArtistDao();
        List<String> artistAlbums = new ArrayList<>();

        for(DataItem artistAlbum : deezerArtist.getResponse(url).getData()) {
            LocalDate albumDate = stringToLocalDate(artistAlbum.getReleaseDate());
//            if(userDate.compareTo(albumDate) > 0) {
                artistAlbums.add(artistAlbum.getTracklist());
//            }
        }
        return artistAlbums;
    }


        public LocalDate stringToLocalDate (String myDate) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
             return LocalDate.parse(myDate, formatter);
        }

        public List<dsr.entity.DeezerAlbum.DataItem> addToSongsList(List<String> newAlbums) {
            DeezerAlbumDao albumDao = new DeezerAlbumDao();
            List<dsr.entity.DeezerAlbum.DataItem> returnedSongs = new ArrayList<>();
            for(String album : newAlbums) {
                List<dsr.entity.DeezerAlbum.DataItem> tempList;
                tempList = albumDao.getResponse(album).getData();
                returnedSongs.addAll(tempList);
            }
            return returnedSongs;
        }
}
