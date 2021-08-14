package com.badlogic.drop.src.clases.Pantallas;

import com.badlogic.drop.Drop;
import com.badlogic.drop.src.clases.Actores.Balon;
import com.badlogic.drop.src.clases.Actores.Ladrillo;
import com.badlogic.drop.src.clases.Actores.Usuario;
import com.badlogic.drop.src.clases.LadrilloList;
import com.badlogic.drop.src.clases.abstractClases.BasePantalla;
import com.badlogic.drop.src.clases.controladores.ControladorLadrilloBola;
import com.badlogic.drop.src.clases.controladores.ControladorUsuario;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.ArrayList;
import java.util.List;

public class PantallaPrincipal  extends BasePantalla {

    private Stage stage;

    Balon balon;
    Usuario usuario;
    LadrilloList x;

    ControladorLadrilloBola controladorLadrilloBola;
    ControladorUsuario controladorUsuario;

      public PantallaPrincipal(Drop game) {
        super(game);

        this.x = new LadrilloList();
        this.balon = new Balon(  );
        this.usuario = new Usuario();

        this.controladorUsuario = new ControladorUsuario( this.usuario );
        this.controladorLadrilloBola = new ControladorLadrilloBola( balon ,x.getListaBricks());

    }

    @Override
    public void show() {

        this.stage = new Stage();

        ArrayList<Ladrillo> lista = this.controladorLadrilloBola.getListaDeLadrillos();

        for( int x = 0 ; x < lista.size() ; x++  ){
            this.stage.addActor( lista.get(x) );
        }

        this.stage.addActor(this.usuario);
        this.stage.addActor(this.balon);

    }

    @Override
    public void hide() {

        stage.dispose();

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor( 1.0f,1.0f,1.0f,1f );
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
       // this.stage.act();
        this.stage.draw();
        this.controladorLadrilloBola.limiteChocado( this.stage );
        this.controladorUsuario.verificarSiColisionaBarraYBall( this.controladorLadrilloBola , this.stage );
    }
}
