package com.badlogic.drop.src.clases.controladores;


import com.badlogic.drop.src.clases.Actores.Balon;
import com.badlogic.drop.src.clases.Actores.Explosion;
import com.badlogic.drop.src.clases.Actores.Ladrillo;
import com.badlogic.drop.src.clases.Actores.Usuario;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.sun.tools.sjavac.Log;

import java.util.ArrayList;
import java.util.Iterator;

public class ControladorLadrilloBola {

       Balon balon;
       ArrayList<Ladrillo> listaDeLadrillos;
    private Sound explosionSound;

       public ControladorLadrilloBola( Balon balon , ArrayList<Ladrillo> listaDeLadrillos  ){
                this.explosionSound = Gdx.audio.newSound(Gdx.files.internal("explosion.wav"));
                this.balon = balon;
                this.listaDeLadrillos = listaDeLadrillos;
        }

        public Balon getBalon(){
            return this.balon;
        }

        public ArrayList<Ladrillo> getListaDeLadrillos(){
            return this.listaDeLadrillos;
        }

      public void limiteChocado(Stage escenario){

             if( this.balon.getX() <= 0 + this.balon.getWidth() || this.balon.getX() >= escenario.getWidth() - this.balon.getWidth() - 50
             ){
                 this.balon.delta = this.balon.delta * (-1);
             }

             if( this.balon.getY() <= 0 + this.balon.getHeight() || this.balon.getY() >= escenario.getHeight() - this.balon.getHeight() - 50  ){
                 this.balon.deltaY = this.balon.deltaY * (-1);
             }

          ladrilloChoca(escenario);

        }

        public void ladrilloChoca( Stage escenario ){


            for(Actor actor : escenario.getActors()) {
                //actor.remove();

                if(actor.getName().equals("Ladrillo") ){


                     Rectangle  x = ( (Ladrillo) actor ).getSpriteLadrillo().getBoundingRectangle();
                    Rectangle recBall = this.balon.getBalonSprite().getBoundingRectangle();
                    boolean collision = recBall.overlaps(x);



                    if (collision) {
                           //actor.addAction(Actions.removeActor());
                            actor.remove();
                            this.balon.deltaY = this.balon.deltaY * (-1);
                            this.explosionSound.play();
                            Gdx.input.vibrate(1000);
                            return;
                     }
                }



            }

        }



}
