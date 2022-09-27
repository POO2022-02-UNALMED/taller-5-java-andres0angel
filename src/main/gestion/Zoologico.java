package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();;
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
	}
	
        //METODOS SET Y GET
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		zona.ponerZoo(this);
	}
	
	public ArrayList<Zona> obtenerZonas() {
		return zonas;
	}
	public void ponerZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	public ArrayList<Zona> obtenerZona(){
		return zonas;
	}
	public String obtenerNombre() {
		return nombre;
	}
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	public String obtenerUbicacion() {
		return ubicacion;
	}
	public void ponerUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
        
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for(Zona zona: zonas) {
			totalAnimales += zona.cantidadAnimales();
		}
		return totalAnimales;
	}
        
        @Override
	public String toString() {
		return nombre;
	}
}
