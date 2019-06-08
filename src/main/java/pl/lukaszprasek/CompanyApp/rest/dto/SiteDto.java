package pl.lukaszprasek.CompanyApp.rest.dto;

import pl.lukaszprasek.CompanyApp.domain.entities.EmployeeEntity;

import java.io.Serializable;
import java.util.List;

public class SiteDto implements Serializable {
    private long siteId;
    private String address;
    private String name;
    private List<Long> employeeList;

    private SiteDto(Builder builder) {
        this.siteId = builder.siteId;
        this.address = builder.address;
        this.name = builder.name;
        this.employeeList = builder.employeeList;

    }

    public long getSiteId() {
        return siteId;
    }

    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Long> getEmployeeList() {
        return employeeList;
    }

    public static class Builder {
        private long siteId;
        private String address;
        private String name;
        private List<Long> employeeList;

        public Builder withSiteId(long siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withEmployeeList(List<Long> list) {
            this.employeeList = list;
            return this;
        }

        public SiteDto build() {
            return new SiteDto(this);
        }
    }


}
