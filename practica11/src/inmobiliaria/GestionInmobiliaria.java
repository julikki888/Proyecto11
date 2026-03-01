package inmobiliaria;

public interface GestionInmobiliaria {
	
	
	/**
	 * Método al cual le llegue una propiedad y la añada a la
	 * 		colección de propiedades que mantiene la inmobiliaria.
	 * @param ob
	 * @return
	 */
	public boolean añade(Propiedad ob);

	
	/**
	 * Método que permita buscar una propiedad a partir de su
		código en la colección
	 * @param cod
	 * @return
	 */
	public Propiedad buscar(int cod);
	
	/**
	 * Método que comprueba si una determinada propiedad
		existe en la colección.	
	 * @param p
	 * @return
	 */
	public boolean buscar(Propiedad p);
	
	
	/**
	 * Método que permita borrar una propiedad a partir de su código
	 * @param cod
	 * @return
	 */
	public boolean borra(int cod);
	
	
	/**
	 * Método que permita borrar una propiedad a partir del
		objeto Propiedad
	 * @param p
	 * @return
	 */
	public boolean borra(Propiedad p);
	
}
