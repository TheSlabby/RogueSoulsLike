package com.rougesouls.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rougesouls.game.player.Player;
import com.rougesouls.game.screens.Screen;
import com.rougesouls.game.screens.test;

import java.util.ArrayList;

public class Game {
    SpriteBatch batch;
    private Screen currentScreen;
    Player player;

    public SpriteBatch getBatch() {
        return batch;
    }

    public void setBatch(SpriteBatch batch) {
        this.batch = batch;
    }


    public Screen getCurrentScreen() {
        return currentScreen;
    }

    public void setCurrentScreen(Screen currentScreen) {
        this.currentScreen = currentScreen;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game(SpriteBatch batch_Input) {
        batch = batch_Input;
        currentScreen = new test(batch, this);
        player = new Player(this);

        new Wall(200,200);
    }
    public void drawLoop() {
        currentScreen.draw();
    }

    public void logicLoop() {
        currentScreen.logic();

    }
}
