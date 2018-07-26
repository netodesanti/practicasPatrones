package com.decorador.elementos.extras;

import com.decorador.elementos.Elemento;

public class Guerrero extends DecoradorElemento {
	Elemento elemento;

	public Guerrero(Elemento pElemento) {
		this.elemento = pElemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + " Guerrero";
	}

	@Override
	public int vida() {
		return 20 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 30 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 30 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 20 + this.elemento.magia();
	}
}
