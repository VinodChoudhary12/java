import java.awt.*;
import java.awt.event.*;


public class InputTypeChecker extends Frame implements ActionListener {
    private TextField aField;
    private Button checkButton;
    private Label resultLabel;

    public InputTypeChecker() {
        setTitle("Input Type Checker");
        setBounds(300, 300, 500, 250); // Adjusted dimensions
        setLayout(null); // Using absolute positioning
        setBackground(Color.lightGray);

        Label label = new Label("Enter a value:");
        label.setBounds(30, 30, 120, 20);
        add(label);

        aField = new TextField();
        aField.setBounds(160, 30, 150, 20); // Adjusted width
        add(aField);

        checkButton = new Button("Check");
        checkButton.setBounds(160, 70, 150, 30); // Adjusted position and size
        checkButton.addActionListener(this);
        checkButton.setBackground(Color.orange); // Change button background color
        add(checkButton);

        resultLabel = new Label("Input type will be displayed here");
        resultLabel.setBounds(30, 120, 440, 20); // Adjusted width
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
        if (e.getSource() == checkButton) {
            String a = aField.getText();
            try {
                Integer.valueOf(a);
                resultLabel.setText("Input is an Integer");
            } catch (NumberFormatException exInt) {
                try {
                    Double.valueOf(a);
                    resultLabel.setText("Input is a Double");
                } catch (NumberFormatException exDouble) {
                    if (a.length() == 1) 
                    {
                        resultLabel.setText("Input is a Character");
                    } else {
                        resultLabel.setText("Input is a String");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //Frame  checker = new Frame();
        InputTypeChecker checker = new InputTypeChecker();
        checker.setVisible(true);
    }

    
}
