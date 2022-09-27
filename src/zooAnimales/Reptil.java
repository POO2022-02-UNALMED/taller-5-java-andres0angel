package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero,  String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	public Reptil() {
		listado.add(this);
	}
        
        public static int obtenerIguanas() {
		return iguanas;
	}
        public static int obtenerSerpientes() {
		return serpientes;
	}
        public ArrayList<Reptil> obtenerListado() {
		return Reptil.listado;
	}
        public String obtenerColorEscamas() {
		return colorEscamas;
	}
        
	public static void ponerIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}
	
	public static void ponerSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}
	
	public void ponerListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	
	public void ponerColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void ponerLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return Reptil.listado.size();
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		Reptil.listado.add(iguana);
		Reptil.iguanas++;
		Animal.ponerTotalAnimales();
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		Reptil.listado.add(serpiente);
		Reptil.serpientes++;
		Animal.ponerTotalAnimales();
		return serpiente;
	}
	
}
