package pl.lukaszprasek.CompanyApp.domain.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "site")
public class SiteEntity {
    @Id
    @Column(name = "site_id")
    private long siteId;
    private String address;
    private String name;

    public long getSiteId() {
        return siteId;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
