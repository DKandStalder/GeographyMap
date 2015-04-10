package ru.DKandStalder.GeographyMap;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import ru.DKandStalder.GeographyMap.InterfaceView.InputListener;
import ru.DKandStalder.GeographyMap.InterfaceView.InterfaceScreen;
import ru.DKandStalder.GeographyMap.MapView.MapScreen;

public class GeographyMapMainClass implements ApplicationListener,GestureDetector.GestureListener,InputProcessor {
	private MapScreen mapScreen;
	private InterfaceScreen interfaceScreen;
	public static InputMultiplexer inputMultiplexer;
	
	@Override
	public void create () {
		inputMultiplexer=new InputMultiplexer();
		inputMultiplexer.addProcessor(new GestureDetector(this));
		inputMultiplexer.addProcessor(this);
		Gdx.input.setInputProcessor(inputMultiplexer);
		this.mapScreen=new MapScreen();
		this.interfaceScreen=new InterfaceScreen();
		this.mapScreen.show();
		this.interfaceScreen.show();
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

	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		this.mapScreen.setInitialScale(mapScreen.getCameraZoom());
		return false;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
		return false;
	}

	@Override
	public boolean longPress(float x, float y) {
		return false;
	}

	@Override
	public boolean fling(float velocityX, float velocityY, int button) {
		return false;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		return false;
	}

	@Override
	public boolean panStop(float x, float y, int pointer, int button) {
		return false;
	}

	@Override
	public boolean zoom(float initialDistance, float distance) {
		this.mapScreen.zoom(initialDistance, distance);
		return false;
	}

	@Override
	public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
		return false;
	}

	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		this.mapScreen.drag(-Gdx.input.getDeltaX(pointer), Gdx.input.getDeltaY(pointer));
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}
}
