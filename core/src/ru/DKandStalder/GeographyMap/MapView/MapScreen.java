package ru.DKandStalder.GeographyMap.MapView;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import ru.DKandStalder.GeographyMap.InterfaceView.Checkbox;

/**
 * Created by DK on 07.04.2015.
 */
public class MapScreen implements Screen {
    private Stage mapStage;
    private OrthographicCamera camera;
    private float zoom=1;

    private float initialScale=1;
    public MapScreen(){
        this.mapStage=new Stage();
        this.camera=new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        this.camera.position.set(Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2,0);
    }
    @Override
    public void show() {
        this.mapStage=new Stage();
        this.mapStage.getViewport().setCamera(camera);
        for (int i = 0; i < 7; i++) {
            this.mapStage.addActor(new MapLayer(i));
        }
    }

    @Override
    public void render(float delta) {
        this.mapStage.draw();
        this.camera.zoom=this.zoom;
        for (int i = 1; i < this.mapStage.getActors().size; i++) {
            switch (i){
                case 1:
                    this.mapStage.getActors().get(i).setVisible(Checkbox.isAlumPressed());
                    break;
                case 2:
                    this.mapStage.getActors().get(i).setVisible(Checkbox.isStalPressed());
                    break;
                case 3:
                    this.mapStage.getActors().get(i).setVisible(Checkbox.isAutoPressed());
                    break;
                case 4:
                    this.mapStage.getActors().get(i).setVisible(Checkbox.isSudaPressed());
                    break;
                case 5:
                    this.mapStage.getActors().get(i).setVisible(Checkbox.isHimPressed());
                    break;
                case 6:
                    this.mapStage.getActors().get(i).setVisible(Checkbox.isMinudPressed());
                    break;

            }
        }
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
    public boolean zoom(float initialDistance, float distance) {

        //Clamp range and set zoom
        this.zoom = MathUtils.clamp(initialScale * initialDistance / distance, 0.001f, 1000.0f);
        Gdx.app.log("zoom",zoom+"");
        return true;
    }
    public void setInitialScale(float initialScale) {
        this.initialScale = initialScale;
        Gdx.app.log("initialScale",initialScale+"");
    }
    public void drag(float dx,float dy){
        this.camera.position.add(dx*camera.viewportWidth/ Gdx.graphics.getWidth()*zoom,dy*camera.viewportHeight/Gdx.graphics.getHeight()*zoom,0);
        Gdx.app.log("drag",dx+" "+dy);
    }
    public float getCameraZoom(){
        return this.camera.zoom;
    }
}
