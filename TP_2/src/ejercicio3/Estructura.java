package ejercicio3;

public abstract class Estructura {
	
	private double ancho;
	private double largo;
	
	public Estructura(double ancho,double largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	public Estructura()
	{
		this.ancho = 10;
		this.largo = 10;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho >= 0 ? ancho : 0;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo >= 0 ? largo : 0;
	}

	@Override
	public String toString() {
		return " Posee un Ancho de: "+this.ancho +", y un Largo de: "+this.largo;
	}
	
	

}
