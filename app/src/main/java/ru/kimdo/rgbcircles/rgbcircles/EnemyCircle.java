package ru.kimdo.rgbcircles.rgbcircles;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by kimdo on 25.04.17.
 */
public class EnemyCircle extends SimpleCircle {

    public static final int FROM_RADIUS = 10;
    public static final int TO_RADIUS = 110;
    public static final int ENEMY_COLOR = Color.RED;
    public static final int FOOD_COLOR = Color.rgb(0, 200, 0);

    public EnemyCircle(int x, int y, int radius) {
        super(x, y, radius);
    }


    public static EnemyCircle getRandomCircle() {
        Random random = new Random();
        int x = random.nextInt(GameManager.getWidth());
        int y = random.nextInt(GameManager.getHeight());
        int radius = FROM_RADIUS + random.nextInt(TO_RADIUS - FROM_RADIUS);
        EnemyCircle enemyCircle = new EnemyCircle(x, y, radius);
        enemyCircle.setColor(ENEMY_COLOR);
        return enemyCircle;
    }

    public void setEnemyOrFoodColorDependsOn(MainCircle mainCircle) {
        if (isSmallerThan(mainCircle)){
            setColor(FOOD_COLOR);
        }  else {
            setColor(ENEMY_COLOR);
        }
    }

    private boolean isSmallerThan(SimpleCircle circle) {
        if (radius < circle.radius) return true;
        return false;
    }
}
