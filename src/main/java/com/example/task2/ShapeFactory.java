package com.example.task2;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;


public class ShapeFactory {
     private HashMap<Integer, Shape> coll = new HashMap<Integer, Shape>();
     public Shape createShape(int numberOfSides) {
         coll.put(1, new Circle(1,1,100));
         coll.put(2, new Angle(1,1));
         coll.put(3, new Triangle(1,1));
         coll.put(4, new Square(1,1));
         return coll.get(numberOfSides);
     }

/*
    public Shape createShape(int numberOfSides) {
        if (numberOfSides == 2) {
            return new Angle(1,1);
        }
        else if (numberOfSides == 3) {
            return new Triangle(1,1);
        }
        else if (numberOfSides == 4) {
            return new Square(1,1);
        }
         else if (numberOfSides == 0) {
            return new Circle(1,1, 100);
        } else {
            return new Circle(1,1, 30);
        }
        /*public Shape createShape(int numberOfSides){
if(numberOfSides==5){
return new Pentagon();
}
else if(numberOfSides==4){
return new Squere();
}
else if(numberOfSides==3){
return new Triangle();
}
else if(numberOfSides==2){
return new Angle();
}
else if (numberOfSides==1){
return new Straight();
}
else if(numberOfSides==0){
return new Circle();
}else{
return null;
}*/

}
