package domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "managers")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "BRANCH_ID")
    private Long branchId;
    @Column (name = "CITY")
    private Long city;
    @Column (name = "BRANCH_CODE")
    private Integer branchCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_MANAGER")
    private Manager manager;
    @OneToMany
    @JoinColumn(name = "FK_BRANCH")
    private List<Employee> employee = new ArrayList<>();

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Integer getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Integer branchCode) {
        this.branchCode = branchCode;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
