package entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * represents one user in the music application
 */
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @ManyToOne
    private int id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

    public User() {

    }

    /**
     *

     * @param userName
     * @param password
     */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    /**
     * gets id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return user password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *  creates a string
     * @return variables to a string
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}