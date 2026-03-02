package inmobiliaria;

public class PruebaInmobiliaria {

	public static void main(String[] args) {


		Propiedad pro1 = new Propiedad("1", EnumPropiedad.APARCAMIENTO,"calle calvario" ,10 , "Super aparcamiento mega guay", 1000);
		Propiedad pro2 = new Propiedad("2", EnumPropiedad.FINCA,"calle nhhh" ,10 , "Saparca miento mega", 991000);
		Propiedad pro3 = new Propiedad("3", EnumPropiedad.LOCAL,"calle sdd" ,10 , "Super mega guay", 51000);
		Propiedad pro4 = new Propiedad("4", EnumPropiedad.SOLAR,"calle assA" ,10 , "Sgay", 2500);

		System.out.println(pro1.toString());
		
		Inmobiliaria inmo1 = new Inmobiliaria();
		
		inmo1.añade(pro1);
		inmo1.añade(pro4);
		inmo1.añade(pro3);
		inmo1.añade(pro2);
				
		System.out.println("\n"+inmo1.getPropiedadesOrdenPrecioString());
		
		System.out.println("\n"+inmo1.buscar(pro3));
		System.out.println("\n"+inmo1.buscar(2));
		
		
		
	}

}
