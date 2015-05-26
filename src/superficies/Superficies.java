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
        
        float resul=Area(fig);
        
        imprimir(resul,fig);
        

    }
    
    /**
     * Switch que servira para saver que area debe de hallar.
     * @param ar String que sera la figura
     * @return float es el area de la figura
     */
    public static float Area(String ar){
        float area=0;
        float base=0;
        float altura=0;
        float radio=0;
        Modelo cont=new Modelo();
        
        switch(ar){
            case "cuadrado":
                introducir(cont);
                area= cont.getBase() * cont.getBase();
                break;
            case "rectangulo":
                introducir(cont);
                area = cont.getBase() * cont.getAltura();
                break;
            case "triangulo":
                introducir(cont);
                area =(float) 0.5* cont.getBase() * cont.getAltura();
                break;
            case "circulo":
                introducir(cont);
                area= (float) (3.14159265 * cont.getRadio());
                break;
                
        }
        return area;
    }
}
