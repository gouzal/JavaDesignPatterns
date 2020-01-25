/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author larbi
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        List<Shape> shapesCopyList = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapesList.add(circle);
        Circle circle2 = (Circle) circle.clone();
        shapesList.add(circle2);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 15;
        rectangle.y = 15;
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapesList.add(rectangle);
        System.out.println(rectangle.toString());
        cloneAndCompare(shapesList, shapesCopyList);

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
