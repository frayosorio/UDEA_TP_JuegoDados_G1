import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    private JLabel lblDado1, lblDado2, lblLanzamientos, lblCenas;

    // metodo constructor
    public FrmJuego() {

        setSize(500, 300);
        setTitle("Juguemos a los dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        String nombreArchivo = "/imagenes/5.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(nombreArchivo));

        lblDado1 = new JLabel();
        lblDado1.setIcon(imgDado);
        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado1);

        lblDado2 = new JLabel();
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

        lblLanzamientos = new JLabel("0");
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setBackground(new Color(0, 0, 0)); // color de fondo
        lblLanzamientos.setOpaque(true); // hacer opaco para ver el color de fondo
        // lblLanzamientos.setForeground(new Color(51, 255, 0));
        lblLanzamientos.setForeground(Color.decode("#33FF00")); // color de la letra
        lblLanzamientos.setFont(new Font("Tahoma", 1, 72)); // cambiar el tipo de letra
        lblLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 40, 100, 100);
        getContentPane().add(lblLanzamientos);

        lblCenas = new JLabel("0");
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

        // Eventos
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

        // Instanciar los dados
        dado1 = new Dado();
        dado2 = new Dado();
    }

    private Dado dado1, dado2;
    private Random r = new Random(); // Instanciar la suerte del juego

    private int cenas, lanzamientos;

    private void iniciarLanzamientos() {
        cenas = 0;
        lanzamientos = 0;
        lblLanzamientos.setText("0");
        lblCenas.setText("0");
    }

    private void lanzarDados() {
        dado1.lanzar(r);
        dado1.mostrar(lblDado1);

        dado2.lanzar(r);
        dado2.mostrar(lblDado2);

        lanzamientos++;
        lblLanzamientos.setText(String.valueOf(lanzamientos));

        if (dado1.getNumero() + dado2.getNumero() >= 11) {
            cenas++;
            lblCenas.setText(String.valueOf(cenas));
        }

    }

}
