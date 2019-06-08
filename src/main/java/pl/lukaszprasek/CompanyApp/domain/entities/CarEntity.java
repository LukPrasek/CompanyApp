package pl.lukaszprasek.CompanyApp.domain.entities;

import javax.persistence.*;

@Entity
@Table (name = "car")
public class CarEntity {
    @Id
    @GeneratedValue
    @Column(name = "car_id")
    private long carId;
    private String brand;
    private String model;
    @Column(name = "seats_number")
    private int seatsNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private EmployeeEntity employeeEntity;

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

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }
}
