package com.decorador.elementos;

public class Objeto extends Elemento {

	public Objeto() {
		this.nombre = "Objeto";
	}
	
	@Override
	public int vida() {
		return this.vida();
	}

	@Override
	public int ataque() {
		return this.ataque();
	}

	@Override
	public int defensa() {
		return this.defensa();
	}

	@Override
	public int magia() {
		return this.magia();
	}
	
}
