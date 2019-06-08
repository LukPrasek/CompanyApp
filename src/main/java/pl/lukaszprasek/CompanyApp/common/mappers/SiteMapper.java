package pl.lukaszprasek.CompanyApp.common.mappers;

public interface SiteMapper<F, T> {
    T mapToDto(F from);
}
