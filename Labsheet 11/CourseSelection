import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CourseSelection extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    JCheckBox java, python, dbms;
    JButton submit, reset;
    ButtonGroup gender;

    CourseSelection() {
        setTitle("Course Selection Form");
        setSize(350, 400);
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        name = new JTextField(20);
        add(name);

        add(new JLabel("Course:"));
        course = new JComboBox<>(new String[]{
            "BCA", "BBA", "B.Tech", "MCA"
        });
        add(course);

        add(new JLabel("Gender:"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        add(male);
        add(female);

        add(new JLabel("Subjects:"));
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        dbms = new JCheckBox("DBMS");

        add(java);
        add(python);
        add(dbms);

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = male.isSelected() ? "Male" :
                    female.isSelected() ? "Female" : "Not selected";

            String subjects = "";
            if (java.isSelected()) subjects += "Java ";
            if (python.isSelected()) subjects += "Python ";
            if (dbms.isSelected()) subjects += "DBMS ";

            String message = "Name: " + name.getText() +
                    "\nCourse: " + course.getSelectedItem() +
                    "\nGender: " + g +
                    "\nSubjects: " + subjects;

            JOptionPane.showMessageDialog(this, message);

        } else {
            name.setText("");
            course.setSelectedIndex(0);
            gender.clearSelection();
            java.setSelected(false);
            python.setSelected(false);
            dbms.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new CourseSelection();
    }
}
