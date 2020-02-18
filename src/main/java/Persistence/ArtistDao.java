//package Persistence;
//
//import Entity.Artist;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//import javax.persistence.criteria.*;
//import java.util.List;
//
//public class ArtistDao {
//
//    private final Logger logger = LogManager.getLogger(this.getClass());
//    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
//
//    /**
//     * Get Artist by id
//     */
//    public Artist getById(int id) {
//        Session session = sessionFactory.openSession();
//        Artist artist = session.get( Artist.class, id );
//        session.close();
//        return artist;
//    }
//
//    /**
//     * update Artist
//     * @param Artist  Artist to be inserted or updated
//     */
//    public void saveOrUpdate(Artist Artist) {
//        Session session = sessionFactory.openSession();
//        session.saveOrUpdate(Artist);
//        session.close();
//    }
//
//    /**
//     * update Artist
//     * @param Artist  Artist to be inserted or updated
//     */
//    public int insert(Artist Artist) {
//        int id = 0;
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        id = (int)session.save(Artist);
//        transaction.commit();
//        session.close();
//        return id;
//    }
//
//    /**
//     * Delete a Artist
//     * @param Artist Artist to be deleted
//     */
//    public void delete(Artist Artist) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.delete(Artist);
//        transaction.commit();
//        session.close();
//    }
//
//
//    /** Return a list of all Artists
//     *
//     * @return All Artists
//     */
//    public List<Artist> getAll() {
//
//        Session session = sessionFactory.openSession();
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Artist> query = builder.createQuery( Artist.class );
//        Root<Artist> root = query.from( Artist.class );
//        List<Artist> users = session.createQuery( query ).getResultList();
//
//        logger.debug("The list of users " + users);
//        session.close();
//
//        return users;
//    }
//
//    /**
//     * Get user by property (exact match)
//     * sample usage: getByPropertyEqual("lastname", "Curry")
//     */
//    public List<Artist> getByPropertyEqual(String propertyName, String value) {
//        Session session = sessionFactory.openSession();
//
//        logger.debug("Searching for user with " + propertyName + " = " + value);
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Artist> query = builder.createQuery( Artist.class );
//        Root<Artist> root = query.from( Artist.class );
//        query.select(root).where(builder.equal(root.get(propertyName), value));
//        List<Artist> users = session.createQuery( query ).getResultList();
//
//        session.close();
//        return users;
//    }
//
//    /**
//     * Get user by property (like)
//     * sample usage: getByPropertyLike("lastname", "C")
//     */
//    public List<Artist> getByPropertyLike(String propertyName, String value) {
//        Session session = sessionFactory.openSession();
//
//        logger.debug("Searching for user with {} = {}",  propertyName, value);
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Artist> query = builder.createQuery( Artist.class );
//        Root<Artist> root = query.from( Artist.class );
//        Expression<String> propertyPath = root.get(propertyName);
//
//        query.where(builder.like(propertyPath, "%" + value + "%"));
//
//        List<Artist> users = session.createQuery( query ).getResultList();
//        session.close();
//        return users;
//    }
//
//}