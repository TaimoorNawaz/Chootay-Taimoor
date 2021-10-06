package shop.ChootayBikes.Model;

import javax.persistence.*;

@Entity
@Table
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private String roles;
    private boolean active;
    public UserLogin() {
    }

    public UserLogin(String userName) {
        this.userName = userName;
    }

    public UserLogin(String userName, String password, String roles, boolean active) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}