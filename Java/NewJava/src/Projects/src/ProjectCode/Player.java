package ProjectCode;

import java.awt.Graphics;
import java.awt.Color;

public class Player
{

    // variables
    private int x_pos;
    private int y_pos;

    // constructor
    public Player(int x, int y)
    {
        x_pos = x;
        y_pos = y;
    }

    // move spaceship in x - direction
    public void moveX(int speed)
    {
        x_pos += speed;
    }

    // generate a shot at the current position of the spaceship
    // and return this shot to the calling method
    public Shot generateShot()
    {
        Shot shot = new Shot(x_pos, y_pos);

        return shot;
    }

    // draw the player
    public void drawPlayer(Graphics g)
    {
        g.setColor(Color.red);
        int [] x_poly = {x_pos, x_pos - 10, x_pos, x_pos + 10};
        int [] y_poly = {y_pos, y_pos + 15, y_pos + 10, y_pos + 15};
        g.fillPolygon(x_poly, y_poly, 4);
    }

} 
