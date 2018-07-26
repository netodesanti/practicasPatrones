package com.decorador.elementos.extras;

import com.decorador.elementos.Elemento;

public class Armadura extends DecoradorElemento {
	Elemento elemento;

	public Armadura(Elemento elemento) {
		super();
		this.elemento = elemento;
	}

	@Override
	public String getNombre() {
		return this.elemento.getNombre() + " con armadura";
	}

	@Override
	public int vida() {
		return 20 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 20 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return this.elemento.magia();
	}
	
}
