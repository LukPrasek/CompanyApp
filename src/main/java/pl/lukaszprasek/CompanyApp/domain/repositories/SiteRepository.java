package pl.lukaszprasek.CompanyApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;

@Repository
public interface SiteRepository extends JpaRepository<SiteEntity, Long> {
}
