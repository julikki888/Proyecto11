package biblioteca;

import java.util.*;

public class TestBiblioteca {

	public static void main(String[] args) {

		/**
		 * Creacion de libros
		 */
		List<String> personajes1 = new ArrayList<String>();
		personajes1.add("Don Quijote de la Mancha");
		personajes1.add("Sancho Panza");
		personajes1.add("Dulcinea del Toboso");
		personajes1.add("Rocinante");
		Libro libro1 = new Libro("0001","Don Quijote de la Mancha","Miguel de Cervantes Saavedra",
		personajes1);
		/*List<String> personajes2 = new LinkedList<String>();
		personajes2.add("Aliena");
		personajes2.add("Jack Jackson");
		personajes2.add("Regan Hamleigh");
		Libro libro2 = new Libro("0002","Los pilares de la Tierra","Ken Follet", personajes2);
		*/
		// Otra forma más corta de crear la colección de personajes
		Libro libro2 = new Libro("0002","Los pilares de la Tierra","Ken Follet",
		Arrays.asList("Aliena","Jack Jackson","Regan Hamleigh"));
		Libro libro3 = new Libro("0003","El tiempo entre costuras","María Dueñas",
		Arrays.asList("Sira Quiroga","Ramiro Arribas", "Marcus Logan"));
		Libro libro4 = new Libro("0004","El principito","Antoine de Saint-Exupary",
		Arrays.asList("The Little Prince","El vanidoso","Le renard"));
		Libro libro5 = new Libro("0005","El Señor de los Anillos","J.R.R. Tolkien",
		Arrays.asList("Gandalf","Aragorn","Frodo Bolsón","Legolas","Gollum"));
		Libro libro6 = new Libro("0006","Cien Años de Soledad","Gabriel García Márquez",
		Arrays.asList("José Arcadio Buendía","Coronel Aureliano Buendía"));
		Libro libro7 = new Libro("0007","El principito","Antoine de Saint-Exupary",
		Arrays.asList("The Little Prince","El vanidoso","Le renard"));

		/**
		 * Testeo de los metodos y clases
		 */
		System.out.println(libro1.toString());
		
		
	}

}
