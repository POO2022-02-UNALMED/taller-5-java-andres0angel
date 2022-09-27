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
        
        //GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico Zoologico) {
		this.zoo = Zoologico;
	}
        public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
        
        
        
        public ArrayList<Animal> getAnimales() {
		return animales;
	}
        

	public void agregarAnimales(Animal animal) {
		animales.add(animal);
		animal.setZona(this);
	}
	
	
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public String toString() {
		return nombre;
	}
}
