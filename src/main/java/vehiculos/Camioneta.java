package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int cant = 0;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.plusCant();
	}
	
	public boolean isVolco() {
		return volco;
	}
	
	public void setVolvo(boolean volco) {
		this.volco = volco;
	}
	
	public static int getCant() {
		return cant;
	}
	
	public static void plusCant() {
		cant++;
	}
}