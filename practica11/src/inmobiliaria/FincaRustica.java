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
	private boolean luz, agua, vivienda;
	
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
	 * @param agua
	 * @param vivienda
	 */
	public FincaRustica(String codigo, EnumPropiedad tipo, String direccion, float metrosCuadrados,
			String descripcion, float precios, EnumTerreno tipoTerreno, boolean luz,
			 boolean agua, boolean vivienda) {
		super(codigo, EnumPropiedad.FINCA, direccion, metrosCuadrados, descripcion, precios);
		this.tipoTerreno = tipoTerreno;
		this.luz = luz;
		this.agua = agua;
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

	public EnumTerreno getTipoTerreno() {return tipoTerreno;}
	public boolean isLuz() {return luz;}
	public boolean isAgua() {return agua;}
	public boolean isVivienda() {return vivienda;}

	public void setTipoTerreno(EnumTerreno tipoTerreno) {this.tipoTerreno = tipoTerreno;}
	public void setLuz(boolean luz) {this.luz = luz;}
	public void setAgua(boolean agua) {this.agua = agua;}
	public void setVivienda(boolean vivienda) {this.vivienda = vivienda;}
	
	


}
