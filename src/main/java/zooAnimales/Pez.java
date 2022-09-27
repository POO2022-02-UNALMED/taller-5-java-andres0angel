package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones=0;
	public static int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	public Pez() {
		listado.add(this);
	}
	
	public static int cantidadPeces() {
		return Pez.listado.size();
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.listado.add(salmon);
		Pez.salmones++;
		Animal.setTotalAnimales();
		return salmon;
	}
	public static Pez crearBacalao(String name, int age, String gnr) {
		Pez bacalao = new Pez(name, age, "oceano", gnr, "gris", 6);
		Pez.listado.add(bacalao);
		Pez.bacalaos++;
		Animal.setTotalAnimales();
		return bacalao;
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
        
        
        //SET Y GET
	public ArrayList<Pez> getListado() {
		return Pez.listado;
	}
	public void setListado(ArrayList<Pez> x) {
		Pez.listado = x;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String esc) {
		this.colorEscamas = esc;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int alt) {
		this.cantidadAletas = alt;
	}
	
}
