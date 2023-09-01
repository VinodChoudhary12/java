import java.awt.*;
import java.awt.event.*;
class Month  extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public Month()
    {
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        setTitle("Cube");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter Your Month Number");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
        btn1 = new Button("Click");
        btn1.setBounds(20,150,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);
        lb2 = new Label();
        lb2.setBounds(130,150, 200,30);
        lb2.setBackground(Color.GRAY);
        lb2.setForeground(Color.PINK);
        add(lb2);
        addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
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
                if(n==1)
                {
                    lb2.setText("January");
                }
                else if(n==2)
                {
                    lb2.setText("February");
                }
                else if(n==3)
                {
                    lb2.setText("March");
                }
                else if(n==4)
                {
                    lb2.setText("April");
                }
                else if(n==5)
                {
                    lb2.setText("May");
                }
                else if(n==6)
                {
                    lb2.setText("June");
                }
                else if(n==7)
                {
                    lb2.setText("July");
                }
                else if(n==8)
                {
                    lb2.setText("August");
                }
                else if(n==9)
                {
                    lb2.setText("September");
                }
                else if(n==10)
                {
                    lb2.setText("October");
                }
                else if(n==11)
                {
                    lb2.setText("November");
                }
                else if(n==12)
                {
                    lb2.setText("December");
                }
                else if(n<=0||n>12)
                {
                    lb2.setText("Invaild Month");
                }
                
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter Valid Number");
            }
            
            tf1.setText("");
        }
    }
}
class TestMain
{
    public static void main(String[] args)
    {
        Month ob = new Month();
    }
}