package com.rougesouls.game.player;
import com.badlogic.gdx.graphics.Texture;

public class Standing extends State{
    int frame = 0;
    int maxFrame = 20;
    Texture texture = new Texture("badlogic.jpg");

    public Standing(Player playerIn) {
        super(playerIn);
    }

    @Override
    public void advanceState() {
        frame++;
    }

    @Override
    public boolean isFinished() {
        return frame >= maxFrame;
    }

    @Override
    public Texture getTexture() {
        return texture;
    }
}
