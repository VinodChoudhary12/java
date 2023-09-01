import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class CalFrame extends Frame implements WindowListener,ActionListener 
{
    Label num1,num2,resultlb1;
    TextField textnum1,textnum2;
    Button btn1,btn2,btn3,btn4,clearbtn;
    public  CalFrame()
    {
        this.setVisible(true);
        this.setBounds(500, 150, 350, 500);
        this.setTitle("Calculator");
        this.setBackground(Color.BLACK);
        this.addWindowListener(this);
        this.setLayout(null);
        num1 =new Label("Enter First Number");
        num1.setBounds(20,50,150,30);
        num1.setBackground(Color.white);
        this.add(num1);
        textnum1 =new TextField();
        textnum1.setBounds(180,50,150,30);
        this.add(textnum1);
        
        // Num two label and text fields
        num2 =new Label("Enter Second Number");
        num2.setBounds(20,100,150,30);
        num2.setBackground(Color.white);
        this.add(num2);
        textnum2 =new TextField();
        textnum2.setBounds(180,100,150,30);
        this.add(textnum2);
        
       // Font f1 = new Font();
        // buttons
        btn1 = new Button("+");
        
        this.add(btn1);
        btn1.setBounds(50,150,50,30);
        btn1.addActionListener(this);
        //second btn
        btn2 =new Button("*");
        this.add(btn2);
        btn2.setBounds(120,150,50,30);
        btn2.addActionListener(this);
        // third btn3
         btn3 =new Button("-");
        this.add(btn3);
        btn3.setBounds(190,150,50,30);
        btn3.addActionListener(this);
        //fourth btn
         btn4 =new Button("/");
        this.add(btn4);
        btn4.setBounds(260,150,50,30);
        btn4.addActionListener(this);
        //btn clear
        clearbtn =new Button("Clear");
        this.add(clearbtn);
        clearbtn.setBounds(100,210,150,30);
        clearbtn.addActionListener(this);
		// label result 
        resultlb1 =new Label("Result : ");
        this.add(resultlb1);
        resultlb1.setBounds(40,250,250,30);
        resultlb1.setBackground(Color.green);
  
    }
    //@Override
    public void windowOpened(WindowEvent e) 
	{
    }

    //@Override
    public void windowClosing(WindowEvent e) 
	{
        this.dispose();
    }

    //@Override
    public void windowClosed(WindowEvent e)
	{
    }

    //@Override
    public void windowIconified(WindowEvent e) 
	{
    }

    //@Override
    public void windowDeiconified(WindowEvent e) 
	{
    }

    //@Override
    public void windowActivated(WindowEvent e) 
	{
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //@Override
    public void windowDeactivated(WindowEvent e) 
	{
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
// Action perfome 
    //@Override
    public void actionPerformed(ActionEvent e) 
	{
        if(e.getSource()==clearbtn)
        {
            resultlb1.setText("");
        }
        double n1 = Double.parseDouble(textnum1.getText());
        double n2 = Double.parseDouble(textnum2.getText());
        String n="";
        if(e.getSource()==btn1)
        {
            n = String.valueOf(n1+n2);
        }
        else if(e.getSource()==btn2)
        {
            n = String.valueOf(n1*n2);
        }
        else if(e.getSource()==btn3)
        {
            n = String.valueOf(n1-n2);
        }
        else if(e.getSource()==btn4)
        {
            n = String.valueOf(n1/n2);
        }      
        
        resultlb1.setText("Result = "+n);
        textnum1.setText("");
        textnum2.setText("");
              
    }
}

//client class
class TestMain
{
    public static void main(String[] args) 
	{
        new CalFrame();
    }
}