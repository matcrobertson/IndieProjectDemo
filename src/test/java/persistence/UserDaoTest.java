package persistence;
import entity.Role;
import entity.User;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
@Log4j2
public class UserDaoTest {

    GenericDao genericDao;


    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(User.class);


        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verify successful retrieval of a user
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = (User)genericDao.getById(1);
        assertEquals("dan", retrievedUser.getUserName());
        assertEquals("dan", retrievedUser.getPassword());


    }
    /**
     * Verify successful retrieval of all users
     */
    @Test
    void getAllSuccess() {
        List<User> users = genericDao.getAll();
        assertEquals(3, users.size());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = genericDao.getAll();
        assertEquals(3, users.size());
        assertEquals(1, users.get(0).getId());
    }
    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = genericDao.findByPropertyEqual("userName", "z");
        assertEquals(0, users.size());
    }
    /**
     * Verify successful update of user
     */
    @Test
    void updateSuccess() {
        String newUserName = "Davis";
        User userToUpdate = (User)genericDao.getById(1);
        log.debug(userToUpdate);
        userToUpdate.setUserName(newUserName);
        genericDao.saveOrUpdate(userToUpdate);
        User retrievedUser = (User)genericDao.getById(1);//
        assertEquals(newUserName, retrievedUser.getUserName());
    }
    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {
        GenericDao roleDao = new GenericDao(Role.class);
        Role theRole = (Role)roleDao.getById(1);
        User newUser = new User(7, theRole, "gregorio", "pineapples");
        theRole.addUser(newUser);

        int id = genericDao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        assertEquals("gregorio", insertedUser.getUserName());
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }


    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }


 //the mapping test is not necessary




}