package com.decorador.elementos.extras;

import com.decorador.elementos.Elemento;

public class Escudo extends DecoradorElemento {
	Elemento elemento;

	public Escudo(Elemento elemento) {
		this.elemento = elemento;
	}

	@Override
	public String getNombre() {
		return this.elemento.getNombre() + " con escudo";
	}

	@Override
	public int vida() {
		return 10 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 40 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return this.elemento.magia();
	}
	
}
