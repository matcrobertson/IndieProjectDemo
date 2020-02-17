package Persistence;


import Entity.Artists;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ArtistDAO {
    private final Logger logger = LogManager.getLogger(this.getClass());
    private SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    /**
     * gets all users
     */
    public List<Artists> getAllUsers() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Artists> query = builder.createQuery(Artists.class);
        Root<Artists> root = query.from(Artists.class);
        List<Artists> users = session.createQuery(query).getResultList();
        session.close();
        return users;
    }

}
