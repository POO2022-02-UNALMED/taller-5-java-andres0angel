package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	public Zona() {
	}
        
        //METODOS GET Y SET
        
        public void ponerZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
        
        public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
        
        public void ponerAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
        
        public ArrayList<Animal> obtenerAnimales() {
		return animales;
	}
        
	public String obtenerNombre() {
		return nombre;
	}
	
	public Zoologico obtenerZoo() {
		return zoo;
	}
	

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		animal.ponerZona(this);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
        @Override
	public String toString() {
		return nombre;
	}
}
