package pl.lukaszprasek.CompanyApp.domain.services;

import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

import java.util.List;

public interface SiteService {
    SiteDto getSiteById(long id);

    List<SiteDto> getAllSites();

    SiteDto addNewSite(SiteDto siteDto);
}
