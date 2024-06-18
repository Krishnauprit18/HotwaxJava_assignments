package main.java;

class Sphere extends Shape{
    private double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter(){
        throw new UnsupportedOperationException("Sphere doesn't have perimeter");
    }

    @Override
    double calculateVolume(){
        return (4.0 / 3) * Math.PI * radius * radius;
        }
}