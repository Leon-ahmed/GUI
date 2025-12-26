import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Circle extends JFrame implements ActionListener {

    private DrawingPanel panel;
    private JButton draw;
    private JButton clear;

    public Circle() {
        setTitle("Circle Drawer");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new DrawingPanel();

        JPanel buttonPanel = new JPanel();
        draw = new JButton("Draw Circle");
        clear = new JButton("Clear");

        draw.addActionListener(this);
        clear.addActionListener(this);

        buttonPanel.add(draw);
        buttonPanel.add(clear);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == draw) {
            panel.drawCircle();
        } else if (e.getSource() == clear) {
            panel.clear();
        }
    }

    public static void main(String[] args) {
        new Circle();
    }
}

class DrawingPanel extends JPanel {

    private int x = -1;
    private int y = -1;
    private int radius = 30;
    private Random random = new Random();

    public void drawCircle() {
        int width = getWidth();
        int height = getHeight();
        x = random.nextInt(Math.max(1, width - 2 * radius));
        y = random.nextInt(Math.max(1, height - 2 * radius));
        repaint();
    }

    public void clear() {
        x = -1;
        y = -1;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (x >= 0 && y >= 0) {
            g.setColor(Color.BLUE);
            g.fillOval(x, y, 2 * radius, 2 * radius);
        }
    }
}
