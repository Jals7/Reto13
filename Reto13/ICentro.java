package Reto13;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.event.*;

public class ICentro extends JFrame implements ActionListener{
    private JLabel label1, label2, label3, label4, label5, label6, label7;
    private JTextField tfield1, tfield2, tfield3, tfield4, tfield5, tfield6;
    private JButton boton1, boton2, boton3;

    public ICentro(){
        setLayout(null);
        setTitle("Registro y Control de Equipos en Centro de Investigacion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Labels
        label1 = new JLabel("Ingrese data del equipo:");
        label1.setBounds(20,0,150,30);
        add(label1);
        label2 = new JLabel("Descripcion:");
        label2.setBounds(30,30,100,30);
        add(label2);
        label3 = new JLabel("Cantidad:");
        label3.setBounds(30,70,100,30);
        add(label3);
        label4 = new JLabel("Costo unitario (BS.):");
        label4.setBounds(200,70,150,30);
        add(label4);
        label5 = new JLabel("<html>Fecha de adquisicion:<br>dd/mm/aa</html>");
        label5.setBounds(30,110,150,30);
        add(label5);
        label6 = new JLabel("Nro. de Factura:");
        label6.setBounds(245,105,150,30);
        add(label6);
        label7 = new JLabel("C.I. del Responsable del equipo:");
        label7.setBounds(30,150,200,30);
        add(label7);

        //TextFields
        tfield1 = new JTextField();
        tfield1.setBounds(110,35,330,20);
        add(tfield1);
        tfield2 = new JTextField();
        tfield2.setBounds(90,75,60,20);
        add(tfield2);
        tfield3 = new JTextField();
        tfield3.setBounds(320,75,120,20);
        add(tfield3);
        tfield4 = new JTextField();
        tfield4.setBounds(160,110,75,20);
        add(tfield4);
        tfield5 = new JTextField();
        tfield5.setBounds(340,110,100,20);
        add(tfield5);
        tfield6 = new JTextField();
        tfield6.setBounds(215,155,70,20);
        add(tfield6);

        //Buttons
        boton1 = new JButton("Registrar data");
        boton1.setBounds(120,225,115,20);
        add(boton1);
        boton2 = new JButton("Generar Reporte");
        boton2.setBounds(245,225,128,20);
        add(boton2);
        boton2.addActionListener(this);
        boton3 = new JButton("Salir");
        boton3.setBounds(380,225,80,20);
        add(boton3);
        boton3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton3){
            System.exit(0);
        }
        if(e.getSource() == boton2){
            IReporte window = new IReporte();
            window.setBounds(0,0,450,250);
            window.setVisible(true);
            window.setLocationRelativeTo(null);
            window.setResizable(false);
        }
    }

    public class IReporte extends JFrame implements ActionListener, ChangeListener{
        private JLabel label1, label2, label3, label4, label5;
        private JButton boton1, boton2;
        private JTextField tfield1;
        private JRadioButton rboton1, rboton2;
        private ButtonGroup bg;
        private JPanel panel1;
        private JTextPane textpane;
        private JScrollPane scrollp;
        public IReporte(){
            setLayout(null);
            setTitle("Reporte del Inventario del centro de investigacion");
            IniciarPanel();

            //Label Principal
            label1 = new JLabel("Tipo reporte:");
            label1.setBounds(20, 0, 100, 30);
            add(label1);

            //RadioButtons
            bg = new ButtonGroup();
            rboton1 = new JRadioButton("Individual");
            rboton1.setBounds(100, 5, 100, 20);
            rboton1.addChangeListener(this);
            add(rboton1);
            bg.add(rboton1);
            rboton2 = new JRadioButton("General");
            rboton2.setBounds(200, 5, 100, 20);
            rboton2.addChangeListener(this);
            add(rboton2);
            bg.add(rboton2);

            add(panel1);
        }

        public void IniciarPanel(){
            panel1 = new JPanel();
            panel1.setBounds(0, 30, 450, 250);
            panel1.setLayout(null);
            this.getContentPane().add(panel1);
        }

        public void stateChanged(ChangeEvent e){
            panel1.removeAll();
            if(rboton1.isSelected()){
                //Labels
                label2 = new JLabel("C.I. del Responsable de equipos:");
                label2.setBounds(20, 0, 185, 30);
                panel1.add(label2);
                label3 = new JLabel("Totalizacion:");
                label3.setBounds(40, 50, 100, 30);
                panel1.add(label3);
                label4 = new JLabel("___equipos");
                label4.setBounds(40, 70, 100, 30);
                panel1.add(label4);
                label5 = new JLabel("_____Bs.");
                label5.setBounds(40, 90, 100, 30);
                panel1.add(label5);

                //TextFields
                tfield1 = new JTextField();
                tfield1.setBounds(210, 7, 70, 20);
                panel1.add(tfield1);

                //Buttons
                boton1 = new JButton("Totalizar");
                boton1.setBounds(290, 7, 85, 20);
                panel1.add(boton1);
                boton1.addActionListener(this);
                boton2 = new JButton("Continuar");
                boton2.setBounds(290, 140, 90, 20);
                panel1.add(boton2);
                boton2.addActionListener(this);
            }
            if(rboton2.isSelected()){

                //Labels
                label3 = new JLabel("Totalizacion:");
                label3.setBounds(40, 105, 100, 30);
                panel1.add(label3);
                label4 = new JLabel("___equipos");
                label4.setBounds(40, 125, 100, 30);
                panel1.add(label4);
                label5 = new JLabel("_____Bs.");
                label5.setBounds(40, 145, 100, 30);
                panel1.add(label5);

                //Button
                boton2 = new JButton("Continuar");
                boton2.setBounds(290, 120, 90, 20);
                panel1.add(boton2);
                boton2.addActionListener(this);

                //TextPane
                textpane = new JTextPane();
                textpane.setEditable(false);
                textpane.setContentType("text/plain");
                StyledDocument doc = textpane.getStyledDocument();
                Style boldStyle = textpane.addStyle("Bold", null);
                StyleConstants.setBold(boldStyle, true);
                try {
                    doc.insertString(doc.getLength(), "C.I. Responsable                 Cantidad equipos               Monto total(BS.)", boldStyle);
                } catch (BadLocationException ae) {
                    ae.printStackTrace();
                }
                scrollp = new JScrollPane(textpane);
                scrollp.setBounds(20,5,395,100);
                panel1.add(scrollp);
            }
            
            panel1.revalidate();
            panel1.repaint();
        }

        public void actionPerformed(ActionEvent e){
            if(e.getSource() == boton1){
                //Code to totalize the report
            }
            if(e.getSource() == boton2){
                dispose();
            }
        }
    }
    public static void main(String args[]){
        ICentro ventana = new ICentro();
        ventana.setBounds(0,0,500,300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        
    }
}
