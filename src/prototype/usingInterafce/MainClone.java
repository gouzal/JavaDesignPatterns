/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.usingInterafce;

/**
 *
 * @author larbi
 */
public class MainClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Pizza p = new Pizza();
        p.name = "4 Saison";
        Pizza p2 = p.clone();
        System.out.println(p2.name);
    }

}
