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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.setEngine(new Engine(3, 1));
        builder.setGPSNavigator(new GPSNavigator("Tanger"));
        builder.setSeats(6);
        Car result = builder.getResult();
        System.out.println(result);
        builder = new CarBuilder();
        builder.setEngine(new Engine(4, 17));
        builder.setGPSNavigator(new GPSNavigator("Casa"));
        builder.setSeats(3);
        builder.setType(Type.SUV);
        result = builder.getResult();
        System.out.println(result);
        builder = new CarBuilder();
        builder.setGPSNavigator(new GPSNavigator("RABAT"));
        result = builder.getResult();
        
        System.out.println(result);
    }

}
