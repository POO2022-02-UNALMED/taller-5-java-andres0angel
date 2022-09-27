package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private Boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
                Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);

	}
        public Anfibio() {
		listado.add(this);
                Animal.setTotalAnimales(Animal.getTotalAnimales() + 1);
	}
        
        
        
        public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int sal) {
		Anfibio.salamandras = sal;
	}
        
        public ArrayList<Anfibio> getListado() {
		return Anfibio.listado;
	}

	public void setListado(ArrayList<Anfibio> lst) {
		Anfibio.listado = lst;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String piel) {
		this.colorPiel = piel;
	}

	public Boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(Boolean vene) {
		this.venenoso = vene;
	}

	
	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(rana);
		Anfibio.ranas++;
		Animal.setTotalAnimales();
		return rana;
	}
	public static Anfibio crearSalamandra(String name, int age, String gnr) {
		Anfibio salamandra = new Anfibio(name, age, "selva", gnr, "negro y amarillo", false);
		Anfibio.listado.add(salamandra);
		Anfibio.salamandras++;
		Animal.setTotalAnimales();
		return salamandra;
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}

	
	
	
}
