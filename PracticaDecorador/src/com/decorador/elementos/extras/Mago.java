package com.decorador.elementos.extras;

import com.decorador.elementos.Elemento;

public class Mago extends DecoradorElemento {

	Elemento elemento;
	
	public Mago(Elemento pElemento) {
		this.elemento = pElemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + " Mago";
	}

	@Override
	public int vida() {
		return 8 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 15 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 15 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 40 + this.elemento.magia();
	}

}
