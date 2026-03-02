package biblioteca;

import java.util.*;

public class Usuario implements InterfazUsuario{

	static final int TOPE = 10;
	
	/**
	 * Variables de instancia
	 */
	private String nombre;
	private Set<Libro> libros;
	
	/**
	 * Constructor
	 * @param nombre
	 */
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.libros = new HashSet<>();
	}

	/**
	 * Getters and Setters
	 * @return
	 */
	public String getNombre() {return nombre;}
	public Set<Libro> getLibros() {return libros;}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setLibros(Set<Libro> libros) {this.libros = libros;}


	/**
	 * Metodos reescritos de la interfaz InterfazUsuario.
	 */
	
	/**
	 * Método que añada el libro lib al conjunto de libros sacados
	 * por el usuario que reciba el mensaje
	 * @param lib
	 * @return boolean
	 */
	@Override
	public boolean sacaLibro(Libro lib) {
		
		if (!this.puedeSacarMasLibros())
			return false;
		
		return this.libros.add(lib);
	}
	
	/**
	 * Devuelve la cantidad de libros del usuario
	 */
	@Override
	public int cantidadLibrosSacados() {
		return this.libros.size();
	}

	/**
	 *  El usuario no podrá sacar más de 10 libros.
	 */
	@Override
	public boolean puedeSacarMasLibros() {
		return cantidadLibrosSacados() < TOPE;
	}

	/**
	 * Método que extraiga el libro con título tit del conjunto de libros sacados 
	 * por el usuario que recibe el mensaje. 
	 * Dicho libro será devuelto como resultado del método; 
	 * 		si el libro no ha sido sacado por dicho usuario debe devolverse null
	 */
	@Override
	public Libro devuelveLibro(String tit) {
		Libro libro = null; 
		boolean sw=true;
		
		for (Iterator<Libro> i = libros.iterator(); i.hasNext() && sw;) {
			libro = i.next();
			if(libro.getTitulo().equals(tit)) {
				i.remove();
				sw=false;
			}
		}		
		return libro;
	}

	
	
	/**
	 * Redefinicion del equals y hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return this.nombre.equalsIgnoreCase(other.nombre);
		
	}
	
	/**
	 * Redefinicion del toString
	 */
	@Override
	public String toString() {
		String str =" (";
		
		for (Libro libro : libros) {
			str += libro.getTitulo()+"; ";
		}
		
		return this.nombre+(this.cantidadLibrosSacados()>0?str+")":"(No tiene libros sacados)");
	}	
}
