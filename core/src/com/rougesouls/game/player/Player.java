package com.rougesouls.game.player;
import com.rougesouls.game.Game;
import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayDeque;

public class Player {
    int hp, maxHp, stamina, maxStamina, movementSpeed, x, y, maxBuffer;
    State currentAction;
    Game game;
    ArrayDeque<State> stateList = new ArrayDeque<State>();

    public Player(Game gameIn) {
        game = gameIn;
        int x = 0;
        int y = 0;
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
        x += xIn * movementSpeed;
        y += yIn * movementSpeed;
    }



}
