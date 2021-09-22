package com.rougesouls.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.rougesouls.game.Game;
import com.rougesouls.game.Vector;
import com.rougesouls.game.screens.Screen;
import sun.jvm.hotspot.debugger.Debugger;

public class test extends Screen {

    public test(SpriteBatch batchIn, Game gameIn) {
        super(batchIn, gameIn);
    }

    @Override
    public void draw() {
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(game.getPlayer().getTexture(), game.getPlayer().getX(), game.getPlayer().getY());
        batch.end();
    }

    @Override
    public void logic() {
        ShapeRenderer shapeRenderer = new ShapeRenderer();
        double xAxis = 0;
        double yAxis = 0;
        if(Gdx.input.isKeyPressed(Keys.W)) {
            yAxis++;
        }
        if(Gdx.input.isKeyPressed(Keys.S)) {
            yAxis--;
        }
        if(Gdx.input.isKeyPressed(Keys.A)) {
            xAxis--;
        }
        if(Gdx.input.isKeyPressed(Keys.D)) {
            xAxis++;
        }
        Vector v = new Vector(xAxis, yAxis);
        //System.out.print(yAxis + xAxis);s
        //System.out.println(v.getNormalizedX() + v.getNormalizedY());
        game.getPlayer().move(v.getNormalizedX(), v.getNormalizedY());
    }
}
