import java.awt.*;
import java.awt.event.*;

public class SphereVolumeCalculator extends Frame implements ActionListener {
    private TextField inf2;
    private Button btn2;
    private Label lb2;

    public SphereVolumeCalculator() {
        setTitle("Sphere Volume Calculator");
        setBounds(200, 200, 400, 250); // Changed dimensions
        setLayout(null); // Using absolute positioning
        setBackground(Color.gray); // Change background color

        Label label = new Label("Enter the radius:");
        label.setBounds(30, 40, 100, 20); // Adjusted position
        add(label);

        inf2 = new TextField();
        inf2.setBounds(150, 40, 50, 20); // Adjusted position
        add(inf2);

        btn2 = new Button("Calculate Volume");
        btn2.setBounds(100, 80, 150, 25); // Adjusted position and size
        btn2.addActionListener(this);
        add(btn2);

        lb2 = new Label("Volume will be displayed here");
        lb2.setBounds(30, 120, 340, 20); // Adjusted position and width
        add(lb2);

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
        if (e.getSource() == btn2) {
            try {
                double radius = Double.parseDouble(inf2.getText());
                double volume = calculateSphereVolume(radius);
                lb2.setText("Volume of sphere with radius " + radius + " is " + volume);
            } catch (NumberFormatException ex) {
                lb2.setText("Please enter a valid number");
            }
        }
    }

    private double calculateSphereVolume(double radius) {
        double volume = (4.0 / 3.0) * 3.14159 * radius * radius * radius;
        return volume;
    }


    public static void main(String[] args) 
{
        SphereVolumeCalculator calculator = new SphereVolumeCalculator();
        calculator.setVisible(true);
   }
}

