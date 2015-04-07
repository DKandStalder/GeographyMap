package ru.DKandStalder.GeographyMap;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.DKandStalder.GeographyMap.InterfaceView.InterfaceScreen;
import ru.DKandStalder.GeographyMap.MapView.MapScreen;

public class GeographyMapMainClass implements ApplicationListener {
	private MapScreen mapScreen;
	private InterfaceScreen interfaceScreen;
	
	@Override
	public void create () {
		this.mapScreen=new MapScreen();
		this.interfaceScreen=new InterfaceScreen();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		this.mapScreen.render(Gdx.graphics.getDeltaTime());
		this.interfaceScreen.render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}
