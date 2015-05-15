package ru.DKandStalder.GeographyMap.InterfaceView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

/**
 * Created by DK on 07.04.2015.
 */
public class InterfaceScreen implements Screen {

    MyLayer layer;

    public InterfaceScreen(){
        AssetLoader.load();
        layer = new MyLayer();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        layer.draw();
    }

    @Override
    public void resize(int width, int height) {
        layer = new MyLayer();

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
