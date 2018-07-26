package com.decorador.elementos.extras;

import com.decorador.elementos.Elemento;

public class Amuleto extends DecoradorElemento {
	Elemento elemento;

	public Amuleto(Elemento elemento) {
		this.elemento = elemento;
	}

	@Override
	public String getNombre() {
		return this.elemento.getNombre() + " con amuleto";
	}

	@Override
	public int vida() {
		return this.elemento.vida();
	}

	@Override
	public int ataque() {
		return this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return this.elemento.defensa();
	}

	@Override
	public int magia() {
		if (this.elemento.getNombre().equals("Personaje Trabajador")) {
			return this.elemento.magia();
		} else {
			return 10 + this.elemento.magia();
		}
	}
	
	
}
