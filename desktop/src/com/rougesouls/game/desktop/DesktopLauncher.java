package com.rougesouls.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rougesouls.game.RogueSoul;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Rogue Souls Like";
		config.width = 1692;
		config.height = 1128;


		new LwjglApplication(new RogueSoul(), config);

	}
}
