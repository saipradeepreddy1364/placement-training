import javax.swing.*;
import java.awt.*;
import java.util.Random;

class BallPanel extends JPanel implements Runnable {

    int x = 100;
    int y = 100;

    int dx = 4;
    int dy = 4;

    int ballSize = 40;

    Random r = new Random();

    BallPanel() {
        setBackground(Color.BLACK);
    }

    public void run() {

        while(true) {

            x += dx;
            y += dy;

            // RIGHT EDGE
            if(x >= getWidth() - ballSize) {
                dx = -(r.nextInt(5) + 2);
            }

            // LEFT EDGE
            if(x <= 0) {
                dx = (r.nextInt(5) + 2);
            }

            // BOTTOM EDGE
            if(y >= getHeight() - ballSize) {
                dy = -(r.nextInt(5) + 2);
            }

            // TOP EDGE
            if(y <= 0) {
                dy = (r.nextInt(5) + 2);
            }

            repaint();

            try {
                Thread.sleep(20);
            } catch(Exception e) {}
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(x, y, ballSize, ballSize);
    }
}

public class MovingBallGame {

    public static void main(String[] args) {

        JFrame f = new JFrame("Moving Ball Game 🎮");

        BallPanel panel = new BallPanel();

        f.add(panel);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        new Thread(panel).start();
    }
}