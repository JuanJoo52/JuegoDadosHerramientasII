import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class juego extends JFrame {
    Dado dado1,dado2;
    Random r;
    JLabel LblDado1, LblDado2;
    public juego () 
    {
        setSize(500,400);
        setTitle("Juego De Dados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        LblDado1 = new JLabel();
        String ArchivoImagen = "/Imagenes/1.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(ArchivoImagen));
        LblDado1.setIcon(imgDado);
        LblDado1.setBounds(10,10,imgDado.getIconWidth(),imgDado.getIconHeight());
        add(LblDado1);
        LblDado2 = new JLabel();
        ArchivoImagen = "/Imagenes/2.jpg";
        imgDado = new ImageIcon(getClass().getResource(ArchivoImagen));
        LblDado2.setIcon(imgDado);
        LblDado2.setBounds(20+imgDado.getIconWidth(),10,imgDado.getIconWidth(),imgDado.getIconHeight());
        add(LblDado2);
        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos");
        lblTituloLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 10, 90, 25);
        lblTituloLanzamientos.setHorizontalAlignment(JLabel.CENTER);
        add(lblTituloLanzamientos);
        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setBounds(30+2*imgDado.getIconWidth(),40,90,100);
        lblLanzamientos.setFont(new Font("Tahoma",1,72));
        lblLanzamientos.setHorizontalAlignment(JLabel.RIGHT);
        lblLanzamientos.setBackground(new Color(0,0,0));
        lblLanzamientos.setForeground((new Color(51,255,0)));
        lblLanzamientos.setOpaque(true);
        add(lblLanzamientos);
        JLabel lblTituloCenas = new JLabel("Cenas");
        lblTituloCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 10, 90, 25);
        lblTituloCenas.setHorizontalAlignment(JLabel.CENTER);
        add(lblTituloCenas);

        JLabel lblCenas = new JLabel("0");
        lblCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 40, 90, 100);
        lblCenas.setFont(new Font("Tahoma", 1, 72));
        lblCenas.setHorizontalAlignment(JLabel.RIGHT);
        lblCenas.setBackground(new Color(0, 0, 0));
        lblCenas.setForeground(new Color(51, 255, 0));
        lblCenas.setOpaque(true);
        add(lblCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10, 20 + imgDado.getIconHeight(), 100, 25);
        add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 60 + imgDado.getIconHeight(), 100, 25);
        add(btnLanzar);
        //eventos
        btnIniciar.addActionListener( e -> {
            iniciar();
        });
        btnLanzar.addActionListener( e -> {
            lanzar();
        });




    }
    private void iniciar () {

    }
    private void lanzar (){
        dado1.Lanzar(r);
        dado1.Mostrar(LblDado1);
        dado2.Lanzar(r);
        dado2.Mostrar(LblDado2);


    }

}
