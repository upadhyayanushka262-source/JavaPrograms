import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniBanking extends JFrame implements ActionListener {
    JTextField account, name, balance, amount;
    JButton deposit, withdraw, check, clear;

    MiniBanking() {
        setTitle("Mini Banking Application");
        setSize(400, 350);
        setLayout(new GridLayout(7, 2, 5, 5));

        add(new JLabel("Account Number:"));
        account = new JTextField();
        add(account);

        add(new JLabel("Customer Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Current Balance:"));
        balance = new JTextField();
        add(balance);

        add(new JLabel("Amount:"));
        amount = new JTextField();
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        check = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(deposit);
        add(withdraw);
        add(check);
        add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            account.setText("");
            name.setText("");
            balance.setText("");
            amount.setText("");
            return;
        }

        if (e.getSource() == check) {
            try {
                double b = Double.parseDouble(balance.getText());
                JOptionPane.showMessageDialog(this,
                        "Current Balance: " + b);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Enter valid balance!");
            }
            return;
        }

        try {
            double b = Double.parseDouble(balance.getText());
            double a = Double.parseDouble(amount.getText());

            if (b < 0 || a <= 0) {
                JOptionPane.showMessageDialog(this,
                        "Enter a valid positive amount and balance!");
                return;
            }

            if (e.getSource() == deposit) {
                b = b + a;
                balance.setText(String.valueOf(b));
                JOptionPane.showMessageDialog(this,
                        "Amount Deposited Successfully!");
            }

            else if (e.getSource() == withdraw) {
                if (a <= b) {
                    b = b - a;
                    balance.setText(String.valueOf(b));
                    JOptionPane.showMessageDialog(this,
                            "Withdrawal Successful!");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Insufficient Balance!");
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new MiniBanking();
    }
}