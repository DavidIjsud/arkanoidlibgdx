package com.badlogic.drop.src.clases.controladores;

import com.badlogic.drop.src.clases.Actores.Ladrillo;
import com.badlogic.drop.src.clases.Actores.Usuario;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.sun.tools.javac.util.Log;

public class ControladorUsuario  {

        Usuario usuario;

       public ControladorUsuario( Usuario usuario ){
              this.usuario = usuario;
        }

        Usuario getUsuario(){
           return this.usuario;
        }

        public void verificarSiColisionaBarraYBall(ControladorLadrilloBola controladorLadrilloBola , Stage escenario){

            Rectangle recBarra =  this.usuario.getUsuarioSprite().getBoundingRectangle();
            Rectangle recBall =  controladorLadrilloBola.balon.getBalonSprite().getBoundingRectangle();
            boolean collision = recBall.overlaps(recBarra);
            if(collision){
                  controladorLadrilloBola.balon.deltaY =   controladorLadrilloBola.balon.deltaY * (-1);
            }

            checkInputTouch( escenario );
        }

      void  checkInputTouch( Stage escenario  ){

            if( Gdx.input.isTouched() ){

                    Vector3 touchPos = new Vector3();
                    touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
                    this.usuario.getUsuarioSprite().setX( touchPos.x - 64 / 2 );
                    this.usuario.setX(touchPos.x - 64 / 2);

            }
        }


}
