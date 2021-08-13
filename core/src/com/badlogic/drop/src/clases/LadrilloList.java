package com.badlogic.drop.src.clases;

import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;

public class LadrilloList {

    ArrayList<Sprite> listaBricks;
    Ladrillo ladrillo;

    LadrilloList(){

          this.listaBricks = new ArrayList<>();
          this.ladrillo = new Ladrillo();
    }

    private void LlenarLadrillos(){
        for( int i = 1; i<=5 ; i++  ){
            for( int j = 1 ; j<=5 ; j++ ){

                Sprite newBall = new Sprite( this.ladrillo.getBrickImage() );
                newBall.setX(  j * 55 + 220 );
                newBall.setY( i * 35 + 200 );
                this.listaBricks.add(newBall);

            }
        }
    }

}
