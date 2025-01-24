import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.UnsupportedAddressTypeException;

import javax.swing.*;


public class Ventana extends JFrame {
    JPanel panel;
    JTextField cajaTexto;
    public Ventana(){
        // Ventana
        setSize(500,500); // (ancho, largo)
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cierre la ventana el programa finalizara
        setTitle("Titulo"); // titulo de la ventana
        setLocation(100,200); // localizacion de la ventana
        // setLocation + setSize = setBounds(x,y,alto,ancho);
        setLocationRelativeTo(null); // centra la localizacion de la pantalla 
        iniciarComponentes();

    }


    private void iniciarComponentes(){
        panel = new JPanel(); // crea panel
        //panel.setBackground(Color.BLACK); //cambiar color de panel
        panel.setLayout(null);
        this.getContentPane().add(panel); // agregamos el panel a la ventana
        
        colocarEtiqueta();
        colocarBotones();
        colocarRadioBotones();
        colocarCajaDeTexto();
        
        
    }

    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("hola");
        etiqueta.setBounds(100,100,50,30); //ancho y largo de la etiqueta, junto con la posicion
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // establecer en el centro de la etiqueta el texto
        etiqueta.setForeground(Color.CYAN); // color de la letra
        etiqueta.setOpaque(true); // Permitir pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.BLACK); // cambiar color de fondo
        panel.add(etiqueta);
    }

    /**
     * 
     */
    private void colocarBotones(){
        JButton boton1 = new JButton("boton");
        boton1.setBounds(300,100,100,40);
        boton1.setEnabled(true); // si está en falso se desactiva el boton
        boton1.setForeground(Color.BLUE);

        // Clase anonima, sobreescribir objetos abstractos
        final ActionListener oyenteDeAccion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                String textoIngresado = cajaTexto.getText();
                System.err.println("Texto de la caja: " + textoIngresado);
            }
        };

        boton1.addActionListener(oyenteDeAccion);
        
        panel.add(boton1);
    }

    private void colocarRadioBotones(){
        JRadioButton rboton1 = new JRadioButton("Opcion 1 " , true);
        rboton1.setBounds(100,200,100,50);
        panel.add(rboton1);

        JRadioButton rboton2 = new JRadioButton("Opcion 2 " , false);
        rboton2.setBounds(100,250,100,50);
        panel.add(rboton2);

        JRadioButton rboton3 = new JRadioButton("Opcion 3 " , false);
        rboton3.setBounds(100,300,100,50);
        panel.add(rboton3);

        // Para evitar que se marque más de un boton a la vez
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(rboton3);
        grupoRadioBotones.add(rboton2);
        grupoRadioBotones.add(rboton1);
    }

    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(300,200,50,30);
        System.err.println(cajaTexto.getText());
        panel.add(cajaTexto);
       
        

    }

    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
    }
}
