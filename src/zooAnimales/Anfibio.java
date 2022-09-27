package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private Boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return Anfibio.listado.size();
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(rana);
		Anfibio.ranas++;
		Animal.ponerTotalAnimales();
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.listado.add(salamandra);
		Anfibio.salamandras++;
		Animal.ponerTotalAnimales();
		return salamandra;
	}
	public static int obtenerRanas() {
		return ranas;
	}

	public static void ponerRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int obtenerSalamandras() {
		return salamandras;
	}

	public static void ponerSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}

	

	public ArrayList<Anfibio> obtenerListado() {
		return Anfibio.listado;
	}

	public void ponerListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String obtenerColorPiel() {
		return colorPiel;
	}

	public void ponerColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public Boolean isVenenoso() {
		return venenoso;
	}

	public void ponerVenenoso(Boolean venenoso) {
		this.venenoso = venenoso;
	}
        
        @Override
	public String movimiento() {
		return "saltar";
	}
	
	
}
