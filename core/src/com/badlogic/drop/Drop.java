package com.badlogic.drop;

import com.badlogic.drop.src.clases.Actores.Balon;
import com.badlogic.drop.src.clases.Actores.Ladrillo;
import com.badlogic.drop.src.clases.Pantallas.PantallaPrincipal;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

public class Drop extends Game {



	@Override
	public void create() {

		this.setScreen( new PantallaPrincipal(this) );
	}
}
