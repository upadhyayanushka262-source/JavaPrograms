import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistration extends Frame implements ActionListener {
    TextField id, name, designation, salary;
    Choice department;
    Checkbox male, female;
    CheckboxGroup gender;
    TextArea result;
    Button submit, clear;

    EmployeeRegistration() {
        setTitle("Employee Registration Form");
        setSize(450, 500);
        setLayout(new FlowLayout());

        add(new Label("Employee ID:"));
        id = new TextField(20);
        add(id);

        add(new Label("Employee Name:"));
        name = new TextField(20);
        add(name);

        add(new Label("Department:"));
        department = new Choice();
        department.add("HR");
        department.add("IT");
        department.add("Finance");
        department.add("Marketing");
        add(department);

        add(new Label("Designation:"));
        designation = new TextField(20);
        add(designation);

        add(new Label("Salary:"));
        salary = new TextField(20);
        add(salary);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);
        add(male);
        add(female);

        submit = new Button("Submit");
        clear = new Button("Clear");
        add(submit);
        add(clear);

        result = new TextArea(8, 40);
        add(result);

        submit.addActionListener(this);
        clear.addActionListener(this);

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

            result.setText(
                "Employee ID: " + id.getText() +
                "\nName: " + name.getText() +
                "\nDepartment: " + department.getSelectedItem() +
                "\nDesignation: " + designation.getText() +
                "\nSalary: " + salary.getText() +
                "\nGender: " + g
            );
        } else {
            id.setText("");
            name.setText("");
            designation.setText("");
            salary.setText("");
            department.select(0);
            gender.setSelectedCheckbox(null);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new EmployeeRegistration();
    }
}
