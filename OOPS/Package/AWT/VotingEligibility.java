import java.awt.*;
import java.awt.event.*;
/*
ActionListener Access: The ActionListener implementation in your program uses these components (tf2, btn3, and resultLabel) to perform actions. 
If you didn't make them final, there's a risk that 
they could be reassigned elsewhere in your code, and the actionPerformed method might then access different components than you intended.
*/

public class VotingEligibility extends Frame implements ActionListener 
{
    private final TextField tf2;
    private final Button btn3;
    private final Label resultLabel;

    public VotingEligibility() {
        setTitle("Voting Eligibility Checker");
        setBounds(300, 300, 400, 220); // Adjusted dimensions
        setLayout(null); // Using absolute positioning
        setBackground(Color.lightGray);

        Label label = new Label("Enter your age:");
        label.setBounds(30, 30, 120, 20);
        add(label);

        tf2 = new TextField();
        tf2.setBounds(160, 30, 30, 20);
        add(tf2);

        btn3 = new Button("Check");
        btn3.setBounds(150, 70, 100, 30); 
        btn3.addActionListener(this);
        add(btn3);

        resultLabel = new Label("Eligibility result will be displayed here");
        resultLabel.setBounds(30, 120, 340, 20);
        add(resultLabel);

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
        if (e.getSource() == btn3) {
            try {
                int age = Integer.parseInt(tf2.getText());
                if (age >= 18) 
                {
                    resultLabel.setText("You are eligible to vote.");
                }
                else if(age <=0)      
                {
                    resultLabel.setText("Age In not Negetive.");
                }
                else {
                    resultLabel.setText("You are not eligible to vote.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid age.");
            }
        }
    }

    public static void main(String[] args) {
        VotingEligibility checker = new VotingEligibility();
        checker.setVisible(true);
    }
}
