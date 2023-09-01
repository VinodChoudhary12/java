import java.awt.*;
import javax.swing.*;

class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("RGPV Seal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.getContentPane().setBackground(Color.WHITE);
            frame.add(new SealPanel());
            frame.setVisible(true);
        });
    }
}

class SealPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        // Draw the seal shape
        g.setColor(Color.BLUE);
        g.fillOval(width / 4, height / 4, width / 2, height / 2);

        // Draw the university logo, text, and other design elements
        // Add code here to draw the specific elements of the RGPV seal

        // Example: Draw text in the center
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        String text = "RGPV University";
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(text);
        int textHeight = fm.getHeight();
        int textX = (width - textWidth) / 2;
        int textY = (height - textHeight) / 2 + fm.getAscent();
        g.drawString(text, textX, textY);
    }
}