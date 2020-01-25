/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author larbi
 */
public class Car {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;


    
    public Car(Type type, int seats, Engine engine, Transmission transmission,
            GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
    }

    public Type getType() {
        return type;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + ", seats=" + seats + ", engine=" + engine + ", transmission=" + transmission + ", gpsNavigator=" + gpsNavigator + ", fuel=" + fuel + '}';
    }
    
    
}
