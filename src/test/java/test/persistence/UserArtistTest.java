package test.persistence;

import dsr.entity.Artist;
import dsr.entity.User;
import dsr.persistence.GenericDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserArtistTest {
    private GenericDao<User> genericDao;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(User.class);
    }
    @Test
    public void getUserArtistsTest() {
        genericDao = new GenericDao<User>(User.class);
        User user = (User)genericDao.getById(1);
        List<Artist> testList = new ArrayList<>(user.getArtistsSet());
        String arraylistArtist = testList.get(0).getArtistName();
//        Set<Artist> testSet = user.getArtistsSet();
        assertEquals("Eminem", arraylistArtist);
    }

    @Test
    public void addUserArtist() {
        User testUser = genericDao.getById(2);
        GenericDao<Artist> artistDao = new GenericDao<>(Artist.class);
//        Artist eminem = artistDao.getById(1);
        Artist eminem = artistDao.findByPropertyEqual("artistName", "eminem").get(0);
        int dumb = eminem.getArtistId();
        Artist stuff = artistDao.getById(dumb);
        Set<Artist> artistSet = testUser.getArtistsSet();
        artistSet.add(stuff);
        testUser.setArtistsSet(artistSet);

        genericDao.saveOrUpdate(testUser);

        User updatedUser = genericDao.getById(2);
        Set<Artist> updatedUserArtistsSet = updatedUser.getArtistsSet();
        assertEquals(1, updatedUserArtistsSet.size());
    }

    @Test
    public void deleteUserArtist() {
        User user = genericDao.getById(2);
        GenericDao artistDao = new GenericDao(Artist.class);
        Artist removeArtist = (Artist) artistDao.getById(1);
        user.getArtistsSet().remove(removeArtist);
        genericDao.saveOrUpdate(user);
        User updatedUser = genericDao.getById(2);

        assertEquals(0, updatedUser.getArtistsSet().size());
    }
}
