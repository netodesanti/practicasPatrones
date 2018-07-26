/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

/**
 *
 * @author maguero
 */
public class InformacionComida {
    private final String nombre; 
    private final int cantidadPorcion;
    private final Medida unidadDeMedida;
    private final int porciones;
    private final int calorias;
    private final int grasa;
    private final int sodio;
    private final int carbohidratos;

    public InformacionComida(final String pNombre, final int pCantidadPorcion, final Medida pMedida, 
    		final int pPorciones, final int pCalorias, final int pGrasa, final int pSodio, final int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }
    
    @Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}

	public static class ComidaBuilder {
    	private String nestedNombre; 
        private int nestedCantidadPorcion;
        private Medida nestedUnidadDeMedida;
        private int nestedPorciones;
        private int nestedCalorias;
        private int nestedGrasa;
        private int nestedSodio;
        private int nestedCarbohidratos;
    	
    	public ComidaBuilder(String nestedNombre, int nestedCantidadPorcion, Medida nestedUnidadDeMedida) {
			this.nestedNombre = nestedNombre;
			this.nestedCantidadPorcion = nestedCantidadPorcion;
			this.nestedUnidadDeMedida = nestedUnidadDeMedida;
		}

		public ComidaBuilder porciones(int nestedPorciones) {
			this.nestedPorciones = nestedPorciones;
			return this;
		}
        
        public ComidaBuilder calorias(int nestedCalorias) {
        	this.nestedCalorias = nestedCalorias;
        	return this;
        }
        
        public ComidaBuilder grasa(int nestedGrasa) {
        	this.nestedGrasa = nestedGrasa;
        	return this;
        }
        
        public ComidaBuilder sodio(int nestedSodio) {
        	this.nestedSodio = nestedSodio;
        	return this;
        }
        
        public ComidaBuilder carbos(int nestedCarbos) {
        	this.nestedCarbohidratos = nestedCarbos;
        	return this;
        }
        
        public InformacionComida createInfo() {
        	return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, nestedPorciones, nestedCalorias, nestedGrasa, nestedSodio, nestedCarbohidratos);
        }
    }
    
    
}
