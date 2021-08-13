package com.badlogic.drop.src.clases;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Ladrillo  extends Actor {

    private Texture brickImage;
    private Sprite  brick ;

    Ladrillo(){

        this.brickImage = new Texture( Gdx.files.internal( "pared-ladrillo.png" ) );
        this.brick = new Sprite(this.brickImage);

    }


    Texture getBrickImage(){
         return this.brickImage;
    }
    Sprite getBrick(){ return  this.brick; }

}
