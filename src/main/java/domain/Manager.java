package domain;

import javax.persistence.*;

@Entity
@Table (name = "managers")
public class Manager extends User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "MANAGER_ID")
    private Long managerId;
    @Column (name = "PERSONAL_NUMBER")
    private Long personalNumber;
    @Column (name = "USER_NAME")
    private String username;
    @Column (name = "PASSWORD")
    private String password;

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(Long personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
