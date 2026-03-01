package inmobiliaria;

public class PruebaInmobiliaria {

	public static void main(String[] args) {


		Propiedad pro1 = new Propiedad("1", EnumPropiedad.APARCAMIENTO,"calle calvario" ,10 , "Super aparcamiento mega guay", 1000);
		
		System.out.println(pro1.toString());
		
		Inmobiliaria inmo1 = new Inmobiliaria();
		
		System.out.println(inmo1.toString());
		
		System.out.println(inmo1.getPropiedadesOrdenPrecioString());
		
		inmo1.añade(pro1);
		
		System.out.println(inmo1.toString());
		
		System.out.println(inmo1.getPropiedadesOrdenPrecioString());
		
		
	}

}
