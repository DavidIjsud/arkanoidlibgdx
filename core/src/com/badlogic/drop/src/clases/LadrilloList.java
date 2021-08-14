package com.badlogic.drop.src.clases;

import com.badlogic.drop.src.clases.Actores.Ladrillo;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LadrilloList {

    ArrayList<Ladrillo> listaBricks;

    public LadrilloList(){

        this.listaBricks = new ArrayList<>();
        LlenarLadrillos();
    }

    private void LlenarLadrillos(){
        for( int i = 1; i<=5 ; i++  ){
            for( int j = 1 ; j<=5 ; j++ ){

                Ladrillo nuevoLadrillo = new Ladrillo();
                nuevoLadrillo.setX(j * 110 + 500);
               nuevoLadrillo.setY(i * 55 + 400);

                nuevoLadrillo.getSpriteLadrillo().setX(j * 110 + 500);
                nuevoLadrillo.getSpriteLadrillo().setY(i * 55 + 400);

                this.listaBricks.add(nuevoLadrillo);

            }
        }
    }

   public ArrayList<Ladrillo> getListaBricks (){
         return this.listaBricks;
    }

}
