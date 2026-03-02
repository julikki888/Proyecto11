package biblioteca;

import java.util.*;

public class Libro {

	
	private String codigo, titulo, autor;
	private List<String> personajes;
	
	/**
	 * a) Un constructor con un código, un título, un autor y una lista de personajes como argumento.
	 */
	public Libro(String codigo, String titulo, String autor, List<String> personajes) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.personajes = personajes;	
	}
	public Libro(String codigo, String titulo, String autor) {
		this(codigo, titulo, autor, new ArrayList<>());
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */

	public String getCodigo() {return codigo;}
	public String getTitulo() {return titulo;}
	public String getAutor() {return autor;}
	public List<String> getPersonajes() {return personajes;}

	public void setCodigo(String codigo) {this.codigo = codigo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setAutor(String autor) {this.autor = autor;}
	public void setPersonajes(List<String> personajes) {this.personajes = personajes;}

	/**
	 * equals y hascode
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(Integer.parseInt(codigo));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(Integer.parseInt(codigo),Integer.parseInt(other.codigo));
	}
	
	
	@Override
	public String toString() {
		return this.codigo+": "+this.titulo+" (escrito por "+this.autor+" "+this.personajes+")";
	}
	

	

}
