/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.fluentinterafce;

/**
 *
 * @author larbi
 */
public class Car {

    private String type;
    private String model;
    private String year;
    private double fuel;

    public Car setType(String type) {
        this.type = type;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;

    }

    public Car setYear(String year) {
        this.year = year;
        return this;

    }

    public Car setFuel(double fuel) {
        this.fuel = fuel;
        return this;

    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + ", model=" + model + ", year=" + year + ", fuel=" + fuel + '}';
    }

}
