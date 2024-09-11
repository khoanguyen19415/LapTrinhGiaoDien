/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class Calculator extends JFrame{
    private JTextField txtResult;
    private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
            btnC,btnAdd,btnSub,btnMul,btnDiv,btnEq,btnCham;
    
    public Calculator(String title){
        super(title);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        
        p.add(txtResult = new JTextField(15));
        
        p.add(btn0 = new JButton("0"));
        p.add(btn1 = new JButton("1"));
        p.add(btn2 = new JButton("2"));
        p.add(btn3 = new JButton("3"));
        p.add(btn4 = new JButton("4"));
        p.add(btn5 = new JButton("5"));
        p.add(btn6 = new JButton("6"));
        p.add(btn7 = new JButton("7"));
        p.add(btn8 = new JButton("8"));
        p.add(btn9 = new JButton("9"));
        p.add(btnC = new JButton("C"));
        p.add(btnAdd = new JButton("+"));
        p.add(btnSub = new JButton("-"));
        p.add(btnMul = new JButton("*"));
        p.add(btnDiv = new JButton("/"));
        p.add(btnEq = new JButton("="));
        p.add(btnCham = new JButton("."));
        
        txtResult.setBounds(5, 5, 205, 30);
        btnC.setBounds(215, 5, 50, 30);
        
        
        btnAdd.setBounds(210, 40, 60, 35);
        btn9.setBounds(140, 40, 60, 35);
        btn8.setBounds(70, 40 , 60, 35);
        btn7.setBounds(2,40 , 60, 35);
               
        btnSub.setBounds(210, 80, 60, 35);
        btn6.setBounds(140, 80, 60, 35);
        btn5.setBounds(70, 80, 60, 35);
        btn4.setBounds(2, 80, 60, 35);
        
        btnMul.setBounds(210, 120, 60, 35);
        btn3.setBounds(140, 120, 60, 35);
        btn2.setBounds(70, 120, 60, 35);
        btn1.setBounds(2, 120, 60, 35);
        
        btnDiv.setBounds(210, 160, 60, 35);
        btnEq.setBounds(140, 160, 60, 35);
        btnCham.setBounds(70, 160, 60, 35);
        btn0.setBounds(2, 160, 60, 35);
        
        
        
        add(p);
        setResizable(false); //khóa phóng to nhỏ
        setSize(280, 225);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Calculator cal = new Calculator("Calculator");
        cal.setVisible(true);
    }
    
    
    
    
}
