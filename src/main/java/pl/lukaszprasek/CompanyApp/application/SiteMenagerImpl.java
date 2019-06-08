package pl.lukaszprasek.CompanyApp.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.services.SiteService;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

@Service
public class SiteMenagerImpl implements SiteMenager {
    private final SiteService siteService;

    @Autowired
    public SiteMenagerImpl(SiteService siteService) {
        this.siteService = siteService;
    }

    @Override
    public SiteDto getSiteById(long id) {
        return siteService.getSiteById(id);
    }
}
