package ru.DKandStalder.GeographyMap.InterfaceView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Злобный ADMIN on 09.04.2015.
 */
public class AssetLoader {

    static TextureRegion stalT, stalF, alumT, alumF, himT, himF, sudT, sudF,autoT, autoF, minudT, minudF;
    static TextureRegion title, nothing;

    public static void load(){
        TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("atlas/atlas.atlas"));
        stalT = atlas.findRegion("isChecked_stal");
        stalF = atlas.findRegion("isntChecked_stal");
        alumT = atlas.findRegion("isChecked_alum");
        alumF = atlas.findRegion("isntChecked_alum");
        himT = atlas.findRegion("isChecked_him");
        himF = atlas.findRegion("isntChecked_him");
        sudT = atlas.findRegion("isChecked_sud");
        sudF = atlas.findRegion("isntChecked_sud");
        autoT = atlas.findRegion("isChecked_auto");
        autoF = atlas.findRegion("isntChecked_auto");
        minudT = atlas.findRegion("isChecked_minud");
        minudF = atlas.findRegion("isntChecked_minud");
        title = atlas.findRegion("title");
        nothing = atlas.findRegion("nothing");
    }

}
