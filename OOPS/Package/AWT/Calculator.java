import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements WindowListener,ActionListener
{
    private TextField tf1,inputField;
    private Label  lb1,lb2,resultLabel;

    private double operand1 = 0;
    private double operand2 = 0;
    private String operator = "";
    public Calculator()
    {
        this.setVisible(true);
        this.setTitle("My calculator");
        this.setBackground(Color.gray);
        this.setBounds(100, 100, 700, 400);
        this.setLayout(null);
        lb1 = new Label("Enter First Number");
        this.setBounds(20, 30, 150, 20);
        this.add(lb1);
        
        lb2 = new Label("Enter First Number");
        this.setBounds(40, 60, 3000, 40);
        this.add(lb2);
        
        tf1= new TextField();
        this.setBounds(180, 30, 50, 20);
        this.add(tf1);
        
        
        
        
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class Test
{
    public static void main(String[] args) 
    {
        new Calculator();
    }
}
