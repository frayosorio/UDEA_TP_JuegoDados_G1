import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero; // dato encapsulado

    public void lanzar(Random r) {
        // generar el numero al azar
        numero = r.nextInt(6) + 1;
    }

    //metodo que permite mostrar la cara del dado en un objeto JLabel que es pasado como parametro de entrada
    public void mostrar(JLabel lblDado) {
        String nombreArchivo = "/imagenes/" + numero + ".jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(nombreArchivo));

        lblDado.setIcon(imgDado);
    }

    //metodo getter que permite saber el valor de una variable encapsulada
    public int getNumero() {
        return numero;
    }

    

}
