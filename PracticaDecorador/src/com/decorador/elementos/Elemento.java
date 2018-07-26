package com.decorador.elementos;

public abstract class Elemento {
	String nombre = "desconocido";
	
	public String getNombre() {
		return this.nombre;
	}

	public abstract int vida();
	public abstract int ataque();
	public abstract int defensa();
	public abstract int magia();
}
