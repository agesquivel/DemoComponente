import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MiniCloseButton extends JComponent
        implements MouseListener{

    private boolean mouseOver;
    private static final int SIZE = 15;
    private static final Dimension PREFERRED_DIMENSION = new Dimension(SIZE, SIZE);
    private static final int STROKE_WIDTH = SIZE / 5;
    private static final int MARGIN = SIZE / STROKE_WIDTH;

    public MiniCloseButton() {
        enableInputMethods(true);
        addMouseListener(this);
        mouseOver=false;
        setPreferredSize(PREFERRED_DIMENSION);
        setMinimumSize(PREFERRED_DIMENSION);
        setMaximumSize(PREFERRED_DIMENSION);
        setSize(PREFERRED_DIMENSION);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(STROKE_WIDTH));
        g2.setPaint(new GradientPaint(0,0,Color.GRAY,SIZE,0,Color.DARK_GRAY));
        g2.drawLine(MARGIN,MARGIN,getWidth() - MARGIN,getHeight() - MARGIN);
        g2.drawLine(getWidth()- MARGIN, MARGIN, MARGIN,getHeight() - MARGIN);

        if (mouseOver) {
            g2.setStroke(new BasicStroke(1));
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
            g2.setColor(Color.GRAY);
            g2.fillRoundRect(1, 1, getWidth() - 1,
                    getHeight() - 1, SIZE, SIZE);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseOver = true;
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseOver = false;
        repaint();
    }
}
