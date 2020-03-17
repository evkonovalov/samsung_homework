package com.mygdx.game;

import com.badlogic.gdx.Gdx;

public class GameConstants {
    private static float cellSize = 0;
    private static float screenWidth = 0;
    private static float screenHeight = 0;
    private static float mapCellWidth = 0;
    private static float mapCellHeight = 0;
    private static float mapWidth = 0;
    private static float mapHeight = 0;

    static void init(){
        screenHeight = Gdx.graphics.getHeight();
        screenWidth = Gdx.graphics.getWidth();
        mapCellWidth = 20;
        mapCellHeight = 20;
        float min = Math.min(screenWidth - 2*screenWidth/10,screenHeight - 2*screenHeight/7);
        mapWidth = min;
        mapHeight = min;
        cellSize = min / mapCellWidth;
    }

    public static float getCellSize() {
        return cellSize;
    }

    public static float getMapHeight() {
        return mapHeight;
    }

    public static float getMapWidth() {
        return mapWidth;
    }

    public static float getMapCellHeight() {
        return mapCellHeight;
    }
    public static float getScreenWidth() {
        return screenWidth;
    }

    public static float getScreenHeight() {
        return screenHeight;
    }

    public static float getMapCellWidth() {
        return mapCellWidth;
    }
}
