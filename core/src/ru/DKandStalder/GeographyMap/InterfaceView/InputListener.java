package ru.DKandStalder.GeographyMap.InterfaceView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by Злобный ADMIN on 09.04.2015.
 */
public class InputListener implements InputProcessor {

    int x, stalY, alumY, autoY, sudY, minudY, himY, width, height;

    public InputListener(int x, int stalY, int alumY, int autoY, int sudY, int minudY, int himY,
                         int width, int height){
        this.x = x;
        this.stalY = stalY;
        this.alumY = alumY;
        this.autoY = autoY;
        this.sudY = sudY;
        this.minudY = minudY;
        this.himY = himY;
        this.width = width;
        this.height = height;
        Gdx.app.log("Конструктор", stalY + " " + alumY);
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
        if ((screenX > x)&&(screenX < x + width)){

            if ( (Gdx.graphics.getHeight() - screenY > stalY)
                && (Gdx.graphics.getHeight() - screenY < stalY + height)) {
                Checkbox.changeStal();
            }

            if ( (Gdx.graphics.getHeight() - screenY > alumY)
                    && (Gdx.graphics.getHeight() - screenY < alumY + height)) {
                Checkbox.changeAlum();
            }

            if ( (Gdx.graphics.getHeight() - screenY > autoY)
                    && (Gdx.graphics.getHeight() - screenY < autoY + height)){
                Checkbox.changeAuto();
            }

            if ( (Gdx.graphics.getHeight() - screenY > sudY)
                    && (Gdx.graphics.getHeight() - screenY < sudY + height)) {
                Checkbox.changeSuda();
            }

            if ( (Gdx.graphics.getHeight() - screenY > minudY)
                    && (Gdx.graphics.getHeight() - screenY < minudY + height)) {
                Checkbox.changeMinud();
            }

            if ( (Gdx.graphics.getHeight() - screenY > himY)
                    && (Gdx.graphics.getHeight() - screenY < himY + height)) {
                Checkbox.changeHim();
            }
        }
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
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
