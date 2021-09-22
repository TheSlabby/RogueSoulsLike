package com.rougesouls.game;
import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayList;
public class TextureDictionary {
    public ArrayList<Texture> playerMove;
    public TextureDictionary() {
        playerMove = new ArrayList<Texture>();
        playerMove.add(new Texture("badlogic.jpg"));
    }
    public Texture getPlayerTexture(int frame) {
        return playerMove.get(0);
    }
    public void destroy() {
        for (Texture i: playerMove) {
            i.dispose();
        }
    }
}
