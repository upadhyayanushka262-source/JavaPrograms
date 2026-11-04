import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepad extends JFrame implements ActionListener {
    JTextArea textArea;
    JMenuItem newFile, open, save, exit;

    SimpleNotepad() {
        setTitle("Simple Notepad");
        setSize(600, 400);

        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");

        newFile = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);

        menuBar.add(file);
        setJMenuBar(menuBar);

        newFile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newFile) {
            textArea.setText("");
        }

        else if (e.getSource() == open) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedReader br = new BufferedReader(
                        new FileReader(chooser.getSelectedFile()));

                    textArea.setText("");
                    String line;

                    while ((line = br.readLine()) != null) {
                        textArea.append(line + "\n");
                    }

                    br.close();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error opening file!");
                }
            }
        }

        else if (e.getSource() == save) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedWriter bw = new BufferedWriter(
                        new FileWriter(chooser.getSelectedFile()));

                    bw.write(textArea.getText());
                    bw.close();

                    JOptionPane.showMessageDialog(this, "File Saved Successfully!");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file!");
                }
            }
        }

        else if (e.getSource() == exit) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new SimpleNotepad();
    }
}
