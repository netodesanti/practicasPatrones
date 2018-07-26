package com.decorador.elementos.extras;

import com.decorador.elementos.Elemento;

public class Espada extends DecoradorElemento {
	Elemento elemento;

	public Espada(Elemento elemento) {
		this.elemento = elemento;
	}

	@Override
	public String getNombre() {
		return this.elemento.getNombre() + " con espada";
	}

	@Override
	public int vida() {
		return 1 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 10 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 10 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return this.elemento.magia();
	}
	
}
