package com.example.shapes;
public class Rectangle extends Shape {
    private double width,length;
    public Rectangle(double w,double l){
        width =w;
        length=l;
    }
    @Override
    public  double calculateArea(){
        return .5*width*length;
    }
}
