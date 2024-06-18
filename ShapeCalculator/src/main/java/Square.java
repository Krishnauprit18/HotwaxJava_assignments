package main.java;

class Square extends Shape{
    private double side;

    Square(double side){
        this.side = side;
    }

    @Override
    double calculateArea(){
        return side * side;
    }

    double calculatePerimeter(){
        return 4 * side;
    }

    @Override
    double calculateVolume(){
        throw new UnsupportedOperationException("Volume is calculated for 3-D shapes only");
    }

}