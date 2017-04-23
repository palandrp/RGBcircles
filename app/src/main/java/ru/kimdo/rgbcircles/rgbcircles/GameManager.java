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
    private Paint paint;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        heigth = h;
        initMainCircle();
        initPaint();
    }
    
    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width/2, heigth/2);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }
}
