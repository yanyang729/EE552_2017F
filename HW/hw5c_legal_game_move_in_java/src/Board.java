import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by yangyang on 11/9/17.
 */
public class Board extends JPanel {

    private ArrayList<Chess> chesses = new ArrayList<>(1024);
    private ArrayList<int[]> locations = new ArrayList<>(1024);
    private String preColor = "white";


    private boolean is_used(int x , int y){
        for (int[] loc : locations) {
            if( loc[0] == x && loc[1] == y) {
                return true;
            }
        }
        return false;
    }

    Board() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                int x_adjusted = (e.getX() + 10) / 20 * 20;
                int y_adjusted = (e.getY() + 10) / 20 * 20;


                if (is_used(x_adjusted, y_adjusted)) {
                     System.out.println("illegal move");
                } else {
                    Chess chess = new Chess(x_adjusted, y_adjusted, preColor);
                    chesses.add(chess);
                    int[] loc = new int[2];
                    loc[0] = x_adjusted; loc[1] = y_adjusted;
                    locations.add(loc);
                    preColor = chess.getColor();
                    repaint();
                }


            }
        });
    }


    public void paint(Graphics g) {

        setBackground(Color.orange);

        g.drawRect(0, 0, 360, 360);
        for (int i = 1; i <= 17; i++) {
            g.drawLine(i * 20, 0, i * 20, 360);
        }

        for (int i = 1; i <= 17; i++) {
            g.drawLine(0, i * 20, 360, i * 20);
        }

        g.fillOval(20 * 3 - 4, 20 * 3 - 4, 8, 8);
        g.fillOval(20 * 3 - 4, 20 * 9 - 4, 8, 8);
        g.fillOval(20 * 3 - 4, 20 * 15 - 4, 8, 8);

        g.fillOval(20 * 9 - 4, 20 * 9 - 4, 8, 8);
        g.fillOval(20 * 9 - 4, 20 * 3 - 4, 8, 8);
        g.fillOval(20 * 9 - 4, 20 * 15 - 4, 8, 8);

        g.fillOval(20 * 15 - 4, 20 * 15 - 4, 8, 8);
        g.fillOval(20 * 15 - 4, 20 * 3 - 4, 8, 8);
        g.fillOval(20 * 15 - 4, 20 * 9 - 4, 8, 8);

        for (Chess s : chesses) {
            s.draw(g);
        }

    }

}
