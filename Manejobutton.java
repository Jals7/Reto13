import javax.swing.*;
import java.awt.event.*;

public class Manejobutton extends JFrame implements ActionListener{
    private JButton boton1, boton2, boton3;
    private JLabel label1;

    public Manejobutton(){
        setLayout(null);
        boton1 = new JButton("Boton 1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Boton 2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("Boton 3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);

        label1 = new JLabel("En espera");
        label1.setBounds(10, 10, 300, 30);
        add(label1);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == boton1){
            label1.setText("Boton 1 pulsado");
        }
        if(ae.getSource() == boton2){
            label1.setText("Boton 2 pulsado");
        }
        if(ae.getSource() == boton3){
            label1.setText("Boton 3 pulsado");
        }
    }

    public static void main(String args[]){
        Manejobutton ventana = new Manejobutton();
        ventana.setBounds(0,0,640,480);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }
}
