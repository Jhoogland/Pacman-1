package com.company;

import java.awt.*;

/**
 * Created by Sefa on 15-12-2014.
 */
public class Pacman extends Poppetje {
    public int mouthAngle;

    public Pacman(Point p, int mouthAngle)
    {
        this.p = p;
        this.mouthAngle = mouthAngle;
    }

    public boolean isAtMuur(Direction direction)
    {
        int x = this.p.x;
        int y = this.p.y;

        switch (direction)
        {
            case BOVEN:
                x -= 1;
                break;
            case RECHTS:
                y += 1;
                break;
            case LINKS:
                y -= 1;
                break;
            case BENEDEN:
                x += 1;
                break;
        }

        System.out.println(x + " - " + y);
        int neighbor = GameElement.getNeighbor(x,y);

        if(neighbor == 1)
        {
            System.out.println("@muur");
            return true;
        }

        return false;
    }

    public void move(Direction direction)
    {
        switch (direction)
        {
            case BOVEN:
                if(!isAtMuur(direction.BOVEN))
                {
                    this.p.x -= 1;
                }
                break;
            case RECHTS:
                if(!isAtMuur(direction.RECHTS))
                {
                    this.p.y += 1;
                }
                break;
            case LINKS:
                if(!isAtMuur(direction.LINKS))
                {
                    this.p.y -= 1;
                }
                break;
            case BENEDEN:
                if(!isAtMuur(direction.BENEDEN))
                {
                    this.p.x += 1;
                }
                break;
        }
    }

}
