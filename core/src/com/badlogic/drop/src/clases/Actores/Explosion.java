package com.badlogic.drop.src.clases.Actores;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Explosion extends Actor {

    Texture textureExpolosion;
    Sprite spriteExplosion;

     public Explosion(){
           this.setName("Explosion");
           this.textureExpolosion = new Texture("explosion.png");
           this.spriteExplosion = new Sprite(this.textureExpolosion);
     }

     public Sprite getSpriteExplosion(){
          return spriteExplosion;
     }



}
