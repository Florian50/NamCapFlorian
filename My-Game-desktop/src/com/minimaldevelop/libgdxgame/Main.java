package com.minimaldevelop.libgdxgame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Libgdx-Scene2d-Game";
		cfg.useGL20 = true;
		cfg.width = 1080;
		cfg.height = 1920;
		
		new LwjglApplication(new LibGdxGame(), cfg);
	}
}
