package domains;

import javax.persistence.*;

@Entity
@Table (name = "managers")
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "BRANCH_ID")
    private Long branchId;
    @Column (name = "CITY")
    private Long city;
    @Column (name = "BRANCH_CODE")
    private Integer branchCode;

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
}
