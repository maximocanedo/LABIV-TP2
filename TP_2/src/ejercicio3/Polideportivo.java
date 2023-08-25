package ejercicio3;

public class Polideportivo extends Estructura implements InstalacionDeportiva, Edificio {
	private String nombre;
	private int tipo;
	
	public Polideportivo(String nombre,double ancho,double largo,int tipo)
	{
		super(ancho,largo);
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public Polideportivo(String nombre,double ancho,double largo)
	{
		this(nombre,ancho,largo,0);
	}
	public Polideportivo(String nombre) {
		this(nombre,0,0);
	}
	public Polideportivo() {
		this("Polideportivo sin nombre");
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return getAncho() * getLargo();
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Nombre del Polideportivo: "+this.nombre+ ", Tipo: "+this.tipo+". "+super.toString();
	}
	
	
	/*private String nombre;
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
*/
}
