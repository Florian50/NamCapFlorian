package com.minimaldevelop.libgdxgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.minimaldevelop.libgdxgame.Assets;
import com.minimaldevelop.libgdxgame.LibGdxGame;

public class MainMenuScreen implements Screen {
	
	LibGdxGame game;
	Stage stage;
//	TextButton startGameButton;
//	TextButton optionsButton;
//	TextButton exitButton;
//	TextButton reprendreButton;
//	TextButton aideButton;
//	TextButton aproposButton;
	private Actor backImage;
	private Image startGameButton;
	private Image reprendreButton;
	private Image optionsButton;
	private Image aproposButton;
	private Image quitterButton;
	
	public MainMenuScreen(LibGdxGame game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		
		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		stage.act(delta);
		stage.draw();
//		Table.drawDebug(stage);
	}

	@Override
	public void resize(int width, int height) {
		
		
	}

	@Override
	public void show() {
		
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		
		Table table = new Table(Assets.skin);
		
//		startGameButton = new TextButton("Jouer", Assets.skin);
//		optionsButton = new TextButton("Options", Assets.skin);
//		exitButton = new TextButton("Quitter", Assets.skin);
//		reprendreButton = new TextButton("Reprendre", Assets.skin);
//		aideButton = new TextButton("Aide", Assets.skin);
//		aproposButton = new TextButton("A Propos", Assets.skin);
		Image backImage = new Image(Assets.backgroundTexture);
		
//		startGameButton.getLabel().setFontScale(6, 6);
//		startGameButton.getLabel().setFontScaleY(6);
//		optionsButton.getLabel().setFontScaleX(6);
//		optionsButton.getLabel().setFontScaleY(6);
//		exitButton.getLabel().setFontScaleX(6);
//		exitButton.getLabel().setFontScaleY(6);
//		reprendreButton.getLabel().setFontScaleX(6);
//		reprendreButton.getLabel().setFontScaleY(6);
//		aideButton.getLabel().setFontScaleX(6);
//		aideButton.getLabel().setFontScaleY(6);
//		aproposButton.getLabel().setFontScaleX(6);
//		aproposButton.getLabel().setFontScaleY(6);
		
		
		table.setFillParent(true);
//		table.debug(); 
//		table.add(startGameButton).width(450).height(200);
//		table.row();
//		table.add(reprendreButton).width(450).height(200).padTop(10);
//		table.row();
//		table.add(optionsButton).width(450).height(200).padTop(10);
//		table.row();
//		table.add(aideButton).width(450).height(200).padTop(10);
//		table.row();
//		table.add(aproposButton).width(450).height(200).padTop(10);
//		table.row();
//		table.add(exitButton).width(450).height(200).padTop(10);
		
		startGameButton = new Image(new Texture("data/bouton1.png"));
		startGameButton.setPosition(30, 1500);
		startGameButton.addListener(new InputListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				
//				game.setScreen(new GameScreen(game));
				
				return true;
		}
		});
		
						
		reprendreButton = new Image(new Texture("data/bouton2.png"));
		reprendreButton.setPosition(30, 1200);
							
				
		optionsButton = new Image(new Texture("data/bouton3.png"));
		optionsButton.setPosition(30, 900);

		
		aproposButton = new Image(new Texture("data/bouton4.png"));
		aproposButton.setPosition(30, 600);

		
		quitterButton = new Image(new Texture("data/bouton5.png"));
		quitterButton.setPosition(30, 300);

				
				
		stage.addActor(backImage);
		stage.addActor(startGameButton);
		stage.addActor(reprendreButton);
		stage.addActor(optionsButton);
		stage.addActor(aproposButton);
		stage.addActor(quitterButton);
		
		
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
