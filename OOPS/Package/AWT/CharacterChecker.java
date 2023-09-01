import java.awt.*;
import java.awt.event.*;

public class CharacterChecker extends Frame implements ActionListener {
    private final TextField inputField;
    private final Button checkButton;
    private final Label resultLabel;

    public CharacterChecker() {
        setTitle("Character Checker");
        setBounds(300, 300, 400, 200);
        setLayout(null); 
        setBackground(Color.lightGray);

        Label label = new Label("Enter a character:");
        label.setBounds(30, 30, 120, 20);
        add(label);

        inputField = new TextField();
        inputField.setBounds(160, 30, 30, 20);
        add(inputField);

        checkButton = new Button("Check");
        checkButton.setBounds(200, 30, 70, 20);
        checkButton.addActionListener(this);
        add(checkButton);

        resultLabel = new Label("Result will be displayed here");
        resultLabel.setBounds(30, 70, 340, 20);
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
    public void windowGainedFocus(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowGainedFocus'");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowLostFocus'");
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
            String input = inputField.getText();
            if (input.length() == 1) {
                char ch = input.charAt(0);
                if (isVowel(ch)) {
                    resultLabel.setText("'" + ch + "' is a vowel.");
                } else {
                    resultLabel.setText("'" + ch + "' is a consonant.");
                }
            } else {
                resultLabel.setText("Please enter a single character.");
            }
        }
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        CharacterChecker checker = new CharacterChecker();
        checker.setVisible(true);
    }

    
}
