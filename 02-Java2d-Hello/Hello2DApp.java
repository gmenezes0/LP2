import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(1200, 900);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.blue);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0, 0,0);
        g2d.drawLine(0,200, 400,0);
        g2d.setPaint(Color.green);
        g2d.drawRect(400, 100, 300, 300);
        g2d.setPaint(Color.black);
        g2d.fillOval(420, 120, 260, 260);
        g2d.setPaint(Color.yellow);
        g2d.fillRect(700, 450, 400, 400);
    }
}
