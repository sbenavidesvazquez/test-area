package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;
//import static superficies.Vista.introducir;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        sc = new Scanner(System.in);

        String fig=JOptionPane.showInputDialog("Figura para calcular el area:\nCuadrado\nCirculo\nRectangulo\nTriangulo\n(escriba todo en minusculas)");
        Area(fig);
        
        
        if (fig.equals("square")) {
            //add area calculations for square
            float squareArea;
            float sideLength;

            System.out.println("what is the side length?");
            sideLength = sc.nextFloat();
            squareArea = sideLength * sideLength;
            System.out.println("The area for your square: " + squareArea);

        }/*
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            float sideLength;
            float sideHeight;
            float rectangleArea;

            System.out.println("what is the rectangles width?");
            sideLength = sc.nextFloat();
            System.out.println("What is the rectangles height?");
            sideHeight = sc.nextFloat();
            rectangleArea = sideLength * sideHeight;
            System.out.println("The area for your rectangle is: " + rectangleArea);

        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
            float baseLength;
            float height;
            float triangleArea;

            System.out.println("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            System.out.println("What is the height of the triangle?");
            height = sc.nextFloat();
            triangleArea = (float) (0.5 * baseLength * height);
            System.out.println("Your triangles area is: " + triangleArea);

        }
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
            float radius;
            float circleArea;

            System.out.println("What is the radius of the circle?");
            radius = sc.nextFloat();
            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            System.out.println("Your Circles area is " + circleArea);
                

        }*/

    }
    
    public static float Area(String ar){
        float area=0;
        float base=0;
        float altura=0;
        float radio=0;
        //ModeloCu cont=new ModeloCu();
        
        switch(ar){
            case "cuadrado":base=Float.parseFloat(JOptionPane.showInputDialog("¿Base del cuadrado?"));
           // cont.setBase(base);
            //introducir(cont);
            area= base * base;
                break;
            case "rectangulo":
                base=Float.parseFloat(JOptionPane.showInputDialog("¿Base del rectangulo?"));
                //cont.setBase(base);
                altura=Float.parseFloat(JOptionPane.showInputDialog("¿Altura del rectangulo?"));
                //cont.setBase(altura);
               // introducir(cont);
                area = base * altura;
                break;
            case "triangulo":base=Float.parseFloat(JOptionPane.showInputDialog("¿Base del triangulo?"));
               // cont.setBase(base);
                altura=Float.parseFloat(JOptionPane.showInputDialog("¿Altura del triangulo?"));
                //cont.setBase(altura);
                //introducir(cont);
                area =(float) 0.5*base * altura;
                break;
            case "circulo":radio=Float.parseFloat(JOptionPane.showInputDialog("¿Radio del circulo?"));
                //cont.setBase(radio);
                //introducir(cont);
                area= (float) (3.14159265 * radio);
                break;
                
        }
        return area;
    }
}
