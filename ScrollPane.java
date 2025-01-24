import javax.swing.*;

public class ScrollPane extends JFrame{
    private JTextField textf;
    private JTextArea texta;
    private JScrollPane scrollpane;

    public ScrollPane(){
        setLayout(null);
        textf = new JTextField();
        textf.setBounds(10, 10, 200, 30);
        add(textf);

        texta = new JTextArea();
        scrollpane = new JScrollPane(texta);
        scrollpane.setBounds(10,50,400,300);
        add(scrollpane);
    }

    public static void main(String args[]){
        ScrollPane ventana = new ScrollPane();
        ventana.setBounds(0,0,640,480);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
