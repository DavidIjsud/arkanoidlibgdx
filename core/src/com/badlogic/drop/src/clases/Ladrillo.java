package com.badlogic.drop.src.clases;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Ladrillo {

    private Texture brickImage;

    Ladrillo(){
        this.brickImage = new Texture( Gdx.files.internal( "pared-ladrillo.png" ) );
    }


    Texture getBrickImage(){
         return this.brickImage;
    }

}
