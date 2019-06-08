package pl.lukaszprasek.CompanyApp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszprasek.CompanyApp.domain.entities.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
