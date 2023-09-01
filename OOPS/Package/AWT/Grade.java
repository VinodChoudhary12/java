import java.awt.*;
import java.awt.event.*;
class GradeCheck extends Frame implements ActionListener
{   
    Label lb1,lb2;
    TextField tf1;
    Button btn1 ,btn2;
    public GradeCheck()
    {
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        setTitle("GradeCheck");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter Your Grade");
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
        lb2.setBackground(Color.pink);
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
                double n = Double.parseDouble(tf1.getText());
                if(n<33)
                {
                    lb2.setText("Fail");
                }
                else if(n<=45)
                {
                    lb2.setText("Pass In Third Division");
                }
                else if(n<=65)
                {
                    lb2.setText("Pass In Second Division");
                }
                else if(n<=100)
                {
                    lb2.setText("Pass In First Division");
                }
                else if(n<=0||n>100)
                {
                    lb2.setText("Invaild Grade");
                }
            }
            catch (NumberFormatException ex) 
            {
                lb2.setText("Please Enter Grade");
            }
            
            tf1.setText("");
        }
    }
}
class TestMain
{
    public static void main(String[] args)
    {
        GradeCheck ob = new GradeCheck();
    }
}