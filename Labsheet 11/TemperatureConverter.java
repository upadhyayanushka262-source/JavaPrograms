import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {
    JTextField temperature;
    JRadioButton cToF, fToC;
    JButton convert, clear;
    JLabel result;
    ButtonGroup group;

    TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(350, 300);
        setLayout(new FlowLayout());

        add(new JLabel("Enter Temperature:"));
        temperature = new JTextField(15);
        add(temperature);

        cToF = new JRadioButton("Celsius to Fahrenheit");
        fToC = new JRadioButton("Fahrenheit to Celsius");

        group = new ButtonGroup();
        group.add(cToF);
        group.add(fToC);

        add(cToF);
        add(fToC);

        convert = new JButton("Convert");
        clear = new JButton("Clear");

        add(convert);
        add(clear);

        result = new JLabel("Result will appear here");
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double t = Double.parseDouble(temperature.getText());
                double r;

                if (cToF.isSelected()) {
                    r = (t * 9 / 5) + 32;
                    result.setText("Fahrenheit: " + r);
                } else if (fToC.isSelected()) {
                    r = (t - 32) * 5 / 9;
                    result.setText("Celsius: " + r);
                } else {
                    result.setText("Select conversion type!");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a valid temperature!");
            }
        } else {
            temperature.setText("");
            group.clearSelection();
            result.setText("Result will appear here");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
