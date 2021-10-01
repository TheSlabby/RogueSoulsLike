package com.rougesouls.game.player;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.rougesouls.game.Game;
import com.badlogic.gdx.graphics.Texture;
import com.rougesouls.game.Wall;

import java.util.ArrayDeque;

public class Player {
    int hp, maxHp, stamina, maxStamina, movementSpeed, x, y, maxBuffer;
    State currentAction;
    Game game;
    ArrayDeque<State> stateList = new ArrayDeque<State>();

    public Player(Game gameIn) {
        game = gameIn;
        x = 0;
        y = 0;
        currentAction = new Standing(this);
        movementSpeed = 12;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Texture getTexture() {
        return currentAction.getTexture();
    }

    public void update() {
        currentAction.advanceState();
    }

    public void move(double xIn, double yIn) {
        //TODO make rectangle better
        Rectangle playerRect = new Rectangle(x, y, 100, 100);
        Vector2 velocity = new Vector2((float) xIn * movementSpeed, (float) yIn * movementSpeed);
        velocity = Wall.move(playerRect, velocity);
        x += velocity.x;
        y += velocity.y;
    }


}
