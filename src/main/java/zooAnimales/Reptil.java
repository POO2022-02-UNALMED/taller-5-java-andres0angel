package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas=0;
	public static int serpientes=0;
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
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return Reptil.listado.size();
	}
	
	public static Reptil crearIguana(String name, int age, String gnr) {
		Reptil iguana = new Reptil(name, age, "humedal", gnr, "verde", 3);
		Reptil.listado.add(iguana);
		Reptil.iguanas++;
		Animal.setTotalAnimales();
		return iguana;
	}
	public static Reptil crearSerpiente(String name, int age, String gnr) {
		Reptil serpiente = new Reptil(name, age, "jungla", gnr, "blanco", 1);
		Reptil.listado.add(serpiente);
		Reptil.serpientes++;
		Animal.setTotalAnimales();
		return serpiente;
	}
	public static int getIguanas() {
		return iguanas;
	}
	public static void setIguanas(int ig) {
		Reptil.iguanas = ig;
	}
	public static int getSerpientes() {
		return serpientes;
	}
	public static void setSerpientes(int ser) {
		Reptil.serpientes = ser;
	}
	public ArrayList<Reptil> getListado() {
		return Reptil.listado;
	}
	public void setListado(ArrayList<Reptil> lst) {
		Reptil.listado = lst;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largo) {
		this.largoCola = largo;
	}
}
