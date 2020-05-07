package test.persistence;

import dsr.entity.Artist;
import dsr.entity.User;
import dsr.persistence.GenericDao;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistDaoTest {

    @Test
    public void insertArtist() {
        GenericDao<Artist> artistDao = new GenericDao<>(Artist.class);
        Artist artist = new Artist("Lil Wayne", "1");
        artistDao.insert(artist);
        Artist insertedArtist = artistDao.findByPropertyEqual("artistName", "Lil Wayne").get(0);
        assertEquals(artist.getArtistName(), insertedArtist.getArtistName());
    }
}
