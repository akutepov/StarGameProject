package ru.geekbrains.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.base.Sprite;

public class Logo extends Sprite {

    private static final float V_LEN = 0.01f;

    private Vector2 endPos;
    private Vector2 v;
    private Vector2 buf;

    public Logo(TextureRegion region) {
        super(region);
        endPos = new Vector2();
        v = new Vector2();
        buf = new Vector2();
    }

    @Override
    public void update(float delta) {
        buf.set(endPos);
        if (buf.sub(pos).len() > V_LEN) {
            pos.add(v);
        } else {
            pos.set(endPos);
        }
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        endPos.set(touch);
        v.set(touch.sub(pos)).setLength(V_LEN);
        return false;
    }
}
