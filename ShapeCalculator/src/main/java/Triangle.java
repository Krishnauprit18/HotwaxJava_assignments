package main.java;

class Triangle extends Shape{
    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea(){
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter(){
        throw new UnsupportedOperationException("Perimeter calculation requires all 3 sides");
    }

    @Override
    double calculateVolume(){
        throw new UnsupportedOperationException("Volume is calculated for 3-D shapes only");
    }
}