package coches;

public class Coche {
	
	public Coche() {}// constructor vacio
	

	public Coche(String marca, String modelo, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

//propiedades
	private String marca;
	private String modelo;
	private int precio;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void imprimirDatosCoche() {
		System.out.println("Datos del coche :....................................");
		System.out.println("La marca del coche es..."+this.marca);
		System.out.println("El modelo del coche es..."+this.modelo);
		System.out.println("El precio del coche es..."+this.precio);
	
	}
	
	
	
	
	
}
