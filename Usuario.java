import javax.swing.*;
import java.awt.event.*;

public class Usuario extends JFrame implements ActionListener{
    private JTextField textfield;
    private JButton boton;
    private JLabel label;

    public Usuario(){
        setLayout(null);
        label = new JLabel("Usuario:");
        label.setBounds(10, 10, 100, 30);
        add(label);

        textfield = new JTextField();
        textfield.setBounds(120, 17, 150, 20);
        add(textfield);

        boton = new JButton("Aceptar");
        boton.setBounds(10, 80, 100, 30);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == boton){
            String title = textfield.getText();
            setTitle(title);
        }
    }

    public static void main(String args[]){
        Usuario ventana = new Usuario();
        ventana.setBounds(0,0,640,480);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }
}
