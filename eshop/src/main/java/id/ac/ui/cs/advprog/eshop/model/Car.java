package id.ac.ui.cs.advprog.eshop.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Car {
    private String carId;
    private String carName;
    private String carColor;
    private int carQuantity;

    public String getCarId() {
        return this.carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarQuantity() {
        return this.carQuantity;
    }

    public void setCarQuantity(int carQuantity) {
        this.carQuantity = carQuantity;
    }

    public Car update(Car newCar){
        this.setCarName(newCar.getCarName());
        this.setCarColor(newCar.getCarColor());
        this.setCarQuantity(newCar.getCarQuantity());

        return this;
    }
}