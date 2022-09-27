package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	public Animal() {}
	
	public String movimiento() {
		return "desplazarse";
	}
	public ArrayList<Zona> obtenerZona() {
		return zona;
	}
	public void ponerZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	public static void ponerTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public static int obtenerTotalAnimales() {
		return totalAnimales;
	}
	public static void ponerTotalAnimales() {
		Animal.totalAnimales++;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
        
	public int obtenerEdad() {
		return edad;
	}
        
	public void ponerEdad(int edad) {
		this.edad = edad;
	}
        
	public String obtenerHabitat() {
		return habitat;
	}
        
	public void ponerHabitat(String habitat) {
		this.habitat = habitat;
	}
        
	public String obtenerGenero() {
		return genero;
	}
        
	public void ponerGenero(String genero) {
		this.genero = genero;
	}
        
	public void ponerZona(Zona nZona) {
		zona.add(nZona);
	}
	
	public static String totalPorTipo() {
		int nMamiferos = Mamifero.cantidadMamiferos();
		int nAves = Ave.cantidadAves();
		int nReptiles = Reptil.cantidadReptiles();
		int nPeces = Pez.cantidadPeces();
		int nAnfibios = Anfibio.cantidadAnfibios();
		return "Mamiferos: " + nMamiferos+"\nAves: " + nAves+"\nReptiles: " + nReptiles+"\nPeces: " + nPeces+"\nAnfibios: " + nAnfibios;
                
	}
        
        //METODO TOSTRING
	@Override
	public String toString() {
		if(zona.size() == 1) {	
			return "Mi nombre es "+obtenerNombre()+", tengo una edad de "+obtenerEdad()+
				", habito en "+obtenerHabitat()+" y mi genero es "+obtenerGenero()+", la zona en la que me ubico es "+zona.get(0)+ ", en el "+zona.get(0).obtenerZoo();
		}else {
			return "Mi nombre es "+obtenerNombre()+
					", tengo una edad de "+obtenerEdad()+", habito en "+obtenerHabitat()+ " y mi genero es "+obtenerGenero();
		}
	}
	
	
}