import java.awt.*;
import java.awt.event.*;
class Power  extends Frame implements ActionListener
{   
    Label lb1,lb2,lb3;
    TextField tf1,tf2;
    Button btn1 ,btn2;
    public Power()
    {
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        setTitle("Paralleogram");
        this.setBounds(50,50,350,400);
        lb1 = new Label("Enter The Base");
        lb1.setBounds(20,50,170,30);
        lb1.setBackground(Color.WHITE);
        lb1.setForeground(Color.BLACK);
        this.add(lb1);
        tf1 = new TextField();
        tf1.setBounds(200,50,130,30);
        add(tf1);
        lb2 = new Label("Enter The power");
        lb2.setBounds(20,100,170,30);
        lb2.setBackground(Color.WHITE);
        lb2.setForeground(Color.BLACK);
        this.add(lb2);
        tf2 = new TextField();
        tf2.setBounds(200,100,130,30);
        this.add(tf2);
        btn1 = new Button("Click");
        btn1.setBounds(20,150,100,30);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.BLACK);
        add(btn1);
        btn1.addActionListener(this);
        lb3 = new Label();
        lb3.setBounds(130,150, 200,30);
        lb3.setBackground(Color.pink);
        lb3.setForeground(Color.BLACK);
        add(lb3);
        addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==btn1)
    { 
        try {
            int x = Integer.parseInt(tf1.getText());
            int y = Integer.parseInt(tf2.getText());
            int i;
            double sum=0,a=1,pow=1;
            for(i=1;i<=y;i++)
		    {
			    pow=pow*x;
      
			    if(i%2!=0)
			    {
				    sum=sum+(a*2+2)/pow;
				    a++;
			    }
		    }
            String s = Double.toString(sum);
            lb3.setText(s);
        } catch (NumberFormatException ex) {
            lb3.setText("Please Enter Valid Number");
        }
    }
    tf1.setText("");
    tf2.setText("");
    }
}
class TestMain
{
    public static void main(String[] args)
    {
        Power ob = new Power();
    }
}