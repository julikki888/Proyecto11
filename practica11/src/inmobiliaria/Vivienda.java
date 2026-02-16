package inmobiliaria;

/**
 * 	Clase Vivienda
 * @author Julian
 */

public class Vivienda extends Propiedad{
	/**
	 * Variables de clase constantes
	 */
	
	public static final float PORCENTAJE_VIVIENDA = 0.0025f;
	
	/**
	 * Variables de Instancia
	 */
	private EnumViviendas tipoVivienda;
	private int numBaños, numDormitorios;
	
	/**
	 * Constructor completo
	 * @param codigo
	 * @param tipo
	 * @param direccion
	 * @param metrosCuadrados
	 * @param descripcion
	 * @param precios
	 * @param tipoVivienda
	 * @param numBaños
	 * @param numDormitorios
	 */
	
	public Vivienda(String codigo, EnumPropiedad tipo, String direccion, float metrosCuadrados, 
			String descripcion,	float precios, EnumViviendas tipoVivienda, int numBaños,
			 int numDormitorios) {
		super(codigo, tipo, direccion, metrosCuadrados, descripcion, precios);
		this.tipoVivienda = tipoVivienda;
		this.numBaños = numBaños;
		this.numDormitorios = numDormitorios;
	}

	/**
	 * Override del metodo beneficio añadiendo un al beneficio inicial un
	 * 0.25% sobre el valor de la vivienda.
	 * @return float
	 */
	@Override
	public float beneficio() {
		return super.beneficio() + (this.getPrecios()*PORCENTAJE_VIVIENDA);
	}
	
	
}
