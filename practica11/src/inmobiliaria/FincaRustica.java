package inmobiliaria;

public class FincaRustica extends Propiedad{

	/**
	 * Variables de clase constantes
	 */
	
	public static final float PORCENTAJE_FINCA = 0.0075f;
	
	/**
	 * Variables de instancia
	 */
	
	private EnumTerreno tipoTerreno;
	private boolean luz, agus, vivienda;
	
	/**
	 * Constructor completo
	 * 
	 * @param codigo
	 * @param tipo
	 * @param direccion
	 * @param metrosCuadrados
	 * @param descripcion
	 * @param precios
	 * @param tipoTerreno
	 * @param luz
	 * @param agus
	 * @param vivienda
	 */
	public FincaRustica(String codigo, EnumPropiedad tipo, String direccion, float metrosCuadrados,
			String descripcion, float precios, EnumTerreno tipoTerreno, boolean luz,
			 boolean agus, boolean vivienda) {
		super(codigo, EnumPropiedad.FINCA, direccion, metrosCuadrados, descripcion, precios);
		this.tipoTerreno = tipoTerreno;
		this.luz = luz;
		this.agus = agus;
		this.vivienda = vivienda;
	}
	
	/**
	 * Override del metodo beneficio añadiendo un al beneficio inicial un
	 * 0.75% sobre el valor de la finca.
	 * @return float
	 */
	@Override
	public float beneficio() {
		return super.beneficio() + (this.getPrecios()*PORCENTAJE_FINCA);
	}
	
	


}
