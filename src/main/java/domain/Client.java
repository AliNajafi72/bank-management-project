package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")

@NamedQuery(
        name = "FIND_BY_USERNAME",
        query = "SELECT c FROM Client c WHERE c.username =:username"
)

public class Client extends User {
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany
    @JoinColumn(name = "FK_CLIENT")
    private List<Account> accounts = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "CLIENT_BRANCH",
            joinColumns = {@JoinColumn(name = "FK_CLIENT")},
            inverseJoinColumns = {@JoinColumn(name = "FK_BRANCH")}
    )
    private List<Branch> branches = new ArrayList<>();

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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}