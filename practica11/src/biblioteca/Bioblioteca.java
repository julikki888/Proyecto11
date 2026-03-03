package biblioteca;

import java.util.*;

public class Bioblioteca implements InterfazBiblioteca{

	
	Set<Usuario> users;
	SortedSet<Libro> libros;

	
	
	
	public Bioblioteca(Set<Usuario> usu, SortedSet<Libro> libros) {
		this.users = new HashSet<>();
		this.libros = new TreeSet<Libro>(
					(o1,o2) -> Integer.compare(Integer.parseInt(o1.getCodigo()), Integer.parseInt(o2.getCodigo()))
				);
	}

	/**
	 * Reescritura de los metodos de la interfaz InterfazBiblioteca
	 */
	
	
	/**
	 * Método para añadir un usuario a la biblioteca
	 */
	@Override
	public boolean altaUsuario(Usuario usu) {
		return this.users.add(usu);
	}
	

	/**
	 * Método para añadir un libro a la biblioteca
	 */
	@Override
	public boolean altaLibro(Libro lib) {
		return this.libros.add(lib);
	}

	
	/**
	 *  dado un título lo busque en la colección de libros de la biblioteca y devuelva
	 *  una referencia al Libro cuyo título coincida con el indicado como parámetro,
	 *  o bien un null en caso de no encontrar ese libro. 
	 *  Este método además de devolver el libro, lo extrae de la colección de libros de la biblioteca.
	 */
	@Override
	public Libro sacarLibro(String tit) {

		
		Iterator <Libro> i = this.libros.iterator();
		Libro libro = null;
		boolean sw = false;
		
		while (i.hasNext() && !sw) {
			libro = i.next();
			if(libro.getTitulo().equals(tit)) {
				sw = true;
				i.remove();
				}			
		}
		
		if(sw) 
			return libro;
		
		return null;
	}
	

	/**
	 * busque un usuario en la colección de
	 * usuarios de la biblioteca, y devuelva una referencia al objeto usuario 
	 * cuyo nombre coincide con la cadena de caracteres dada como argumento. 
	 * Devolverá null en caso de no existir un usuario con dicho nombre. 
	 */
	@Override
	public Usuario buscarUsuario(String nom) {
		Iterator <Usuario> i = this.users.iterator();
		Usuario usu = null;
		boolean sw = false;
		
		while (i.hasNext() && !sw) {
			usu = i.next();
			if(usu.getNombre().equals(nom)) {
				sw = true;
				}			
		}
		
		if(sw) 
			return usu;
		
		return null;
	}

	
	/**
	 * que tenga el efecto esperado de un préstamo de libro (es decir, 
	 * el libro con ese título deja de estar en la colección de libros de la biblioteca y 
	 * pasa a estar en la colección de libros sacados por el usuario con el nombre indicado). 
	 * Podéis devolver un valor false, cuando algo vaya mal, por ejemplo, el usuario o el libro 
	 * no existen, y true cuando todo vaya correctamente
	 */
	@Override
	public boolean prestarLibro(String titulo, String nombre) {
		Libro libro = this.sacarLibro(titulo);
		Usuario user = this.buscarUsuario(nombre);
		
		if(user==null) return false;
		
		if(libro == null) return false;
		
		return user.sacaLibro(libro);
	}

	/**
	 * que tenga el efecto esperado	de una devolución de un Libro sacado previamente
	 * por el usuario indicado, es decir, el libro ya no estará en la colección de 
	 * libros sacados por el usuario, y volverá a la colección de libros de la biblioteca. 
	 */
	@Override
	public boolean devolverLibro(String titulo, String nombre) {
		Usuario user = this.buscarUsuario(nombre);
		
		if(user==null) return false;
		
		return this.altaLibro(user.devuelveLibro(titulo));
	}

	@Override
	public StringBuilder librosDisponibles() {
		StringBuilder str = new StringBuilder();
		for (Libro libro : libros) {
			str.append(libro.getTitulo());
			str.append("; ");
		}		
		return str;
	}

	@Override
	public StringBuilder librosPrestadosUsuario(String nombre) {
		StringBuilder str = new StringBuilder();

		for (Usuario usu : users) {
			for (Libro libro : usu.getLibros()) {
				str.append(libro.getTitulo());
				str.append("; ");
			}
		}		
		return str;
	}

	@Override
	public SortedSet<Libro> copias(String titulo) {
		
		return null;
	}

	@Override
	public Set<Libro> getLibrosUsuario(String nomCli) {
		
		return null;
	}
	
	

}
