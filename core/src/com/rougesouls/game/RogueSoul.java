package com.rougesouls.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class RogueSoul extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Game game;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		game = new Game(batch);
	}

	@Override
	public void render () {
		game.drawLoop();
		game.logicLoop();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
