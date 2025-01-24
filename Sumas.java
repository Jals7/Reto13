import javax.swing.*;
import java.awt.event.*;

public class Sumas extends JFrame implements ActionListener{
    private JTextField valor1, valor2;
    private JLabel label1, label2, label3;
    private JButton bsumar;

    public Sumas(){
        setLayout(null);
        label1 = new JLabel("Valor 1:");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Valor 2:");
        label2.setBounds(50, 35, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado:");
        label3.setBounds(120, 80, 100, 30);
        add(label3);

        valor1 = new JTextField();
        valor1.setBounds(120, 10, 150, 20);
        add(valor1);

        valor2 = new JTextField();
        valor2.setBounds(120, 40, 150, 20);
        add(valor2);

        bsumar = new JButton("Sumar");
        bsumar.setBounds(10, 80, 100, 30);
        add(bsumar);
        bsumar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == bsumar){
            int num1 = 0, num2 = 0, resultado = 0;
            num1 = Integer.parseInt(valor1.getText());
            num2 = Integer.parseInt(valor2.getText());
            resultado = num1 + num2;
            label3.setText("Resultado: " + resultado);
        }
    }

    public static void main(String args[]){
        Sumas ventana = new Sumas();
        ventana.setBounds(0,0,300,150);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
