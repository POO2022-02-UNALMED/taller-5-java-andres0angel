package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
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
        
        //SET Y GET
        public ArrayList<Pez> obtenerListado() {
		return Pez.listado;
	}
	public void ponerListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public String obtenerColorEscamas() {
		return colorEscamas;
	}
	public void ponerColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int obtenerCantidadAletas() {
		return cantidadAletas;
	}
	public void ponerCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static int cantidadPeces() {
		return Pez.listado.size();
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
                Pez.salmones++;
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.listado.add(salmon);
		Animal.ponerTotalAnimales();
                
		return salmon;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
                Pez.bacalaos++;
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.listado.add(bacalao);
		
		Animal.ponerTotalAnimales();
                
		return bacalao;
	}
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	
}
