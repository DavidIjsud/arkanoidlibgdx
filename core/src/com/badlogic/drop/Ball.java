package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.awt.Image;

public class Ball extends Sprite {

      private int xdir,ydir;
      private Texture textureBall;

      public Ball(){
           initBall();
      }

      private void initBall(){
             this.xdir = 10;
             this.ydir = 10;
             this.setX( this.xdir );
             this.setY( this.ydir );
             cargarImagen();
      }

      private void cargarImagen(){


          this.textureBall = new Texture( Gdx.files.internal("bolita.png") );
          this.setTexture(this.textureBall);

      }

      void setXdir( int x ){
           this.xdir = x;
      }

      int getXdir(){
           return this.xdir;
      }

      void setYdir( int y ){
           this.ydir = y;
      }

      int getYdir(){
           return this.ydir;
      }

      private void resetear(){
           this.setX( Comunes.INIT_BALL_X );
           this.setY( Comunes.INIT_BALL_Y );
      }

      void mover(){
          this.setX( this.getX() + this.xdir );
          this.setY( this.getY() + this.ydir  );

          if( this.getX() == 0 ){
                    this.setXdir(1);
          }

          if( this.getX() == Comunes.WIDTH - this.getTexture().getWidth() ){
              this.setXdir(-1);
          }

         if( this.getY() == 0 ){
              this.setYdir(1);
         }

      }

}

