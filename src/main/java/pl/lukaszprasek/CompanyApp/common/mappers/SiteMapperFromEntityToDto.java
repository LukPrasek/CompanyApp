package pl.lukaszprasek.CompanyApp.common.mappers;

import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

@Service
public class SiteMapperFromEntityToDto implements SiteMapper<SiteEntity, SiteDto> {

    @Override
    public SiteDto mapToDto(SiteEntity from) {
        return new SiteDto.Builder()
                .withSiteId(from.getSiteId())
                .withName(from.getName())
                .withAddress(from.getAddress()).build();
    }
}
