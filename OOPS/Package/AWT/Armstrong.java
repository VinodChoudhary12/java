
import java.awt.*;
import java.awt.event.*;
class Armstrong extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public Armstrong()
    {
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        setTitle("Armstrong");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter Any Number");
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
        lb2.setBackground(Color.BLUE);
        lb2.setForeground(Color.BLACK);
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
                int m=n,count=0;
                do
                {
                  count++;
                  n=n/10;
          
                }
                while(n>0);
                n=m;
                int sum=0;
                do
                {
                    int rem =n%10;
                    int pow=1,i=1;
                    do
                    {
                        pow=pow*rem;
                        i++;
                    }
                    while(i<=count);
                    sum = sum+pow;
                    n = n/10;
                }while(n>0);
		        if(m==sum)
                lb2.setText("Armstrong");
		        else
			    lb2.setText("Not Armstrong");
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
        Armstrong ob = new Armstrong();
    }
}