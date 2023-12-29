package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        new GameUI();
    }
}
class GameUI extends JFrame implements ActionListener {

    JTextField  textField = new JTextField();
    int num1 ;
    int num2 ;
    String sign;


    public GameUI() {
        setTitle("2048");
        setSize(380, 550);
        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initElements();
        setVisible(true);
    }

    private void initElements() {
        textField.setBounds(50, 100, 200, 50);
        textField.setEditable(false);
        add(textField);
        JButton button0 = new JButton("0");
        button0.setBounds(100, 400, 100, 50);
        button0.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button0);
        JButton button1 = new JButton("1");
        button1.setBounds(0, 350, 100, 50);
        button1.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button1);
        JButton button2 = new JButton("2");
        button2.setBounds(100, 350, 100, 50);
        button2.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button2);
        JButton button3 = new JButton("3");
        button3.setBounds(200, 350, 100, 50);
        button3.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button3);
        JButton button4 = new JButton("4");
        button4.setBounds(0, 300, 100, 50);
        button4.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button4);
        JButton button5 = new JButton("5");
        button5.setBounds(100, 300, 100, 50);
        button2.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button5);
        JButton button6 = new JButton("6");
        button6.setBounds(200, 300, 100, 50);
        button6.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button6);
        JButton button7 = new JButton("7");
        button7.setBounds(0, 250, 100, 50);
        button7.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button7);
        JButton button8 = new JButton("8");
        button8.setBounds(100, 250, 100, 50);
        button8.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button8);
        JButton button9 = new JButton("9");
        button9.setBounds(200, 250, 100, 50);
        button9.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(button9);
        JButton buttonDivide = new JButton("÷");
        buttonDivide.setBounds(325, 250, 50, 50);
        buttonDivide.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(buttonDivide);
        JButton buttonMultiply = new JButton("×");
        buttonMultiply.setBounds(325, 300, 50, 50);
        buttonMultiply.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(buttonMultiply);
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(325, 350, 50, 50);
        buttonMinus.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(buttonMinus);
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(325, 400, 50, 50);
        buttonPlus.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(buttonPlus);
        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(325, 450, 50, 50);
        buttonEquals.setForeground(Color.BLUE);
        setFont(new Font("Arial", Font.BOLD, 50));
        add(buttonEquals);

        button0.addActionListener(this);
        button1.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this); // множити
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "1":
                textField.setText(textField.getText() + "1");
                break;
            case "2":
                textField.setText(textField.getText() + "2");
                break;
            case "3":
                textField.setText(textField.getText() + "3");
                break;
            case "4":
                textField.setText(textField.getText() + "4");
                break;
            case "5":
                textField.setText(textField.getText() + "5");
                break;
            case "6":
                textField.setText(textField.getText() + "6");
                break;
            case "7":
                textField.setText(textField.getText() + "7");
                break;
            case "8":
                textField.setText(textField.getText() + "8");
                break;
            case "9":
                textField.setText(textField.getText() + "9");
                break;
            case "+":
                sign = "+";
                num1 = Integer.parseInt(textField.getText());
                num2 = Integer.parseInt(textField.getText());
                textField.setText(textField.getText() + " ");
                break;
            case "-":
                sign = "-";
                num1 = Integer.parseInt(textField.getText());
                num2 = Integer.parseInt(textField.getText());
                textField.setText(textField.getText() + " ");
                break;
            case "×":
                sign = "*";
                num1 = Integer.parseInt(textField.getText());
                num2 = Integer.parseInt(textField.getText());
                textField.setText(textField.getText() + " ");
                break;
            case "÷":
                sign = "/";
                num1 = Integer.parseInt(textField.getText());
                num2 = Integer.parseInt(textField.getText());
                textField.setText(textField.getText() + " ");
                break;
            case "=":
                switch (sign){
                    case "+":
                        textField.setText(String.valueOf(num1 + num2));
                }
                switch (sign){
                    case "-":
                        textField.setText(String.valueOf(num1 - num2));
                }
                switch (sign){
                    case "*":
                        textField.setText(String.valueOf(num1 * num2));
                }
                switch (sign){
                    case "/":
                        textField.setText(String.valueOf(num1 / num2));
                }
                break;
            default:
                System.out.println("some btn");
        }
    }
}
