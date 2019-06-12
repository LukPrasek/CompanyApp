package pl.lukaszprasek.CompanyApp.common.mappers;

import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;
import pl.lukaszprasek.CompanyApp.rest.request.SiteRequestCreation;

public interface RequestSiteToDtoMapper {
    SiteDto mapToDto(SiteRequestCreation siteRequestCreation);
}
