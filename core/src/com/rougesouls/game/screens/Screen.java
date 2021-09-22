package com.rougesouls.game.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rougesouls.game.Game;

public abstract class Screen {
    SpriteBatch batch;
    Texture img;
    Game game;
    public Screen(SpriteBatch batchIn, Game gameIn) {
        this.batch = batchIn;
        this.game = gameIn;
    }
    public abstract void logic();
    public abstract void draw();
}
