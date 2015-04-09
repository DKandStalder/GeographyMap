package ru.DKandStalder.GeographyMap.MapView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by DK on 09.04.2015.
 */
public class MapLayer extends Actor {
    private TextureRegion textureRegion;
    public MapLayer(int index){
        this.textureRegion=new TextureRegion(new Texture("images/"+index+".png"));
        this.setColor(new Color(MathUtils.random(0,1),MathUtils.random(0,1),MathUtils.random(0,1),MathUtils.random(0,1)));
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        Color parentColor=batch.getColor();
        batch.setColor(this.getColor());
        batch.draw(textureRegion, this.getX(),this.getY());
        batch.setColor(parentColor);

    }
}
