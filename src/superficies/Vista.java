package superficies;

import javax.swing.JOptionPane;

/**
 *
 * @author sbenavidesvazquez
 */
public class Vista {
    
    
        public static void introducir(Modelo mo){
        mo.getBase();
        mo.getAltura();
        mo.getRadio();
    
    }
        
        public static void imprimir(int rel,String fi){
            JOptionPane.showMessageDialog(null, "El area de tu "+fi+" es igual a "+rel);
        }
    
    
}
