package com.badlogic.drop.src.clases.Actores;

import com.badlogic.drop.src.clases.controladores.ControladorLadrilloBola;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Balon extends Actor {

    private Texture balo ;
   public int delta;
   public int deltaY;


   private Sprite balonSprite;

   public Balon( ){
            this.setName("Balon");
            this.delta = this.deltaY = 5;
            this.balo = new Texture("ball_l.png");

            this.setX(10);
            this.setY(10);

            this.balonSprite = new Sprite( this.balo );
            this.balonSprite.setY(10);
            this.balonSprite.setX(10);
    }

    public Sprite getBalonSprite(){
        return this.balonSprite;
    }



    @Override
    public void draw(Batch batch, float parentAlpha) {

          this.setX( this.getX() + this.delta );
          this.setY( this.getY() + this.deltaY );

         this.balonSprite.setX( this.balonSprite.getX() + this.delta );
         this.balonSprite.setY( this.balonSprite.getY() + this.deltaY );

        batch.draw(this.balonSprite , getX() , getY());

    }



}
