package sample;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class SquaredSpiral extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        
        int width = getSize().width;
        int height = getSize().height;

        int widthCenter = width / 2;
        int heightCenter = height / 2;

        for (int i = 0; i < 5 ; i++)
        {
            g.drawLine(widthCenter + (20 * i), heightCenter - (20 * i), widthCenter + (20 * i), heightCenter + 20 + (20 * i));  // vertical
            g.drawLine(widthCenter + (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i)); //horizontal
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i)); //vertical
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i), widthCenter + 20 + (20 * i), heightCenter - 20 - (20 * i)); //horizontal
        }
    }

    public static void main(String[] args)
    {
        SquaredSpiral panel = new SquaredSpiral();

        JFrame application = new JFrame();

      //  application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 400);
        application.setVisible(true);
        application.setLocationRelativeTo(null);
    }

}