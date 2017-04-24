package ru.kimdo.rgbcircles.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by kimdo on 24.04.17.
 */
public class GameManager {
    private MainCircle mainCircle;
    private CanvasView canvasView;
    private static int width;
    private static int heigth;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        heigth = h;
        initMainCircle();
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width/2, heigth/2);
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
    }
}
