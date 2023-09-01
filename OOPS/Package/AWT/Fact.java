
import java.awt.*;
import java.awt.event.*;

class Test extends Frame implements ActionListener 
{
    private TextField tf1;
    private Label lb;

    public Test() {
        setTitle("Factorial Calculator");
        setBounds(100, 100, 300, 200);
        setLayout(null); // Using absolute positioning
        
        Label label = new Label("Enter a number:");
        label.setBounds(20, 30, 100, 20);
        add(label);

        tf1 = new TextField();
        tf1.setBounds(130, 30, 50, 20);
        add(tf1);

        Button btn1 = new Button("Calculate");
        btn1.setBounds(190, 30, 70, 20);
        btn1.addActionListener(this);
        add(btn1);

        lb = new Label("Factorial will be displayed here");
        lb.setBounds(20, 60, 250, 20);
        add(lb);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
            
            @Override
            public void windowActivated(WindowEvent we) {
                // This method is called when the window gains focus.
            }

            @Override
            public void windowClosed(WindowEvent we) {
                // This method is called when the window is closed.
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                // This method is called when the window loses focus.
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                // This method is called when the window is restored from minimized state.
            }

            @Override
            public void windowIconified(WindowEvent we) {
                // This method is called when the window is minimized.
            }

            @Override
            public void windowOpened(WindowEvent we) {
                // This method is called when the window is first opened.
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            try {
                int number = Integer.parseInt(tf1.getText());
                int factorial = Factorial(number);
                lb.setText("Factorial of " + number + " is " + factorial);
            } catch (NumberFormatException ex) {
                lb.setText("Please enter a valid number");
            }
        }
    }

    private int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
   
class Fact
{
    public static void main(String[] args) 
	{
        Test calculator = new Test();
        calculator.setVisible(true);
    }
}
