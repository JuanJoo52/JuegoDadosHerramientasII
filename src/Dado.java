import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {
    private int numero;

    public void Lanzar (Random r)
    {
        numero = r.nextInt(6)+1;

    }
    public void Mostrar(JLabel lbldado){
        String ArchivoImagen = "/Imagenes/"+numero+".jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(ArchivoImagen));
        lbldado.setIcon(imgDado);
        
       

    }
    public int getNumero(){
        return numero;
    }

}
