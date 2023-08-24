package ejercicio3;

public class Polideportivo implements InstalacionDeportiva, Edificio {
	private String nombre;
	private double superficie;
	private int tipo;
	public Polideportivo(String nombre, double superficie, int tipo) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.tipo = tipo;		
	}
	public Polideportivo(String nombre, double superficie) {
		this(nombre, superficie, 0);
	}
	public Polideportivo(String nombre) {
		this(nombre, 0);
	}
	public Polideportivo() {
		this("Polideportivo sin nombre");
	}
	
	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return this.superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

}
