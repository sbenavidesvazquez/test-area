package superficies;

import javax.swing.JOptionPane;
import static superficies.Vista.imprimir;
import static superficies.Vista.introducir;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        String fig=JOptionPane.showInputDialog("Figura para calcular el area:\nCuadrado\nCirculo\nRectangulo\nTriangulo\n(escriba todo en minusculas)");
        
        
        imprimir(Area(fig),fig);
        

    }
    
    public static float Area(String ar){
        float area=0;
        float base=0;
        float altura=0;
        float radio=0;
        Modelo cont=new Modelo();
        
        switch(ar){
            case "cuadrado":base=Float.parseFloat(JOptionPane.showInputDialog("¿Base del cuadrado?"));
           cont.setBase(base);
            introducir(cont);
            area= cont.getBase() * cont.getBase();
                break;
            case "rectangulo":
                base=Float.parseFloat(JOptionPane.showInputDialog("¿Base del rectangulo?"));
                cont.setBase(base);
                altura=Float.parseFloat(JOptionPane.showInputDialog("¿Altura del rectangulo?"));
                cont.setAltura(altura);
               introducir(cont);
                area = cont.getBase() * cont.getAltura();
                break;
            case "triangulo":base=Float.parseFloat(JOptionPane.showInputDialog("¿Base del triangulo?"));
                cont.setBase(base);
                altura=Float.parseFloat(JOptionPane.showInputDialog("¿Altura del triangulo?"));
                cont.setAltura(altura);
                introducir(cont);
                area =(float) 0.5* cont.getBase() * cont.getAltura();
                break;
            case "circulo":radio=Float.parseFloat(JOptionPane.showInputDialog("¿Radio del circulo?"));
                cont.setRadio(radio);
                introducir(cont);
                area= (float) (3.14159265 * cont.getRadio());
                break;
                
        }
        return area;
    }
}
