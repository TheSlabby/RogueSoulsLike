package com.rougesouls.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

public class Wall extends Rectangle{

    //static
    public static ArrayList<Wall> walls = new ArrayList<Wall>();
    public static Texture texture = new Texture("SimpleWall.jpg");
    public static Vector2 move(Rectangle rect, Vector2 velocity){
        Rectangle finalRect = new Rectangle(rect.x + velocity.x, rect.y + velocity.y, rect.width, rect.height);
        for (Rectangle r : walls){
            if(rect.overlaps(r))
                return new Vector2();
            else if (finalRect.overlaps(r)){
                Rectangle yRect = new Rectangle(rect.x, rect.y + velocity.y, rect.width, rect.height);
                Rectangle xRect = new Rectangle(rect.x + velocity.x, rect.y, rect.width, rect.height);
                if (!xRect.overlaps(r)){
                    return new Vector2(velocity.x, 0);
                } else if (!yRect.overlaps(r)){
                    return new Vector2(0, velocity.y);
                }
                System.out.println("todo lets do some stuff over here");
                return new Vector2();
            }
        }
        return velocity;
    }


    public Wall(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 100;
        this.height = 100;

        System.out.println("Wall created!");

        walls.add(this);
    }

}
