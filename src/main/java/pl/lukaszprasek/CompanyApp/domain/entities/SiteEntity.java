package pl.lukaszprasek.CompanyApp.domain.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "site")
public class SiteEntity {
    @Id
    @Column(name = "site_id")
    private long siteId;
    private String address;
    private String name;
    @OneToMany(mappedBy = "siteEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<EmployeeEntity> employeeEntityList;


    public long getSiteId() {
        return siteId;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public List<EmployeeEntity> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeEntityList(List<EmployeeEntity> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }
}
