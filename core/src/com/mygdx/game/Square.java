package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Square extends Actor {
    TextureRegion region;

    public Square (int i, int j) {
        region = new TextureRegion(new Texture(Gdx.files.internal("red.jpg")));
        setBounds(20 + GameConstants.getCellSize() * i, 20 + GameConstants.getCellSize() * j,
                region.getRegionWidth(), region.getRegionHeight());
        setScale(GameConstants.getCellSize()/region.getRegionWidth());
    }

    @Override
    public void draw (Batch batch, float parentAlpha) {
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
        batch.draw(region, getX(), getY(), getOriginX(), getOriginY(),
                getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
    }
}