package principal;

import coches.Coche;
import ventas.Ventas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		/*Coche c = new Coche();
		c.setMarca("BMW");
		c.setModelo("XZ20");
		c.setPrecio(1000);
		//c.imprimirDatosCoche();
		Ventas v = new Ventas(); // constructor vacio
		v.setC(c);
		v.setFechaVenta("21/09/2022");
		v.setNombreComprador("Raul");
		v.setNombreVendedor("Oscar");
		v.imprimirDatosVenta();*/
		
		Coche c1 = new Coche();
		c1.setMarca("AUDI");
		c1.setModelo("a3");
		c1.setPrecio(1000);
		
		Ventas v2 = new Ventas(); // constructor vacio
		v2.setC(c1);
		v2.setFechaVenta("22/09/2022");
		v2.setNombreComprador("Raul");
		v2.setNombreVendedor("Oscar");
		v2.imprimirDatosVenta();
		
		
		
		
		
		
		
		

	}

}
