import javax.swing.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ItemListener{
    private JComboBox box;
    public ComboBox(){
        setLayout(null);
        box = new JComboBox();
        box.setBounds(10,10,80,20);
        add(box);

        box.addItem("Verde");
        box.addItem("Rojo");
        box.addItem("Azul");
        box.addItem("Amarillo");
        box.addItem("Negro");
        box.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource() == box){
            String text = box.getSelectedItem().toString();
            setTitle(text);
        }
    }

    public static void main(String args[]){
        ComboBox ventana = new ComboBox();
        ventana.setBounds(0,0,300,250);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
