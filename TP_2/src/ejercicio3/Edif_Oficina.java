package ejercicio3;

public class Edif_Oficina extends Estructura implements Edificio {

	private int Cant_Oficinas;
	

	public Edif_Oficina() {
		super();
		this.Cant_Oficinas = 1;	
	}
	
	public Edif_Oficina(int cantidad,double anc,double larg) {
		super(anc,larg);
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
		Cant_Oficinas = cant_Oficinas >= 0 ? cant_Oficinas : 0;
	}

	@Override
	public String toString() {
		return "Este edificio posee "+ this.Cant_Oficinas+" Oficinas"+ super.toString();
	}
}
