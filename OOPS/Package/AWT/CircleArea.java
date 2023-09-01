import java.awt.*;
import java.awt.event.*;

public class CircleArea extends Frame implements ActionListener {
    private TextField inputField;
    private Button calculateButton;
    private Label resultLabel;

    public CircleArea() {
        setTitle("Circle Area Calculator");
        setBounds(100, 100, 300, 200);
        setLayout(null); // Using absolute positioning
        
        Label label = new Label("Enter the radius:");
        label.setBounds(20, 30, 100, 20);
        add(label);

        inputField = new TextField();
        inputField.setBounds(130, 30, 50, 20);
        add(inputField);

        calculateButton = new Button("Calculate Area");
        calculateButton.setBounds(190, 30, 100, 20);
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new Label("Area will be displayed here");
        resultLabel.setBounds(20, 60, 250, 20);
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
        if (e.getSource() == calculateButton) {
            try {
                double radius = Double.parseDouble(inputField.getText());
                double area = calculateCircleArea(radius);
                resultLabel.setText("Area of circle with radius " + radius + " is " + area);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number");
            }
        }
    }

    private double calculateCircleArea(double radius) 
    {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        CircleArea calculator = new CircleArea();
        calculator.setVisible(true);
    }
}
