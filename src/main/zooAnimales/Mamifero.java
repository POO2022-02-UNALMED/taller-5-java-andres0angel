package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public  static int leones;
	private Boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero,Boolean pelaje, int patas) {
            super(nombre, edad, habitat, genero);
            this.patas = patas;
            this.pelaje = pelaje;
            listado.add(this);
	}
	public static int obtenerCaballos() {
            return caballos;
	}
	public static void ponerCaballos(int caballos) {
            Mamifero.caballos = caballos;
	}
	public static int obtenerLeones() {
            return leones;
	}
	public static void ponerLeones(int leones) {
        	Mamifero.leones = leones;
	}
        
        public void ponerPelaje(Boolean pelaje) {
            this.pelaje = pelaje;
	}
	public int obtenerPatas() {
            return patas;
	}
	public void ponerPatas(int patas) {
            this.patas = patas;
	}
	public static ArrayList<Mamifero> obtenerListado() {
            return Mamifero.listado;
	}
	public static void ponerListado(ArrayList<Mamifero> listado) {
            Mamifero.listado = listado;
	}
	
        
	public Mamifero() {
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
            caballos++;
            Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
            Animal.ponerTotalAnimales();
            listado.add(caballo);
            
            return caballo;
	}
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
            leones++;
            Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
            Mamifero.listado.add(leon);
            Animal.ponerTotalAnimales();
            
            return leon;
	}
	public Boolean isPelaje() {
            return pelaje;
	}
	
	
}
