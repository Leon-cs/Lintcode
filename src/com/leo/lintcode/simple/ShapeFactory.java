package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/21 17:41.
 */
/**
 * Your object will be instantiated and called as such:
 * ShapeFactory sf = new ShapeFactory();
 * Shape shape = sf.getShape(shapeType);
 * shape.draw();
 */
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println(" ----");
    }
    // Write your code here
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }
    // Write your code here
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }
    // Write your code here
}

public class ShapeFactory {

    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        // Write your code here
        switch (shapeType){
            case "Square" :
                return new Square();
            case "Triangle" :
                return new Triangle();
            case "Rectangle" :
                return new Rectangle();
            default:
                return null;
        }
    }
}
