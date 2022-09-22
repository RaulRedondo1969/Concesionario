package ventas;

import coches.Coche;

public class Ventas {

	String fechaVenta;
	String  nombreComprador;
	String nombreVendedor;
	//Clase 
 // Cada clase es independiente y tiene su propia funcionalidad
    Coche c;

	
	public Coche getC() {
		return c;
	}
	public void setC(Coche c) {
		this.c = c;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public String getNombreComprador() {
		return nombreComprador;
	}
	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	
	
	public void imprimirDatosVenta() {
		System.out.println("Datos de la operación....................................");
		this.c.imprimirDatosCoche(); // linea fundamental
		System.out.println("Datos de la venta....................................");
		System.out.println("La fecha de venta"+this.fechaVenta);
		System.out.println("El comprador del coche es..."+this.nombreComprador);
		System.out.println("El vendedor del coche es"+this.nombreVendedor);
	
		
	
	}
	
	
}
