package inmobiliaria;

public class Propiedad {
	
	/**
	 * Variables de clase constnates
	 */
	
	public static final float PORCENTAJE = 0.0075f;
	public static final float GASTO_GESTION = 150f;
	
	/**
	 * Variables de instancia
	 */
	private String codigo;
	private EnumPropiedad tipo;
	private String direccion;
	private float metrosCuadrados;
	private String descripcion;
	private float precios;
	
	/**
	 * Constructor completo
	 * @param codigo
	 * @param tipo
	 * @param direccion
	 * @param metrosCuadrados
	 * @param descripcion
	 * @param precios
	 */
	
	public Propiedad(String codigo, EnumPropiedad tipo, String direccion, float metrosCuadrados, String descripcion,
			float precios) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.descripcion = descripcion;
		this.precios = precios;
	}

	/**
	 * Getters y Setters	
	 * @return
	 */
	public String getCodigo() {return codigo;}
	public EnumPropiedad getTipo() {return tipo;}
	public String getDireccion() {return direccion;}
	public float getMetrosCuadrados() {return metrosCuadrados;}
	public String getDescripcion() {return descripcion;}
	public float getPrecios() {return precios;}
	
	public void setCodigo(String codigo) {this.codigo = codigo;}
	public void setTipo(EnumPropiedad tipo) {this.tipo = tipo;}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	public void setMetrosCuadrados(float metrosCuadrados) {this.metrosCuadrados = metrosCuadrados;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	public void setPrecios(float precios) {this.precios = precios;}
	
	
	/**
	 * Método que calcule el beneficio
	 * @return float
	 * Sobre la venta de cada propiedad la inmobiliaria obtiene un beneficio que en la mayoría de los
	 *	casos es del 0.75% sobre el valor de la propiedad más 150 € de gastos de gestoría.
	 */
	
	public float beneficio () {
		return (float)(this.precios * PORCENTAJE) + GASTO_GESTION;
	}
	
	
	
	
	
	
}
