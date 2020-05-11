package dsr;



import dsr.entity.DeezerArtist.DataItem;
import dsr.entity.DeezerSong;

import dsr.persistence.DeezerAlbumDao;
import dsr.persistence.DeezerArtistDao;
import dsr.persistence.YoutubeDao;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * The type Deezer methods.
 */
public class DeezerMethods {


    /**
     * Gets artist albums.
     *
     * @param userDate the user date
     * @param artistId the artist id
     * @return the artist albums
     */
    public List<DeezerSong> getArtistAlbums(LocalDate userDate, String artistId) {
            String url = "https://api.deezer.com/artist/" + artistId + "/albums";
            List<DeezerSong> albumSongs = new ArrayList<>();
            DeezerArtistDao deezerArtist = new DeezerArtistDao();
            for (DataItem artistAlbum : deezerArtist.getResponse(url).getData()) {
                LocalDate albumDate = stringToLocalDate(artistAlbum.getReleaseDate());
                if (userDate.compareTo(albumDate) < 0) {
                    String albumTitle = artistAlbum.getTitle();
                    String trackList = artistAlbum.getTracklist();
                    albumSongs.addAll(addSongsToList(trackList, albumTitle, albumDate));
                }
            }
            return albumSongs;
        }


    /**
     * String to local date local date.
     *
     * @param myDate the my date
     * @return the local date
     */
    public LocalDate stringToLocalDate (String myDate) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
             return LocalDate.parse(myDate, formatter);
        }

    /**
     * Add songs to list list.
     *
     * @param trackList  the track list
     * @param albumTitle the album title
     * @param albumDate  the album date
     * @return the list
     */
    public List<DeezerSong> addSongsToList(String trackList, String albumTitle, LocalDate albumDate) {
            DeezerAlbumDao albumDao = new DeezerAlbumDao();

            List<DeezerSong> userSongs = new ArrayList<>();
            for (dsr.entity.DeezerAlbum.DataItem track : albumDao.getResponse(trackList).getData()) {
                DeezerSong song = new DeezerSong();
                song.setAlbumName(albumTitle);
                song.setArtistName(track.getArtist().getName());
                song.setReleaseDate(albumDate);
                song.setSongTitle(track.getTitle());
                // TODO: 5/9/20 uncomment when youtube stops its tantrum(tomorrow)
//                String youtubeId = youtubeVideoId(track.getTitle());
//                song.setVideoId(youtubeId);
                userSongs.add(song);
            }
            return userSongs;
        }

    /**
     * Youtube video id string.
     *
     * @param songName the song name
     * @return the string
     */
    public String youtubeVideoId(String songName) {
            String apiKey = "AIzaSyBOiirNwA9ES1-z_FGWhYuSV4TR20isGTI";
            String urlSongName = songName.replace(" ", "%20");
            String url = "https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=1&order=relevance&q=" + urlSongName + "&key=" + apiKey;
            YoutubeDao youtube = new YoutubeDao();
            return youtube.getResponse(url).getItems().get(0).getId().getVideoId();
        }

}
