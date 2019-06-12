package pl.lukaszprasek.CompanyApp.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.services.SiteService;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

import java.util.List;

@Service
public class SiteManagerImpl implements SiteManager {
    private final SiteService siteService;

    @Autowired
    public SiteManagerImpl(SiteService siteService) {
        this.siteService = siteService;
    }

    @Override
    public SiteDto getSiteById(long id) {
        return siteService.getSiteById(id);
    }

    @Override
    public List<SiteDto> getAllSites() {
        return siteService.getAllSites();
    }

    @Override
    public SiteDto addNewSite(SiteDto siteDto) {
        return siteService.addNewSite(siteDto);
    }
}
