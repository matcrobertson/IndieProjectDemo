package persistence;
import entity.Role;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoleDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao genericDao;


    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Role.class);


        util.Database database = util.Database.getInstance();
        database.runSQL("/cleandb.sql");

    }

    /**
     * Verify successful retrieval of a user
     */
    @Test
    void getByIdSuccess() {
        Role retrievedRole = (Role)genericDao.getById(1);
        assertEquals("admin", retrievedRole.getRole());



    }
    /**
     * Verify successful retrieval of all users
     */
    @Test
    void getAllSuccess() {
        List<Role> users = genericDao.getAll();
        assertEquals(3, users.size());
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Role> users = genericDao.findByPropertyEqual("role", "admin");
        assertEquals(1, users.size());
        assertEquals(1, users.get(0).getId());
    }
    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Role> users = genericDao.findByPropertyEqual("role", "z");
        assertEquals(0, users.size());
    }
    /**
     * Verify successful update of user
     */
    @Test
    void updateSuccess() {
        String newRoleName = "Flying Spaghetti Monster";
        Role userToUpdate = (Role)genericDao.getById(3);
        logger.debug(userToUpdate);
        userToUpdate.setRole(newRoleName);
        genericDao.saveOrUpdate(userToUpdate);
        Role retrievedUser = (Role)genericDao.getById(3);//
        assertEquals(newRoleName, retrievedUser.getRole());
    }
    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        Role newRole = new Role("Lord of Pancakes");
        int id = genericDao.insert(newRole);
        assertNotEquals(0,id);
        Role insertedUser = (Role)genericDao.getById(id);
        assertEquals("Lord of Pancakes", insertedUser.getRole());
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }


    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(4));
        assertNull(genericDao.getById(4));
    }








}