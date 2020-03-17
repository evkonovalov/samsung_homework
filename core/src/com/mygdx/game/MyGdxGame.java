package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.util.ArrayList;

public class MyGdxGame extends ApplicationAdapter {
    private Stage stage;
    private ArrayList<Square> field = new ArrayList<>();

    public void create () {
        stage = new Stage(new ScreenViewport());
        GameConstants.init();
        for(int i = 0; i < GameConstants.getMapCellWidth(); i++){
            for(int j = 0; j < GameConstants.getMapCellHeight(); j++){
                field.add(new Square(i,j));
                stage.addActor(field.get(field.size()-1));
            }
        }
        Gdx.input.setInputProcessor(stage);

    }

    public void resize (int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    public void render () {
        float delta = Gdx.graphics.getDeltaTime();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();
    }

    public void dispose () {
        stage.dispose();
    }
}
