import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends Frame implements ActionListener {
    TextField name, roll, course;
    Checkbox male, female;
    CheckboxGroup gender;
    Choice semester;
    Button submit, reset;
    Label result;

    StudentRegistration() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setLayout(new FlowLayout());

        add(new Label("Student Name:"));
        name = new TextField(20);
        add(name);

        add(new Label("Roll Number:"));
        roll = new TextField(20);
        add(roll);

        add(new Label("Course:"));
        course = new TextField(20);
        add(course);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);
        add(male);
        add(female);

        add(new Label("Semester:"));
        semester = new Choice();
        for (int i = 1; i <= 8; i++)
            semester.add("Semester " + i);
        add(semester);

        submit = new Button("Submit");
        reset = new Button("Reset");
        add(submit);
        add(reset);

        result = new Label("");
        add(result);

        submit.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = gender.getSelectedCheckbox() == null
                    ? "Not selected"
                    : gender.getSelectedCheckbox().getLabel();

            result.setText("Submitted: " + name.getText() +
                    ", Roll: " + roll.getText() +
                    ", Course: " + course.getText() +
                    ", Gender: " + g +
                    ", " + semester.getSelectedItem());
        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            gender.setSelectedCheckbox(null);
            semester.select(0);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}