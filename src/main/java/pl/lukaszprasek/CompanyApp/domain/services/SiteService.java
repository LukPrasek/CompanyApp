package pl.lukaszprasek.CompanyApp.domain.services;

import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

public interface SiteService {
    SiteDto getSiteById(long id);

}
