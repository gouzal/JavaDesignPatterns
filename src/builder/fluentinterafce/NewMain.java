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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c = new Car().setFuel(0).setModel("Toyota").setYear("2010");
        System.out.println(c);
        Car c2 = new Car().setYear("2020").setModel("VOLVO");
        System.out.println(c2);
    }

}
