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
        switch (index){
            case 0:
                this.setColor(new Color(0,0,0,1));
                break;
            case 1:
                this.setColor(new Color(0,0,1,1));
                break;
            case 2:
                this.setColor(new Color(0,1,0,1));
                break;
            case 3:
                this.setColor(new Color(0,1,1,1));
                break;
            case 4:
                this.setColor(new Color(1,0,0,1));
                break;
            case 5:
                this.setColor(new Color(1,0,1,1));
                break;
            case 6:
                this.setColor(new Color(0.5f,0.5f,0.5f,1));
                break;
        }
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
