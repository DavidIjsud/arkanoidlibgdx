package com.badlogic.drop.src.clases;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Balon extends Actor {

        private Texture ballImage;
        private Sprite ball ;

        Balon(){
            this.ballImage = new Texture( Gdx.files.internal("bolita.png") );
            this.ball = new Sprite(this.ballImage);
         }

         Texture getBallImage(){
             return this.ballImage;
         }

         Sprite getBall(){
             return this.ball;
         }

}
