import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample extends JFrame {
    private JPanel panel;

    public RadioButtonExample() {
        setTitle("Ejemplo de RadioButton");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un panel para los componentes
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crear los JRadioButtons
        JRadioButton option1 = new JRadioButton("Opción 1");
        JRadioButton option2 = new JRadioButton("Opción 2");
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        // Agregar ActionListener a los JRadioButtons
        option1.addActionListener(new RadioButtonListener());
        option2.addActionListener(new RadioButtonListener());

        // Agregar los JRadioButtons al panel
        panel.add(option1);
        panel.add(option2);

        // Agregar el panel a la ventana
        add(panel);
    }

    private class RadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Limpiar el panel
            panel.removeAll();

            // Reagregar los JRadioButtons
            panel.add(new JRadioButton("Opción 1"));
            panel.add(new JRadioButton("Opción 2"));

            // Agregar nuevos componentes según la opción seleccionada
            if (e.getActionCommand().equals("Opción 1")) {
                panel.add(new JLabel("Has seleccionado la Opción 1"));
                panel.add(new JButton("Botón 1"));
            } else if (e.getActionCommand().equals("Opción 2")) {
                panel.add(new JLabel("Has seleccionado la Opción 2"));
                panel.add(new JButton("Botón 2"));
            }

            // Actualizar el panel
            panel.revalidate();
            panel.repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RadioButtonExample frame = new RadioButtonExample();
            frame.setVisible(true);
        });
    }
}