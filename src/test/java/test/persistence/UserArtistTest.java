package test.persistence;

import dsr.entity.Artist;
import dsr.entity.User;
import dsr.persistence.GenericDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        Set<Artist> testSet = user.getArtistsSet();
        assertEquals(1, testSet.size());
    }
}
