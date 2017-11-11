import javax.swing.*;
import java.awt.*;

/**
 * Created by yangyang on 11/9/17.
 */

public class Window extends JFrame {

    private Board board;


    Window() {
        Dimension expectedDimension = new Dimension(361, 361);

        board = new Board();
        board.setPreferredSize(expectedDimension);
        board.setMaximumSize(expectedDimension);
        board.setMinimumSize(expectedDimension);


        Box box = new Box(BoxLayout.Y_AXIS);

        box.add(Box.createVerticalGlue());
        box.add(board);
        box.add(Box.createVerticalGlue());

        add(box, BorderLayout.CENTER);

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
