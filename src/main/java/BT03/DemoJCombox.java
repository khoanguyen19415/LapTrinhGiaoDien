/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT03;

import BT2.DemoJRadioButton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrator
 */
public class DemoJCombox extends JFrame {

    private JLabel lbNum1;
    private JLabel lbNum2;
    private JLabel lbOp;
    private JLabel lbReult;
    
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResult;
    
    private JComboBox<String> cboOp;

    private JButton btnPhepTinh;
    private JButton btnNhapLai;

    public DemoJCombox(String title) {
        super(title); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2, 10, 10));


        lbNum1 = new JLabel("Số 1");
        lbNum2 = new JLabel("Số 2");
        lbOp = new JLabel("Phép tính");
        lbReult = new JLabel("Kết quả");


        inputPanel.add(lbNum1);
        txtNum1 = new JTextField();
        inputPanel.add(txtNum1);


        inputPanel.add(lbNum2);
        txtNum2 = new JTextField();
        inputPanel.add(txtNum2);


        inputPanel.add(lbOp);
        String[] operations = {"Cộng", "Trừ", "Nhân", "Chia"};
        cboOp = new JComboBox<>(operations);
        inputPanel.add(cboOp);


        inputPanel.add(lbReult);
        txtResult = new JTextField();
        txtResult.setEditable(false);
        inputPanel.add(txtResult);

        add(inputPanel, BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 10, 10));


        btnPhepTinh = new JButton("Tính");
        buttonPanel.add(btnPhepTinh);

        btnNhapLai = new JButton("Nhập lại");
        buttonPanel.add(btnNhapLai);

        add(buttonPanel, BorderLayout.SOUTH);


        btnPhepTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });


        btnNhapLai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });

        pack();
        
    }

    private void calculate() {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            String op = (String) cboOp.getSelectedItem();
            double result = 0;

            switch (op) {
                case "Cộng":
                    result = num1 + num2;
                    break;
                case "Trừ":
                    result = num1 - num2;
                    break;
                case "Nhân":
                    result = num1 * num2;
                    break;
                case "Chia":                    
                        result = num1 / num2;                 
                    break;
            }

            txtResult.setText(String.valueOf(result));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ");
        }
    }

    private void resetFields() {
        txtNum1.setText("");
        txtNum2.setText("");
        txtResult.setText("");
        cboOp.setSelectedIndex(0);
        txtNum1.requestFocus();
    }

    // Phương thức main
    public static void main(String[] args) {
        DemoJCombox frm = new DemoJCombox("Simple Calculator");
        frm.setVisible(true);
    }
}
