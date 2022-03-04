package com.capgemini.shapes;

public class Square extends  Rectangle{
    public Square() {
    }

    public Square(double side) {
        setLength(side);
    }

    public Square(String color, boolean filled,double side) {
        setLength(side);
        setFilled(filled);
        setColor(color);
    }
    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        setSide(side);
    }
    public void setWidth(double side){
        setWidth(side);
    }

    public void setLength(double side) {
        setLength(side);
    }
    @Override
    public String toString(){
        String str = "Square[Rectangle[Shape[color="+getColor()+",filled="+isFilled()+",width="+getWidth()+",length="+getLength()+"]]";
        return str;
    }
}
