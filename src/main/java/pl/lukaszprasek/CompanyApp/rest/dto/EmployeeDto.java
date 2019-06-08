package pl.lukaszprasek.CompanyApp.rest.dto;

import pl.lukaszprasek.CompanyApp.common.enums.EmployeePosition;

import java.io.Serializable;
import java.time.LocalDate;


public class EmployeeDto implements Serializable {

    private long employeeId;
    private String name;
    private String surname;
    private String birthday;
    private String startWorkingDate;
    private String employeePosition;
    private long siteId;

    private EmployeeDto(Builder builder) {
        this.employeeId = builder.employeeId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthday = builder.birthday;
        this.startWorkingDate = builder.startWorkingDate;
        this.employeePosition = builder.employeePosition;
        this.siteId = builder.siteId;

    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getStartWorkingDate() {
        return startWorkingDate;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }
    public long getSiteId() {
        return siteId;
    }

    public static class Builder {
        private long employeeId;
        private String name;
        private String surname;
        private String birthday;
        private String startWorkingDate;
        private String employeePosition;
        private long siteId;

        public Builder withId(long id) {
            this.employeeId = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withBirthday(LocalDate birthday) {
            this.birthday = birthday.toString();
            return this;
        }

        public Builder withStartWorkingDate(LocalDate startWorkingDate) {
            this.startWorkingDate = startWorkingDate.toString();
            System.out.println(startWorkingDate.toString());
            return this;
        }

        public Builder withEmployeePosition(EmployeePosition employeePosition) {
            this.employeePosition = employeePosition.toString();
            return this;
        }

        public Builder withSiteId(long siteId) {
            this.siteId = siteId;
            return this;
        }

        public EmployeeDto build() {
            return new EmployeeDto(this);
        }
    }
}
