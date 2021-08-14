package com.badlogic.drop.src.clases.Actores;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Usuario extends Actor   {


     Texture usuarioTexture;
     Sprite usuarioSprite;

     public Usuario(){
          this.setName("Usuario");
          this.usuarioTexture = new Texture("paddle_l.png");
          this.setX(500);
          this.setY(100);
          this.usuarioSprite = new Sprite(this.usuarioTexture );
          this.usuarioSprite.setX(500);
          this.usuarioSprite.setY(100);
     }

     public Sprite getUsuarioSprite(){
           return this.usuarioSprite;
     }


     @Override
     public void draw(Batch batch, float parentAlpha) {
          batch.draw( this.usuarioSprite , this.getX() , this.getY() );
     }
}
