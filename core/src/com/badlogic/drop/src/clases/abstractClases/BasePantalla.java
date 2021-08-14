package com.badlogic.drop.src.clases.abstractClases;

import com.badlogic.drop.Drop;
import com.badlogic.gdx.Screen;

public abstract   class BasePantalla implements Screen {

    protected Drop game;

    public BasePantalla(Drop game ){
         this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
