package app;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Main {

     public static void main(String[] args) {
        
          List<Shape> list = new ArrayList<>();
          Shape s1 = new Rectangle(2.0, 3.0);
          Shape s2 = new Circle(2.0);
          list.add(s1);
          list.add(s2);

          List<Circle> myCircles = new ArrayList<>();
          myCircles.add(new Circle(2.0));
          myCircles.add(new Circle(3.0));

          List<Rectangle> myRectangles = new ArrayList<>();
          myRectangles.add(new Rectangle(2.0, 3.0));
          myRectangles.add(new Rectangle(3.0, 3.0));

          System.out.println("Total shapes area: "+ String.format("%.2f", totalArea(list)) + "m²");
          System.out.println("Total circles area: "+ String.format("%.2f", totalArea(myCircles)) + "m²");
          System.out.println("Total rectangles area: "+ String.format("%.2f", totalArea(myRectangles)) + "m²");
     }
     // Permite a função aceitar lista de Shape e subtipos de shape;
     // Ainda assim não posso adicionar elementos à lista
     public static double totalArea(List<? extends Shape> list) {
          double sum = 0.0;
          for (Shape s : list) {
               sum += s.area();
          }
          return sum;
     }
}