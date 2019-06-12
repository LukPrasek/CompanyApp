package pl.lukaszprasek.CompanyApp.domain.builders;

import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;

public class SiteEntityBuilder implements EntityBuilder<SiteEntity> {
    private SiteEntity siteEntity;

    public SiteEntityBuilder(String name, String address) {
        siteEntity.setAddress(address);
        siteEntity.setName(name);
    }

    @Override
    public SiteEntity build() {
        return siteEntity;
    }
}
