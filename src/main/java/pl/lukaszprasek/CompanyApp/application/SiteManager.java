package pl.lukaszprasek.CompanyApp.application;

import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

import java.util.List;

public interface SiteManager {
    SiteDto getSiteById(long id);

    List<SiteDto> getAllSites();

    SiteDto addNewSite(SiteDto siteDto);

}
