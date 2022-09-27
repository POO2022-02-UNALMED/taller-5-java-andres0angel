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
        
        public static String totalPorTipo() {
		int nMamiferos = Mamifero.cantidadMamiferos();
		int nAves = Ave.cantidadAves();
		int nReptiles = Reptil.cantidadReptiles();
		int nPeces = Pez.cantidadPeces();
		int nAnfibios = Anfibio.cantidadAnfibios();
		return "Mamiferos: " + nMamiferos+"\nAves: " + nAves+"\nReptiles: " + nReptiles+"\nPeces: " + nPeces+"\nAnfibios: " + nAnfibios;
	}
	@Override
	public String toString() {
		if(zona.size() == 1) {	
			return "Mi nombre es "+getNombre()+", tengo una edad de "+getEdad()+", habito en "+getHabitat()+" y mi genero es "+getGenero()+
					", la zona en la que me ubico es "+zona.get(0)+", en el "+zona.get(0).getZoo();
		}else {
			return "Mi nombre es "+getNombre()+ ", tengo una edad de "+getEdad()+", habito en "+getHabitat()+" y mi genero es "+getGenero();
		}
	}
        
        //SET Y GET
	public ArrayList<Zona> getZona() {
		return zona;
	}
	public void setZona(ArrayList<Zona> zona) {
		this.zona = zona;
	}
	public static void setTotalAnimales(int ttl) {
		Animal.totalAnimales = ttl;
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales() {
		Animal.totalAnimales++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int age) {
		this.edad = age;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String hbt) {
		this.habitat = hbt;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String gdr) {
		this.genero = gdr;
	}
	public void setZona(Zona nuevaZ) {
		zona.add(nuevaZ);
	}
	
	
}