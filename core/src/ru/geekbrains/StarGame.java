package ru.geekbrains;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class StarGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TextureRegion region;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		region = new TextureRegion(img, 50, 50, 200, 150);

		Vector2 v1 = new Vector2(2, 3);
		Vector2 v2 = new Vector2(0, -1);
		v1.add(v2);
		System.out.println("v1 add v2 : v1.x = " + v1.x + " v1.y = " + v1.y);

		v1.set(4, 3);
		v2.set(7, 6);
		v1.sub(v2);
		System.out.println("v1 sub v2 : v1.x = " + v1.x + " v1.y = " + v1.y);
		System.out.println("v1.len() = " + v1.len());
		v2.set(0, 10);
		System.out.println("v2.len() = " + v2.len());
		v2.scl(0.9f);
		System.out.println("v2.len() = " + v2.len());
		v1.nor();
		System.out.println("v1.len() = " + v1.len());
		System.out.println("v1 sub v2 : v1.x = " + v1.x + " v1.y = " + v1.y);

		v1.set(4, 3);
		v2.set(7, 6);
		Vector2 v3 = v1.cpy().sub(v2);
		System.out.println("v1 sub v2 : v1.x = " + v1.x + " v1.y = " + v1.y);
		System.out.println("v1 sub v2 : v3.x = " + v3.x + " v3.y = " + v3.y);

		v1.set(0, 10);
		v2.set(10, 0);
		System.out.println("v1.dot(v2) = " + v1.dot(v2));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.26f, 0.5f, 0.8f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.setColor(0.6f, 0.7f, 0.8f, 0.9f);
		batch.draw(img, 0, 0);
		batch.setColor(0.1f, 0.2f, 0.3f, 0.5f);
		batch.draw(region, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
