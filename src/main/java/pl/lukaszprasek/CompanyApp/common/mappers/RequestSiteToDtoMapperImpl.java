package pl.lukaszprasek.CompanyApp.common.mappers;

import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;
import pl.lukaszprasek.CompanyApp.rest.request.SiteRequestCreation;

@Service
public class RequestSiteToDtoMapperImpl implements RequestSiteToDtoMapper {

    @Override
    public SiteDto mapToDto(SiteRequestCreation siteRequestCreation) {
        return new SiteDto.Builder().withName(siteRequestCreation.getName())
                .withAddress(siteRequestCreation.getAddress()).build();
    }
}
