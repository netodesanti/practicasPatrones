package decoradorelementos;

import com.decorador.elementos.Personaje;
import com.decorador.elementos.extras.*;

public class Juego {

	public static void main(String[] args) {
		Personaje miPersonaje = new Personaje();
		
		Mago wiz = new Mago(miPersonaje);
		Amuleto amulet = new Amuleto(wiz);
		
		Guerrero fighter = new Guerrero(miPersonaje);
		Espada sword = new Espada(fighter);
		Armadura armor = new Armadura(sword);
		
		Trabajador worker = new Trabajador(miPersonaje);
		
		System.out.println("El " + amulet.getNombre() + " tiene " + amulet.vida() + " de vida, " +
				amulet.ataque() + " de ataque, " + amulet.defensa() + " de defensa y " + amulet.magia() + " de magia.");
		
		System.out.println("El " + armor.getNombre() + " tiene " + armor.vida() + " de vida, " +
				armor.ataque() + " de ataque, " + armor.defensa() + " de defensa y " + armor.magia() + " de magia.");
		
		System.out.println("El " + worker.getNombre() + " tiene " + worker.vida() + " de vida, " +
				worker.ataque() + " de ataque, " + worker.defensa() + " de defensa y " + worker.magia() + " de magia.");
	}

}
