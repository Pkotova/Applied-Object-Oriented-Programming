package code;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawSpiral extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        int x = getSize().width / 2 - 10;
        int y = getSize().height / 2 - 10;
        int width = 20;
        int height = 20;
        int startAngle = 0;
        int arcAngle = -180;
        int depth = 15;

        for (int i = 0; i < 10; i++) {

            if (i % 2 != 0) {

                y -= depth;
                width += 2 * depth;
                height += 2 * depth;
                g.drawArc(x, y, width, height, startAngle, -arcAngle);
            } else {

                x -= 2 * depth;
                y -= depth;
                width += 2 * depth;
                height += 2 * depth;
                g.drawArc(x, y, width, height, startAngle, arcAngle);
            }
        }
    }

    public static void main(String[] args) {
        DrawSpiral panel = new DrawSpiral();
        JFrame application = new JFrame();
        // application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
        application.setLocationRelativeTo(null);
    }
}