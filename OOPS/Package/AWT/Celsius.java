import java.awt.*;
import java.awt.event.*;

class Test extends Frame implements ActionListener
{
	private TextField tf1;
	private Label lb1,lb2;
	Button btn1;
	public Test()
	{
		this.setVisible(true);
        //this.setBackground(Color.BLACK);
		setTitle("Calculator  Celsius to Fahrenheit ");
		setBounds(100,50,100,400);
		setLayout(null);
		
	    lb1= new Label("Enter a Number");
		lb1. setBounds(10,50,100,20);
		add(lb1);
		
		tf1 = new TextField();
		tf1.setBounds(170,50,150,30);
		this. add(tf1);
		
		lb2=new Label ();
		lb2.setBounds(150,130,150,30);
		this. add(lb2);
		
		btn1 = new Button("Click Here...");
		btn1.setBounds(40,100,80,40);
		btn1.addActionListener(this);
		add(btn1);
	
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			try
            {
				int a = Integer.parseInt(tf1.getText());
				double f=(a *9/5)+32;
		        lb1.setText("Fahrenheit  value is"+f);
			}
			catch(NumberFormatException ex)
			{
				lb1.setText("Please enter a valid number");
			}
		}
	}
	
}
class TestMain
{
	public static void main(String args[])
	{
		Test calculator = new Test();
	}
}