package com.badlogic.drop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.math.Rectangle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drop extends ApplicationAdapter {

	    private Texture   ballImage, brickImage;
		private Sprite ball ;
		private OrthographicCamera camera;
		private SpriteBatch batch;
		ArrayList<Sprite> listaBricks;

		int xDir, yDir;

	
	@Override
	public void create () {

		camera = new OrthographicCamera();
		batch = new SpriteBatch();
		camera.setToOrtho(false, Comunes.WIDTH, Comunes.HEIGHT);
		this.listaBricks = new ArrayList<>();
		this.xDir = 5;
		this.yDir = 5;

		this.ballImage = new Texture( Gdx.files.internal("bolita.png") );
		this.brickImage = new Texture( Gdx.files.internal( "ladrillo.png" ) );
		this.ball = new Sprite(this.ballImage);

		this.ball.setX( 500 );
		this.ball.setY(100);

		LlenarLadrillos();

	}

	private void LlenarLadrillos(){
		for( int i = 1; i<=5 ; i++  ){
			for( int j = 1 ; j<=5 ; j++ ){

			  Sprite newBall = new Sprite( this.brickImage );
			  newBall.setX(  j * 55 + 220 );
			  newBall.setY( i * 35 + 200 );
		      this.listaBricks.add(newBall);
			}
		}
	}

	private void DibujarLadrillos(){

			for( Sprite s : this.listaBricks ){
					this.batch.draw( s , s.getX() , s.getY()  );
			}
	}

	private void animarBolita(){

		  this.batch.draw( this.ball , this.ball.getX(), this.ball.getY() );

		  this.ball.setX( this.ball.getX() + this.xDir );
		  this.ball.setY( this.ball.getY() + this.yDir );
		  if( this.ball.getX() >= Comunes.WIDTH - this.ball.getWidth() || this.ball.getX() <= 0  ){
		  		this.xDir = this.xDir * (-1);
		  }

		  if( this.ball.getY() >= Comunes.HEIGHT - this.ball.getHeight() || this.ball.getY() <= 0 ){
		  			this.yDir = this.yDir * (-1);
		  }

		  checkIfCollision();

	}

	void checkIfCollision() {

		for (Iterator<Sprite> it = this.listaBricks.iterator(); it.hasNext(); ) {
			Sprite s = it.next();
			Rectangle rectBall = this.ball.getBoundingRectangle();
			Rectangle rectBrick = s.getBoundingRectangle();
			boolean collision = rectBall.overlaps(rectBrick);
			if (collision) {
				it.remove();
				this.yDir = this.yDir * (-1);
			}

		}


//		for (Sprite s : this.listaBricks) {
//			Rectangle rectBall = this.ball.getBoundingRectangle();
//			Rectangle rectBrick = s.getBoundingRectangle();
//			boolean collision = rectBall.overlaps(rectBrick);
//			if (collision) {
//				this.listaBricks.clear();
//				this.yDir = this.yDir * (-1);
//			}
//		}


	}

	@Override
	public void render () {
		ScreenUtils.clear(1.0f, 1.0f, 1.0f, 1);

		batch.setProjectionMatrix(camera.combined);

		batch.begin();
		   DibujarLadrillos();
		batch.end();

		batch.begin();
		    animarBolita();
		batch.end();


		camera.update();

	}
	
	@Override
	public void dispose () {

	}
}
