import java.awt.*;
import java.awt.event.*;

public class StringManipulator extends Frame implements ActionListener {
    private TextField inputField1;
    private TextField inputField2;
    private Checkbox concatCheckbox;
    private Checkbox compareCheckbox;
    private Button actionButton;
    private Label resultLabel;

    public StringManipulator() {
        setTitle("String Manipulator");
        setBounds(200, 200, 500, 350);
        setLayout(null);
        setBackground(new Color(255, 253, 208)); // Cream background color

        Label inputLabel1 = new Label("Enter the first string:");
        inputLabel1.setBounds(20, 30, 150, 20);
        add(inputLabel1);

        inputField1 = new TextField();
        inputField1.setBounds(180, 30, 250, 20);
        add(inputField1);

        Label inputLabel2 = new Label("Enter the second string:");
        inputLabel2.setBounds(20, 70, 150, 20);
        add(inputLabel2);

        inputField2 = new TextField();
        inputField2.setBounds(180, 70, 250, 20);
        add(inputField2);

        concatCheckbox = new Checkbox("Concatenate the strings");
        concatCheckbox.setBounds(180, 110, 200, 20);
        add(concatCheckbox);

        compareCheckbox = new Checkbox("Compare the strings");
        compareCheckbox.setBounds(180, 140, 200, 20);
        add(compareCheckbox);

        actionButton = new Button("Perform Action");
        actionButton.setBounds(200, 180, 150, 40); // Larger button size
        actionButton.addActionListener(this);
        actionButton.setBackground(new Color(46, 139, 87)); // SeaGreen button color
        add(actionButton);

        resultLabel = new Label("Results will be displayed here");
        resultLabel.setBounds(20, 240, 460, 20);
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
        String s1 = inputField1.getText();
        String s2 = inputField2.getText();
        StringBuffer result;
        result = new StringBuffer();

        if (concatCheckbox.getState() && compareCheckbox.getState()) {
            result.append("Please select only one operation.");
        } else if (concatCheckbox.getState()) {
            result.append("Concatenated strings: ").append(s1).append(s2);
        } else if (compareCheckbox.getState()) {
            if (s1.equals(s2)) {
                result.append("Strings are equal.");
            } else {
                result.append("Strings are not equal.");
            }
        } else {
            result.append("Please select an operation.");
        }

        resultLabel.setText(result.toString());
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        manipulator.setVisible(true);
    }
}
