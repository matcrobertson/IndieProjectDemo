package dsr.controller;


import dsr.entity.DeezerArtist.ArtistResponse;
import dsr.entity.DeezerArtist.DataItem;
import dsr.persistence.DeezerArtistDao;
import dsr.persistence.DeezerSearchDao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DeezerMethods {


    public List<DataItem> getArtistAlbums(String artistId, LocalDate userDate) {
        String url = "https://api.deezer.com/artist/" + artistId + "/albums";
        DeezerArtistDao deezerArtist = new DeezerArtistDao();
        List<DataItem> artistAlbums = new ArrayList<>();

        for(DataItem artistAlbum : deezerArtist.getResponse(url).getData()) {
            LocalDate albumDate = stringToLocalDate(artistAlbum.getReleaseDate());
            if(userDate.compareTo(albumDate) > 0) {
                artistAlbums.add(artistAlbum);
            }
        }
        return artistAlbums;
    }


        public LocalDate stringToLocalDate (String myDate) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
             return LocalDate.parse(myDate, formatter);
        }
}
