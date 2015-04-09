package ru.DKandStalder.GeographyMap.MapView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by DK on 07.04.2015.
 */
public class MapScreen implements Screen {
    private Stage mapStage;
    public MapScreen(){
        this.mapStage=new Stage();
    }
    @Override
    public void show() {
        this.mapStage=new Stage();
        for (int i = 0; i < 6; i++) {
            this.mapStage.addActor(new MapLayer(i));
        }
    }

    @Override
    public void render(float delta) {
        this.mapStage.draw();
    }

    @Override
    public void resize(int width, int height) {

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
