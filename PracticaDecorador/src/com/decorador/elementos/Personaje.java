package com.decorador.elementos;

public class Personaje extends Elemento {
	public Personaje() {
		this.nombre = "Personaje";
	}

	@Override
	public int vida() {
		return 0;
	}

	@Override
	public int ataque() {
		return 0;
	}

	@Override
	public int defensa() {
		return 0;
	}

	@Override
	public int magia() {
		return 0;
	}
}
