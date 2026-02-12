package inmobiliaria;

public enum EnumPropiedad {

	LOCAL("Local comercial"),
	APARCAMIENTO("Plaza de aparcamiento"),
	VIVIENDA("Vivienda"),
	FINCA("Finca rústica"),
	SOLAR("Solar");

	private String descripcionPropiedad;
	
	private EnumPropiedad(String string) {
		this.descripcionPropiedad = string;
	}

	public String getDescripcionPropiedad() {
		return descripcionPropiedad;
	}

	
	
	
	
	
}
