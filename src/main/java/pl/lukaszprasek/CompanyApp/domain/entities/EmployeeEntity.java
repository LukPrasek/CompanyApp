package pl.lukaszprasek.CompanyApp.domain.entities;

import pl.lukaszprasek.CompanyApp.common.enums.EmployeePosition;
import javax.persistence.*;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @Column(name = "emp_id")
    private long employeeId;
    private String name;
    private String surname;
    private LocalDate birthday;
    @Column(name = "start_working_date")
    private LocalDate startWorkingDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "employee_position")
    private EmployeePosition employeePosition;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "site_id")
    private SiteEntity siteEntity;

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getStartWorkingDate() {
        return startWorkingDate;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public SiteEntity getSiteEntity() {
        return siteEntity;
    }
}
