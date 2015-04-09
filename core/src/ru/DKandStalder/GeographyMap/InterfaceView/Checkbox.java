package ru.DKandStalder.GeographyMap.InterfaceView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Злобный ADMIN on 09.04.2015.
 */
public class Checkbox extends Actor{
    private static boolean isStalPressed, isAlumPressed, isAutoPressed, isSudaPressed, isMinudPressed, isHimPressed;
    int x, titleY, alumY, autoY, stalY, sudY, minudY, himY, width, height, layerHeight;
    float koef;

    public Checkbox(int upY, int x, int width){
        this.x = x;
        this.width = width;
        koef = AssetLoader.alumT.getRegionWidth()/width;
        height = (int)(AssetLoader.alumT.getRegionHeight()/koef);
        titleY = upY - height;
        stalY = titleY - height;
        alumY = stalY - height - 2;
        autoY = alumY - height - 2;
        sudY = autoY - height - 2;
        minudY = sudY - height - 2;
        himY = minudY - height - 2;
        layerHeight = upY;
        Gdx.input.setInputProcessor(new InputListener(x, stalY, alumY, autoY, sudY, minudY, himY, width, height));
    }

    public static boolean isStalPressed() {
        return isStalPressed;
    }
    public static void changeStal(){isStalPressed = !isStalPressed;}

    public static boolean isAlumPressed() {
        return isAlumPressed;
    }
    public static void changeAlum(){isAlumPressed = !isAlumPressed;}

    public static boolean isAutoPressed() {
        return isAutoPressed;
    }
    public static void changeAuto(){isAutoPressed = !isAutoPressed;}

    public static boolean isSudaPressed() {
        return isSudaPressed;
    }
    public static void changeSuda(){isSudaPressed = !isSudaPressed;}

    public static boolean isMinudPressed() {
        return isMinudPressed;
    }
    public static void changeMinud(){isMinudPressed = !isMinudPressed;}

    public static boolean isHimPressed() {
        return isHimPressed;
    }
    public static void changeHim(){isHimPressed = !isHimPressed;}

    @Override
    public void draw(Batch batch, float parrentAlpha){
        super.draw(batch,parrentAlpha);

        batch.draw(AssetLoader.nothing, x - 5, 0, width + 30, layerHeight);

        batch.draw(AssetLoader.title, x, titleY, width, height);

        if (isAlumPressed) batch.draw(AssetLoader.alumT, x, alumY, width, height);
        else batch.draw(AssetLoader.alumF, x, alumY, width, height);

        if (isAutoPressed) batch.draw(AssetLoader.autoT, x, autoY, width, height);
        else batch.draw(AssetLoader.autoF, x, autoY, width, height);

        if (isStalPressed) batch.draw(AssetLoader.stalT, x, stalY, width, height);
        else batch.draw(AssetLoader.stalF, x, stalY, width, height);

        if (isSudaPressed) batch.draw(AssetLoader.sudT, x, sudY, width, height);
        else batch.draw(AssetLoader.sudF, x, sudY, width, height);

        if (isMinudPressed) batch.draw(AssetLoader.minudT, x, minudY, width, height);
        else batch.draw(AssetLoader.minudF, x, minudY, width, height);

        if (isHimPressed) batch.draw(AssetLoader.himT, x, himY, width, height);
        else batch.draw(AssetLoader.himF, x, himY, width, height);
    }
}
