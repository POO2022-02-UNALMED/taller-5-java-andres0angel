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
        public String toString() {
		return nombre;
	}
        
	public Zoologico() {
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		zona.setZoo(this);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for(Zona zona: zonas) {
			totalAnimales += zona.cantidadAnimales();
		}
		return totalAnimales;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zon) {
		this.zonas = zon;
	}
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubi) {
		this.ubicacion = ubi;
	}
	
}
