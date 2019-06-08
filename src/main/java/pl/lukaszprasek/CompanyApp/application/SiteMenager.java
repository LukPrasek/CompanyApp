package pl.lukaszprasek.CompanyApp.application;

import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

public interface SiteMenager {
    SiteDto getSiteById(long id);
}
