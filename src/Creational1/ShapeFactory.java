/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational1;

import Creational1.ObjectShape.Circle;
import Creational1.ObjectShape.Rectangle;
import Creational1.ObjectShape.Shape;
import Creational1.ObjectShape.Square;

/**
 *
 * @author mvryan
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
