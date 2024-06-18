package main.java;

/**
 * Circle class representing a circle shape.
 */
class Circle extends Shape {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    double calculateVolume(){
        throw new UnsupportedOperationException("Volume is calculated for 3-D shapes only");
    }
}
