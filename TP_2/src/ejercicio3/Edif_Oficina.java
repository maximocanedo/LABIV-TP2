package ejercicio3;

public class Edif_Oficina implements Edificio {

	private int Cant_Oficinas;
	private double ancho;
	private double largo;

	public Edif_Oficina() {
		this.ancho = 40.0;
		this.largo = 40.0;
		this.Cant_Oficinas = 1;	
	}
	
	public Edif_Oficina(int cantidad,double anc,double larg) {
		this.ancho = anc;
		this.largo = larg;
		this.Cant_Oficinas = cantidad;
	}
	
	@Override
	public double getSuperficieEdificio()
	{
		return getAncho() * getLargo();
	}
	
	public int getCant_Oficinas() {
		return Cant_Oficinas;
	}

	public void setCant_Oficinas(int cant_Oficinas) {
		Cant_Oficinas = cant_Oficinas;
	}

	@Override
	public String toString() {
		return "Este edificio posee "+ Cant_Oficinas + " Oficinas, con una superficie de "+ getSuperficieEdificio() +" metros cuadrados";
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	
}
