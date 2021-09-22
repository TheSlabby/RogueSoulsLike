package com.rougesouls.game.player;


import com.badlogic.gdx.graphics.Texture;

public abstract class State {
    Player player;
    public State(Player playerIn) {
        this.player = playerIn;
    }

    public abstract void advanceState();

    public abstract Texture getTexture();

    public abstract boolean isFinished();
}
