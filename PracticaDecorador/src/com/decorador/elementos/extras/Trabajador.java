package com.decorador.elementos.extras;

import com.decorador.elementos.Elemento;

public class Trabajador extends DecoradorElemento {
	Elemento elemento;

	public Trabajador(Elemento pElemento) {
		this.elemento = pElemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + " Trabajador";
	}

	@Override
	public int vida() {
		return 25 + this.elemento.vida();
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
		return 10 + this.elemento.magia();
	}
}
