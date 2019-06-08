package pl.lukaszprasek.CompanyApp.rest.dto;

import java.io.Serializable;

public class CarDto implements Serializable {
    private long carId;
    private String brand;
    private String model;
    private int seatsNumber;
    private long empId;

    private CarDto(Builder builder) {
        this.carId = builder.carId;
        this.brand = builder.brand;
        this.model = builder.model;

    }

    public long getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public long getEmpId() {
        return empId;
    }

    public static class Builder {
        private long carId;
        private String brand;
        private String model;
        private int seatsNumber;
        private long empId;

        public Builder withCarId(long carId) {
            this.carId = carId;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withSeatsNumber(int seatsNumber) {
            this.seatsNumber = seatsNumber;
            System.out.println(seatsNumber+"****************");
            return this;
        }

        public Builder withEmpId(long empId) {
            this.empId = empId;
            return this;
        }

        public CarDto build() {
            return new CarDto(this);
        }
    }

}
