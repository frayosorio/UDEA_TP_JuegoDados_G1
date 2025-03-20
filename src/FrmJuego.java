import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    // metodo constructor
    public FrmJuego() {

        setSize(500, 300);
        setTitle("Juguemos a los dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        String nombreArchivo = "/imagenes/5.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(nombreArchivo));

        JLabel lblDado1 = new JLabel();
        lblDado1.setIcon(imgDado);
        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imgDado);
        lblDado2.setBounds(10 + imgDado.getIconWidth(), 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos");
        lblTituloLanzamientos.setHorizontalAlignment(SwingConstants.CENTER);
        lblTituloLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTituloLanzamientos);

        JLabel lblTituloCenas = new JLabel("Cenas");
        lblTituloCenas.setHorizontalAlignment(SwingConstants.CENTER); // alineacion dentro de area de la etiqueta
        lblTituloCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTituloCenas);

        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setBackground(new Color(0, 0, 0)); // color de fondo
        lblLanzamientos.setOpaque(true); // hacer opaco para ver el color de fondo
        // lblLanzamientos.setForeground(new Color(51, 255, 0));
        lblLanzamientos.setForeground(Color.decode("#33FF00")); // color de la letra
        lblLanzamientos.setFont(new Font("Tahoma", 1, 72)); // cambiar el tipo de letra
        lblLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 40, 100, 100);
        getContentPane().add(lblLanzamientos);

        JLabel lblCenas = new JLabel("0");
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setBackground(new Color(0, 0, 0)); // color de fondo
        lblCenas.setOpaque(true); // hacer opaco para ver el color de fondo
        lblCenas.setForeground(Color.decode("#33FF00")); // color de la letra
        lblCenas.setFont(new Font("Tahoma", 1, 72)); // cambiar el tipo de letra
        lblCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 40, 100, 100);
        getContentPane().add(lblCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10, 150, 100, 25);
        getContentPane().add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 180, 100, 25);
        getContentPane().add(btnLanzar);

        //Eventos
        btnIniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarLanzamientos();
            }

        });

        btnLanzar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lanzarDados();
            }

        });
    }

    private void iniciarLanzamientos() {

    }

    private void lanzarDados() {

    }

}
