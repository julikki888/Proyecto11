package inmobiliaria;

import java.util.*;

public class Inmobiliaria implements GestionInmobiliaria {

	/*
	 * esta clase almacenará una colección de las propiedades que la
		inmobiliaria tiene a la venta. La colección debe estar ordenada de forma ascendente por el código de la
		propiedad, y no debe permitir que haya dos propiedades con el mismo código. Utiliza la colección que
		estimes más conveniente. 
	 */
	
	
	SortedSet<Propiedad> propiedades;
	
	
	public Inmobiliaria(TreeSet<Propiedad> c) {
		this.propiedades.addAll(c);
	}
	
	public Inmobiliaria() {
		this.propiedades = new TreeSet<Propiedad>(
				(o1,o2) ->
					o1.getCodigo().compareTo(o2.getCodigo())); 
	}
	
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public SortedSet<Propiedad> getPropiedades() {return propiedades;}
	public void setPropiedades(SortedSet<Propiedad> propiedades) {this.propiedades = propiedades;}

	
	/**
	 * Metodos reescritos de la interfaz GestionInmobiliaria
	 */
	
	/**
	 * Método al cual le llegue una propiedad y la añada a la
	 * 		colección de propiedades que mantiene la inmobiliaria.
	 * @param ob
	 * @return
	 */
	@Override
	public boolean añade(Propiedad ob) {
		return this.propiedades.add(ob);
	}
	
	
	/**
	 * Método que permita buscar una propiedad a partir de su
		código en la colección
	 * @param cod
	 * @return
	 */
	@Override
	public Propiedad buscar(int cod) {
		Propiedad aux = null;
	
		for (Iterator <Propiedad> i = propiedades.iterator(); i.hasNext() && aux == null;) {
			Propiedad propiedad = i.next();
			if(propiedad.getCodigo().equals(Integer.toString(cod))) {
				aux = propiedad;
			}			
		}		
		return aux;
	}
	
	/**
	 * Método que comprueba si una determinada propiedad
		existe en la colección.	
	 * @param p
	 * @return
	 */
	@Override
	public boolean buscar(Propiedad p) {
		return this.propiedades.contains(p);
	}
	
	/**
	 * Método que permita borrar una propiedad a partir de su código
	 * @param cod
	 * @return
	 */	
	@Override
	public boolean borra(int cod) {
		Propiedad aux = null;
		
		for (Iterator <Propiedad> i = propiedades.iterator(); i.hasNext() && aux == null;) {
			Propiedad propiedad = i.next();
			if(propiedad.getCodigo().equals(Integer.toString(cod))) {
				aux = propiedad;
			}			
		}		
		return this.propiedades.remove(aux);
	}
	
	/**
	 * Método que permita borrar una propiedad a partir del
		objeto Propiedad
	 * @param p
	 * @return
	 */
	@Override
	public boolean borra(Propiedad p) {
		return this.propiedades.remove(p);
	} 
	
	
	public List<Propiedad> getPropiedadesOrdenPrecio(){
		
		List<Propiedad> lista = new LinkedList<>(this.propiedades);
		
		lista.sort((o1,o2) ->Float.compare(o1.getPrecios(), o2.getPrecios()));
		
		return lista; 
		
	}
	
	
	@Override
	public String toString() {
		
		return this.propiedades.toString();
	}

	
	public String getPropiedadesOrdenPrecioString() {
		List<Propiedad> lista = new LinkedList<>(this.getPropiedadesOrdenPrecio());
		String aux= "LISTA ORDENADA POR PRECIO";
		
		for (Propiedad propiedad : lista) {
			aux += "\n"+propiedad.getCodigo()+" - "+propiedad.getPrecios()+" - "+propiedad.getTipo();
		}
				
		return aux;
	}
	
}
