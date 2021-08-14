package com.badlogic.drop.src.clases.Actores;

import com.badlogic.drop.src.clases.controladores.ControladorLadrilloBola;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

import org.w3c.dom.Text;

public class Ladrillo  extends Actor {

    private  Texture ladrillo;
    private Sprite spriteLadrillo;

    public Ladrillo( ){
        this.setName("Ladrillo");
        this.ladrillo = new Texture("pared-ladrillo.png");
        this.spriteLadrillo = new Sprite( this.ladrillo );
    }

    public Sprite getSpriteLadrillo(){
         return this.spriteLadrillo;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {

           batch.draw( this.spriteLadrillo ,  getX() , getY()  );

    }

}
