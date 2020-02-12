package Entity;
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "user")
    private String user;
    @Column(name = "password")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}