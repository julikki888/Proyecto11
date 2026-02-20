package inmobiliaria;

import java.util.Objects;

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

	/**
	 * Dos propiedades son iguales si coincide el codigo
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propiedad other = (Propiedad) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	/**
	 * Redifinicion del metodo toString
	 * 
	 * LOCAL COMERCIAL
			Beneficio obtenido: 600.0€
			Código: 23
			Superficie: 70.0 metros cuadrados
			Descripción: El local no tiene baño e instalaciones de agua, luz y teléfono
			Dirección: C/Infante, 45
			Precio: 60000.0 €
	 */
	@Override
	public String toString() {
		return this.getTipo().toString()
				+ "\nBeneficio obtenido "+this.beneficio()+"€"
				+ "\nCodigo: "+this.getCodigo()
				+ "\nSuperficie: "+this.getMetrosCuadrados()+ " m²"
				+ "\nDescripcion: "+this.getDescripcion()
				+ "\nDireccion: "+this.getDireccion()
				+ "\nPrecio: "+ this.getPrecios()+"€";
	}
	
	
	
	
	
	
}
