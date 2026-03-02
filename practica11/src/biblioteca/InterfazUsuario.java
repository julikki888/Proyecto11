package biblioteca;

public interface InterfazUsuario {
	
	/**
	 * Método que añada el libro a la estructura de datos donde se
	 * almacenen los libros sacados por el usuario que reciba el mensaje.
	 * @param lib
	 * @return
	 */
	boolean sacaLibro(Libro lib);
	
	/**
	 * Método que informe del número de libros sacados por el usuario.
	 * @return
	 */
	int cantidadLibrosSacados();
	
	/**
	 * Método que informe de si el usuario puede o no sacar más libros.
	 * @return
	 */
	boolean puedeSacarMasLibros();
	
	/**
	 * Método que extraiga el libro con título (tit) de la estructura de
	 * datos de libros sacados por el usuario que recibe el mensaje. 
	 * @param tit
	 * @return
	 */
	Libro devuelveLibro(String tit);
	

}
