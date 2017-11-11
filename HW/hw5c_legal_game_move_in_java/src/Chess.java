import java.awt.*;

/**
 * Created by yangyang on 11/10/17.
 */
public class Chess {
    private int x, y;
    private String color;

    Chess(int x, int y, String prevColor) {

        this.x = x;
        this.y = y;
        if (prevColor.equals("black")) {
            this.color = "white";
        } else {
            this.color = "black";
        }
    }

    public String getColor() {
        return this.color;
    }


    void draw(Graphics g) {
        if (color.equals("black")) {
            g.setColor(Color.black);
        } else {
            g.setColor(Color.white);
        }
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(x/10*20 - 8);
//        System.out.println(y/10*20 - 8);

        g.fillOval(x- 8, y- 8, 16, 16);

    }
}
