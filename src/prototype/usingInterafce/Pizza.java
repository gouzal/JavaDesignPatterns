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
public class Pizza implements Cloneable {

    String name;

    @Override
    protected Pizza clone() throws CloneNotSupportedException {
        return (Pizza) super.clone();
    }

}
