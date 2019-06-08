package pl.lukaszprasek.CompanyApp.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;
import pl.lukaszprasek.CompanyApp.domain.repositories.SiteRepository;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

@Service
public class SiteServiceImpl implements SiteService {
    private final SiteRepository siteRepository;


    @Autowired
    public SiteServiceImpl(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    @Override
    public SiteDto getSiteById(long id) {
        SiteEntity siteEntity=siteRepository.getOne(id);
        return new SiteDto.Builder()
                .withSiteId(siteEntity.getSiteId())
                .withName(siteEntity.getName())
                .withAddress(siteEntity.getAddress()).build();
    }
}
