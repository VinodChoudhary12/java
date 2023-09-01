import java.awt.*;
import java.awt.event.*;
class Age  extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public Age()
    {
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        setTitle("Age");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter Your Age");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
        btn1 = new Button("Click");
        btn1.setBounds(20,100,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);
        lb2 = new Label();
        lb2.setBounds(130,100, 200,30);
        lb2.setBackground(Color.GRAY);
        lb2.setForeground(Color.BLACK);
        add(lb2);
        addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				//System.exit(0);
				dispose();
			}
		});

        
    }
    @Override
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
            try 
            {
                int n = Integer.parseInt(tf1.getText());
                if(n<=0)
                {
                    lb2.setText("Invalid Age");
                }
                else if(n<=12)
                {
                    lb2.setText("Child Age");
                }
                else if(n<=19)
                {
                    lb2.setText("Teen Age");
                }
                else if(n<=59)
                {
                    lb2.setText("Younger Age");
                }
                else
                {
                    lb2.setText("Old Age");
                }
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter Age");
            }
            
            tf1.setText("");
        }
    }
    
}
class TestMain
{
    public static void main(String[] args)
    {
        Age ob = new Age();
    }
}