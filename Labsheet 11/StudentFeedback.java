import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentFeedback extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JRadioButton excellent, veryGood, good, average, poor;
    JCheckBox teaching, laboratory, material, assignments;
    JTextArea comments;
    JButton submit, reset;
    ButtonGroup rating;

    StudentFeedback() {
        setTitle("Student Feedback Form");
        setSize(450, 600);
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        name = new JTextField(20);
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField(20);
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField(20);
        add(course);

        add(new JLabel("Rating:"));

        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        rating = new ButtonGroup();
        rating.add(excellent);
        rating.add(veryGood);
        rating.add(good);
        rating.add(average);
        rating.add(poor);

        add(excellent);
        add(veryGood);
        add(good);
        add(average);
        add(poor);

        add(new JLabel("Feedback Subjects:"));

        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        add(teaching);
        add(laboratory);
        add(material);
        add(assignments);

        add(new JLabel("Comments:"));
        comments = new JTextArea(5, 25);
        add(new JScrollPane(comments));

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
            String r = excellent.isSelected() ? "Excellent" :
                    veryGood.isSelected() ? "Very Good" :
                    good.isSelected() ? "Good" :
                    average.isSelected() ? "Average" :
                    poor.isSelected() ? "Poor" : "Not selected";

            String feedback = "";
            if (teaching.isSelected()) feedback += "Teaching ";
            if (laboratory.isSelected()) feedback += "Laboratory ";
            if (material.isSelected()) feedback += "Course Material ";
            if (assignments.isSelected()) feedback += "Assignments ";

            String message = "Name: " + name.getText() +
                    "\nRoll Number: " + roll.getText() +
                    "\nCourse: " + course.getText() +
                    "\nRating: " + r +
                    "\nFeedback: " + feedback +
                    "\nComments: " + comments.getText();

            JOptionPane.showMessageDialog(this, message);

        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            rating.clearSelection();

            teaching.setSelected(false);
            laboratory.setSelected(false);
            material.setSelected(false);
            assignments.setSelected(false);

            comments.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentFeedback();
    }
}