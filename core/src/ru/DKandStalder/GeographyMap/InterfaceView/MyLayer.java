package ru.DKandStalder.GeographyMap.InterfaceView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by Злобный ADMIN on 09.04.2015.
 */
public class MyLayer extends Stage {

    Checkbox checkbox;

    public MyLayer(){
        checkbox = new Checkbox(Gdx.graphics.getHeight(),(Gdx.graphics.getWidth()/7)*6, (Gdx.graphics.getWidth()/7));
        addActor(checkbox);
    }

    @Override
    public void draw(){super.draw();}
}
