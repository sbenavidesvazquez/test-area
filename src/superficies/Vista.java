package superficies;

import javax.swing.JOptionPane;

/**
 *
 * @author sbenavidesvazquez
 */
public class Vista {

    /**
     * Devuelve los valores recogidos
     * @param mo Clase. donde se recogieron los datos
     */
    public static void introducir(Modelo mo) {
        mo.getBase();
        mo.getAltura();
        mo.getRadio();

    }

    /**
     * Devuelve un mensaje por pantalla
     * @param rel float resultado de la operacion
     * @param fi  String, la figura que ha de hallar
     */
    public static void imprimir(float rel, String fi) {
        JOptionPane.showMessageDialog(null, "El area de tu " + fi + " es igual a " + rel);
    }

}
